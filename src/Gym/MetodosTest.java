package Gym;

public class MetodosTest {
	
	public static String Aforo(int aforo) {
	    if (aforo < 50) {
	        return (aforo * 100) / 50 + "%";
	    } else {
	        return "El Gimnasio está lleno";
	    }
	}
	
	public static int setEdad(int edad) {
		if (edad <=0) {
			return 0;
		} else {
			return 1;
		}
	}
	
	public static int setAltura(int Altura) {
		if (Altura <=0 || Altura >=400) {
			return 0;
		} else {
			return 1;
		}
	}
	
	public static int setTelefono(int Telefono) {
		if (Telefono <=600000000 || Telefono >=999999999) {
			return 0;
		} else {
			return 1;
		}
	}
	
	public static int setPeso(int Peso) {
		if (Peso <=0 || Peso >=400) {
			return 0;
		} else {
			return 1;
		}
	}

}
