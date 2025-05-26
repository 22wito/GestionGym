package Gym;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test {

	@Test
	void testAforo() {
		String resultado = MetodosTest.Aforo(25);
		assertEquals("50%", resultado, "El aforo debería ser 50% cuando hay 25 personas");
		
		resultado = MetodosTest.Aforo(49);
		assertEquals("98%", resultado, "El aforo debería ser 98% cuando hay 49 personas");
		
		resultado = MetodosTest.Aforo(50);
		assertEquals("El Gimnasio está lleno", resultado, "El aforo debería estar lleno cuando hay 50 personas");
	}
	
	@Test
	void testEdad() {
		int resultado = MetodosTest.setEdad(25);
		assertEquals(1, resultado, "Debe devolver 1 porque edad es positiva.");
		
		resultado = MetodosTest.setEdad(14);
		assertEquals(1, resultado, "Debe devolver 1 porque edad es positiva.");
		
		resultado = MetodosTest.setEdad(-4);
		assertEquals(0, resultado, "Debe devolver 0 porque edad es negativa");
	}
	
	@Test
	void testAltura() {
		int resultado = MetodosTest.setAltura(-40);
		assertEquals(0, resultado, "Debe devolver 0 porque la altura es posible es negativa.");
		
		resultado = MetodosTest.setAltura(170);
		assertEquals(1, resultado, "Debe devolver 1 porque la altura es posible.");
		
		resultado = MetodosTest.setAltura(400);
		assertEquals(0, resultado, "Debe devolver 0 porque la altura es demasiado para ser real");
	}
	
	@Test
	void testTelefono() {
		int resultado = MetodosTest.setTelefono(289345);
		assertEquals(0, resultado, "Debe devolver 0 porque el telefono es imposible.");
		
		resultado = MetodosTest.setTelefono(699999999);
		assertEquals(1, resultado, "Debe devolver 1 porque el telefono es posible.");
		
		resultado = MetodosTest.setTelefono(1293869764);
		assertEquals(0, resultado, "Debe devolver 0 porque el telefono es imposible.");
	}
	
	@Test
	void testPeso() {
		int resultado = MetodosTest.setPeso(-4);
		assertEquals(0, resultado, "Debe devolver 0 porque el peso es imposible.");
		
		resultado = MetodosTest.setPeso(65);
		assertEquals(1, resultado, "Debe devolver 1 porque el peso es posible.");
		
		resultado = MetodosTest.setPeso(583);
		assertEquals(0, resultado, "Debe devolver 0 porque el peso es imposible.");
	}

}
