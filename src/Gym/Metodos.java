package Gym;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class Metodos {
	
	
	public static void agregarUsuario(String nombre, int edad, int peso, int altura, String nombreUsuario, String password, String email, int telefono) {
		ConexionMySQL conexion = new ConexionMySQL("root", "", "gym");
		LocalDateTime hoy = LocalDateTime.now();
		String fechaSQL = hoy.getYear() + "/" + hoy.getMonthValue() + "/" + hoy.getDayOfMonth();
	

		try {
			conexion.conectar();
			
			String sentencia = "SELECT nombreusuario FROM cuentas;";
			ResultSet rs = conexion.ejecutarSelect(sentencia);
			rs.next();
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
				
			}else {
				
				System.out.println("Eso ya existe máquina");
			}
			
			
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
	
	
	}
	
	
	public static void inicioSesion(String user, String password) {
	
	ConexionMySQL conexion  = new ConexionMySQL("root", "", "gym");
	
	try {
		
		conexion.conectar();
		String sentencia = "SELECT ";

		
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
	
	
	public void desHabilitarUsuario() {
		/*
		ConexionMySQL conexion = new ConexionMySQL("root", "", "gym") ;

		LocalDateTime hoy = LocalDateTime.now();
		String fechaSQL = hoy.getYear() + "/" + hoy.getMonthValue() + "/" + hoy.getDayOfMonth();
	
		System.out.println(fechaSQL);
		try {
			conexion.conectar();
			String sentencia = "INSERT INTO usuarios (Nombre, Edad, Peso, Altura, FechaRegistro, Entrenando) VALUES ('Jorge', 19, 67, 175, '" + fechaSQL + "', false);";
			conexion.ejecutarInsertDeleteUpdate(sentencia);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		*/
	}
	
	
}
