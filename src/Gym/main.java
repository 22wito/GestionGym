package Gym;

import java.sql.SQLException;
import java.time.LocalDateTime;

import Gym.ConexionMySQL;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Metodos.agregarUsuario("Pedro", 25, 62, 179, "Maquina", "pass", "correo@gmail.com", 999999999);
	}

}
