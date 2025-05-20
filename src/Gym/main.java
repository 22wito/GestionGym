package Gym;

import java.sql.SQLException;
import java.time.LocalDateTime;

import Gym.ConexionMySQL;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int idUsuario = Metodos.agregarUsuario("Hugo", 25, 87, 190, "yoyo", "root", "holabuenas2@gmail.com", 123856789);
		System.out.println(idUsuario);
	}

}
