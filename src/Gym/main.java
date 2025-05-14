package Gym;

import java.sql.SQLException;
import java.time.LocalDateTime;

import Gym.ConexionMySQL;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ConexionMySQL conexion = new ConexionMySQL("root", "", "gym") ;

		LocalDateTime hoy = LocalDateTime.now();
		String fechaSQL = hoy.getYear() + "/" + hoy.getMonthValue() + "/" + hoy.getDayOfMonth();
		
		try {
			conexion.conectar();
			String sentencia = "INSERT INTO usuarios (Nombre, Edad, Peso, Altura, FechaRegistro, Entrenando) VALUES ('Hugo', 19, 175," + fechaSQL + ", true);";
			conexion.ejecutarInsertDeleteUpdate(sentencia);
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

}
