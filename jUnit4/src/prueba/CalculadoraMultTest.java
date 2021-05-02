package prueba;


import static org.junit.Assert.assertEquals;
import java.util.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculadoraMultTest {


	//Creamos los atributos necesarios.
	private int num1;
	private int num2;
	private int resul;
	
	//Creamos el metodo constructor, donde pasamps los parametros necesarios.
	public CalculadoraMultTest(int num1, int num2, int resul) {
		
		this.num1 = num1;
		this.num2 = num2;
		this.resul = resul;
	}
	
	//Creamos el parametro donde introducimos los iferentes array, con los dos numeros y el resultado a dar.
	@Parameters
	public static Collection<Object[]> numeros() {
		return Arrays.asList(new Object[][] {
			{1, 10, 10},{1, 20, 20},{1, 30, 30}
		});
	}
	
	//Hacemos la prueba para verficar que funciona correctamente nuestro metodo suma.
	@Test
	public void testMultiplica() {
		Calculadora calc = new Calculadora (num1, num2);
		int resultado = calc.multiplicar();
		assertEquals(resul, resultado);
	}

}
