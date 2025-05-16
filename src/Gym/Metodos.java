package Gym;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class Metodos {
	
	
	public void agregarUsuario(String Nombre, int edad, int peso, int altura) {
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
	
	
	}
	
	
	public static void inicioSesion() {}
	
	
	
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
