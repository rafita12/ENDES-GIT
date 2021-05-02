package prueba;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	//Si la suma devuele el resultado esperado está correcto.
	@Test
	public void testSuma() {
		Calculadora calc = new Calculadora (20,10);
		int resultado = calc.suma();
		assertEquals("Fallo en la suma" ,30, resultado);
	}
	
	//Si la resta devuele el resultado esperado está correcto.
	@Test
	public void testResta() {
		Calculadora calc = new Calculadora (20,10);
		int resultado = calc.resta();
		assertEquals("Fallo en la Resta", 10, resultado);
	}
	
	//Si en la resta el num1 es mayor al num2 devuelve True.
	@Test
	public void testResta2() {
		Calculadora calc = new Calculadora (20,10);
		boolean resultado = calc.resta2();
		assertTrue("Fallo en la Resta", resultado);
	}
	
	//Si en la resta el num1 es menor al num2 devuelve False.
	@Test
	public void testResta3() {
		Calculadora calc = new Calculadora (10,20);
		assertFalse("Resta devuelve el resultado", calc.resta2());
	}
	
	//Prueba para cuando el num2 sea igual a 0
	@Test
	public void testDividirCero() {
		try {
			Calculadora calc = new Calculadora (20,0);
			int resultado = calc.dividir();
			fail("FALLO");
		} catch (ArithmeticException e) {
			// TODO: handle exception
		}
		
	}
	
	//Devuelve null si el num2 es igual a 0
	@Test
	public void testDividirCero2() {
			Calculadora calc = new Calculadora (20,0);
			Integer resultado = calc.divide2();
			assertNull("FALLO", resultado);
	}
	
	//Devuelve NotNull si la division es correcta.
	@Test
	public void testDividirCero3() {
			Calculadora calc = new Calculadora (20,1);
			int resultado = calc.divide2();
			assertNotNull("FALLO", resultado);
	}
	
	//Si la multiplicación devuele el resultado esperado está correcto.
	@Test
	public void testMultiplicacion() {
		Calculadora calc = new Calculadora (20,10);
		int resultado = calc.multiplicar();
		assertEquals("Fallo en la multiplicación", 200, resultado);
	}
	
	//Si la divición devuele el resultado esperado está correcto.
	@Test
	public void testDividir() {
		Calculadora calc = new Calculadora (20,10);
		int resultado = calc.dividir();
		assertEquals("Fallo al dividir", 2, resultado);
	}
	
	

}
