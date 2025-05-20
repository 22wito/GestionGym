package Gym;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class Metodos {
	
	
	public static int agregarUsuario(String nombre, int edad, int peso, int altura, String nombreUsuario, String password, String email, int telefono) {
		ConexionMySQL conexion = new ConexionMySQL("root", "", "gym");
		LocalDateTime hoy = LocalDateTime.now();
		String fechaSQL = hoy.getYear() + "/" + hoy.getMonthValue() + "/" + hoy.getDayOfMonth();
	

		try {
			conexion.conectar();
			
			String sentencia = "SELECT nombreUsuario FROM cuentas WHERE nombreUsuario = '" + nombreUsuario + "';";
			ResultSet rs = conexion.ejecutarSelect(sentencia);
			rs.next();
			System.out.println(rs.next());
			
			if (rs.getString("nombreUsuario") == null) {
				
				sentencia = "INSERT INTO cuentas (nombreUsuario, password, email, telefono) VALUES ('" + nombreUsuario + "','" + password + "','" + email + "'," + telefono+ ");";
				
				conexion.ejecutarInsertDeleteUpdate(sentencia);
				
				sentencia = "SELECT id2 FROM cuentas"
						+ " WHERE email ='" + email + "';";
				
				rs = conexion.ejecutarSelect(sentencia);
				rs.next();
				int id2 = rs.getInt("id2");
				
				sentencia = "INSERT INTO usuarios (id2, nombre, edad, peso, altura, fechaRegistro, entrenando) VALUES (" + id2 + ",'" + nombre + "'," + edad + "," + peso + "," + altura + ", '" + fechaSQL + "', false);";
				
				
				
				conexion.ejecutarInsertDeleteUpdate(sentencia);
				return id2;
			}else {
				
				System.out.println("Eso ya existe máquina");
				return -1;
			}
			
			
			
		} catch (SQLException e) {

			e.printStackTrace();
			return 0;
		}
	
	
	}
	
	
	public static int inicioSesion(String user, String password) {
	
	ConexionMySQL conexion  = new ConexionMySQL("root", "", "gym");
	
	try {
		
		conexion.conectar();
		String sentencia = "SELECT ";
		return 5;
		
	}catch (SQLException e) {
		
		e.printStackTrace();
	}
	}
	
	
	
	
	public static void Aforo() {
		
		
		ConexionMySQL conexion = new ConexionMySQL("root", "", "gym") ;
		
		try {
			conexion.conectar();
			
			String sentencia = "SELECT count(Entrenando) AS 'total' FROM `usuarios` WHERE entrenando = 1;";
			ResultSet rs = conexion.ejecutarSelect(sentencia);
			rs.next();
			int aforo = rs.getInt("total");
			
			if (aforo < 360) {
				System.out.println("Hay aforo de sobra: " + (aforo*100)/360 + "%");
			}
		} catch (SQLException e) {

			e.printStackTrace();
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
	
}
