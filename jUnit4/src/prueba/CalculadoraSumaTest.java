package prueba;


import static org.junit.Assert.assertEquals;
import java.util.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculadoraSumaTest {

	//Creamos los atributos necesarios.
	private int num1;
	private int num2;
	private int resul;
	
	//Creamos el metodo constructor, donde pasamps los parametros necesarios.
	public CalculadoraSumaTest(int num1, int num2, int resul) {
		
		this.num1 = num1;
		this.num2 = num2;
		this.resul = resul;
	}
	
	//Creamos el parametro donde introducimos los iferentes array, con los dos numeros y el resultado a dar.
	@Parameters
	public static Collection<Object[]> numeros() {
		return Arrays.asList(new Object[][] {
			{10, 10, 20},{100, 20, 120},{13, 30, 43}
		});
	}
	
	//Hacemos la prueba para verficar que funciona correctamente nuestro metodo suma.
	@Test
	public void testSuma() {
		Calculadora calc = new Calculadora (num1, num2);
		int resultado = calc.suma();
		assertEquals(resul, resultado);
	}

}
