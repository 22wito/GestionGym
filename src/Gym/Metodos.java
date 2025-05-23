package Gym;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class Metodos {
	
	
	public static int agregarUsuario(String nombre, int edad, int peso, int altura, String nombreUsuario, String password, String email, int telefono) {		//Datos de entrada
		ConexionMySQL conexion = new ConexionMySQL("root", "", "gym");																							//Conecta a la BD
		LocalDateTime hoy = LocalDateTime.now();
		String fechaSQL = hoy.getYear() + "/" + hoy.getMonthValue() + "/" + hoy.getDayOfMonth();
	

		try {
			conexion.conectar();
			
			String sentencia = "SELECT nombreUsuario FROM cuentas WHERE nombreUsuario = '" + nombreUsuario + "';";				//Selecciona el nombre de usuario introducido
			ResultSet rs = conexion.ejecutarSelect(sentencia);
			
			
			
			if (!rs.next()) {																									//Comprueba que no exista eicho usuario
				
				sentencia = "INSERT INTO cuentas (nombreUsuario, password, email, telefono) "
						+ "VALUES ('" + nombreUsuario + "','" + password + "','" + email + "'," + telefono+ ");";		//Inserta los datos introducidos en la tabla cuentas (información de la cuenta)
				
				conexion.ejecutarInsertDeleteUpdate(sentencia);
				
				sentencia = "SELECT id2 FROM cuentas"																	//Inserta los datos introducidos en la tabla usuario (información del usuario)
						+ " WHERE email ='" + email + "';";
				
				rs = conexion.ejecutarSelect(sentencia);
				rs.next();
				int id2 = rs.getInt("id2");
				
				sentencia = "INSERT INTO usuarios (id2, nombre, edad, peso, altura, fechaRegistro, entrenando) "		//
						+ "VALUES (" + id2 + ",'" + nombre + "'," + edad + "," + peso + "," + altura + ", '" + fechaSQL + "', false);";
				
				
				
				conexion.ejecutarInsertDeleteUpdate(sentencia);
				return id2;																								//Sidevuelve el id, todo está correcto
			}else {
				
				System.out.println("Eso ya existe máquina");
				return -1;																								//Si devuelve return se debe avisar de que el usuario ya existe
			}
			
			
			
		} catch (SQLException e) {

			e.printStackTrace();
			return -1;																									//Si devueve 0, ha ocurrido un error inesperado (intentarlo de nuevo)
		}
	
	
	}
		
	public static int inicioSesion(String nombreUsuario, String password) {
	
	ConexionMySQL conexion  = new ConexionMySQL("root", "", "gym");
	
	try {
		
		conexion.conectar();
		String sentencia = "SELECT nombreUsuario, password FROM cuentas "
				+ "WHERE nombreUsuario = '" + nombreUsuario + "' AND password = '" + password + "';";			//Selecciona los nombres de usuario iguales al introducido en la tabla cuentas
		ResultSet rs = conexion.ejecutarSelect(sentencia);	
		
		if(rs.next()) {

			sentencia = "SELECT id2 FROM cuentas WHERE nombreUsuario ='" + nombreUsuario + "';";						//Selecciona el id relacionado a dicho nombre de usuario
			rs = conexion.ejecutarSelect(sentencia);
			rs.next();
			int id2 = rs.getInt("id2");
			return id2;																					//Devuelve el id de usuario para guardar en una constante y poder utilizarla para el resto de necesidades
			
		}else {
			sentencia = "SELECT nombreUsuario FROM cuentas WHERE nombreUsuario = '" + nombreUsuario + "';";
			rs = conexion.ejecutarSelect(sentencia);
			boolean user = rs.next();
			
			sentencia = "SELECT nombreUsuario, password FROM cuentas "									//Selecciona los usuarios que coincidan con el nombre de usuario introducido pero con contraseña diferente
					+ "WHERE nombreUsuario = '" + nombreUsuario + "' AND password != '" + password + "';";
			rs = conexion.ejecutarSelect(sentencia);
			boolean pass = rs.next();
			
			if(user == false) {
				
				System.out.println("El usuario introducido no existe");									//Si el usuario no existe, lo imprime por consola
				
				
			}else if(pass == true) {
				
				System.out.println("Contraseña incorrecta");
			}
			return -1;																									//Si devuelve -1, No existe nombre de usuario, Mensaje de error, usuario ya existe
		}
		
		
		
		
	}catch (SQLException e) {
		
		e.printStackTrace();
		return 0;																										//Si devuelve 0, informar de un error desconocido
	}
	}

	public static String Aforo() {
		
		
		ConexionMySQL conexion = new ConexionMySQL("root", "", "gym") ;
		
		try {
			conexion.conectar();
			
			String sentencia = "SELECT count(Entrenando) AS 'total' FROM usuarios WHERE entrenando = 1;";				//Selecciona los que están entrenando
			ResultSet rs = conexion.ejecutarSelect(sentencia);
			rs.next();
			int aforo = rs.getInt("total");
			
			if (aforo < 50) {																							//Comprueba si hay hueco
				
				return (aforo*100)/50 + "%";																			//Devuelve el aforo en porcentaje
			}else {			
				
				return "El Gimnasio está lleno";																		//imprime que el gimnasio está lleno
			}
		} catch (SQLException e) {

			e.printStackTrace();
			return null;
		}
	}
	
	public static double calcularIMC(int idUsuario) {
		
		ConexionMySQL conexion = new ConexionMySQL("root", "", "gym") ;
		
		try {
			conexion.conectar();
			
			String sentencia = "SELECT altura AS 'Altura' FROM usuarios WHERE id2 =" + idUsuario + ";";		//Selecciona la altura del id de usuario introducido
			ResultSet rs = conexion.ejecutarSelect(sentencia);
			rs.next();
			double altura = rs.getInt("Altura");
			altura = altura/100;
			
			sentencia = "SELECT Peso 'Peso' FROM usuarios WHERE id2 =" + idUsuario + ";";					//Selecciona el peso del id de usuario introducido
			rs = conexion.ejecutarSelect(sentencia);
			rs.next();
			
			int peso = rs.getInt("Peso");
			
			if (altura != 0 && peso != 0) {												//Se comprueba si los datos obtenidos son válidos
				double imc = peso/(altura * altura); 
				return imc;
			}else {
				return 1;						//En caso de devolver 1, avisar de que faltan datos de altura o peso.
			}
			
			
		} catch (SQLException e) {

			e.printStackTrace();
			return 0;							//En caso de devolver 0, avisar de que ha ocurrido un error desconocido.
		}
		
	}
	
	public static String infoUsuario(int idUsuario) {
		
		ConexionMySQL conexion = new ConexionMySQL("root", "", "gym") ;
		
		try {
			conexion.conectar();
			
			String sentencia = "SELECT nombre, edad, peso, altura, fecharegistro FROM usuarios WHERE id2 = " + idUsuario + ";";			//Selecciona la información de salud del usuario que ha iniciado sesión
			ResultSet rs = conexion.ejecutarSelect(sentencia);
			rs.next();
			return "Nombre: " + rs.getString("Nombre") + 
			"Edad: " + rs.getString("Edad") +
			"Peso: " + rs.getString("Peso") +
			"Altura: " + rs.getString("Altura") +
			"FechaRegistro: " + rs.getString("FechaRegistro");																			//Imprime los datos recogidos
			
			
		} catch (SQLException e) {

			e.printStackTrace();
			return null;
		}
		
	}

	public static String getNombre(int idUsuario) {
		
		
		ConexionMySQL conexion = new ConexionMySQL("root", "", "gym") ;
		
		try {
			conexion.conectar();
			
			String sentencia = "SELECT nombre FROM usuarios WHERE id2 = " + idUsuario + ";";							//Selecciona el nombre del usuario que ha iniciado sesión
			ResultSet rs = conexion.ejecutarSelect(sentencia);
			rs.next();
			String nombre = rs.getString("Nombre"); 													
			
			return nombre;																								//Devuelve el nombre del usuario
			
		} catch (SQLException e) {

			e.printStackTrace();
			return null;
		}
		
	}

	public static void setEntrenando(int idUsuario) {
		
		ConexionMySQL conexion = new ConexionMySQL("root", "", "gym") ;
		
		try {
			conexion.conectar();
			
			String sentencia = "SELECT entrenando FROM usuarios WHERE id2 = " + idUsuario + ";";						//Selecciona el estado de entrenamiento del usuario que ha iniciado sesión
			ResultSet rs = conexion.ejecutarSelect(sentencia);
			rs.next();
			boolean estado = rs.getBoolean("entrenando");
			
			if(estado) {																								//Comprobamos estado de enrtenamiento y lo alternamos
				
				sentencia = "UPDATE usuarios SET entrenando = 0 WHERE id2 =" + idUsuario + ";";							
				conexion.ejecutarInsertDeleteUpdate(sentencia);
			}else {
				
				sentencia = "UPDATE usuarios SET entrenando = 1 WHERE id2 =" + idUsuario + ";";
				conexion.ejecutarInsertDeleteUpdate(sentencia);
			}
			
			
		
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	public static boolean getEntrenando(int idUsuario) {
		
		ConexionMySQL conexion = new ConexionMySQL("root", "", "gym") ;
		
		try {
			conexion.conectar();
			
			String sentencia = "SELECT entrenando FROM usuarios WHERE id2 = " + idUsuario + ";";					//Selecciona el estado de entrenamiento del usuario que ha iniciado sesión
			ResultSet rs = conexion.ejecutarSelect(sentencia);
			rs.next();
			boolean estado = rs.getBoolean("entrenando");
			
			return estado;
			
			
		
			
		} catch (SQLException e) {

			e.printStackTrace();
			return false;
		}
	}
	
	public static String getEmail(int idUsuario) {		
		
		ConexionMySQL conexion = new ConexionMySQL("root", "", "gym") ;
		
		try {
			conexion.conectar();
			
			String sentencia = "SELECT email FROM cuentas WHERE id2 = " + idUsuario + ";";								//Selecciona el E-mail del usuario que ha iniciado sesión
			ResultSet rs = conexion.ejecutarSelect(sentencia);
			rs.next();
			String email = rs.getString("email"); 				
			
			return email;																								//Devuelve el E-mail 
				
		} catch (SQLException e) {

			e.printStackTrace();
			return null;
		}
		
	}
	
	public static String getRegistro(int idUsuario) {
		
		
		ConexionMySQL conexion = new ConexionMySQL("root", "", "gym") ;
		
		try {
			conexion.conectar();
			
			String sentencia = "SELECT fechaRegistro FROM usuarios WHERE id2 = " + idUsuario + ";";						//Selecciona la fecha de registro del usuario que ha iniciado sesión
			ResultSet rs = conexion.ejecutarSelect(sentencia);
			rs.next();
			String fecha = rs.getString("fechaRegistro"); 
			
			return fecha;																								//Devuelve 
			
		} catch (SQLException e) {

			e.printStackTrace();
			return null;
		}
		
	}
	
	public static String getNumero(int idUsuario) {
		
		
		ConexionMySQL conexion = new ConexionMySQL("root", "", "gym") ;
		
		try {
			conexion.conectar();
			
			String sentencia = "SELECT telefono FROM cuentas WHERE id2 = " + idUsuario + ";";							//Selecciona el número de teléfono del usuario que ha iniciado sesión
			ResultSet rs = conexion.ejecutarSelect(sentencia);
			rs.next();
			String telefono = rs.getString("telefono"); 																
			
			return telefono;																							//devuelve el número de teléfono
			
		} catch (SQLException e) {

			e.printStackTrace();
			return null;
		}
		
	}
	
	
	
	
	
	
	
}