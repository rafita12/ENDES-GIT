package ejercicio;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaTest {
	
	//Probamos al cliente Antonio, el cual tiene en su cartera 100 y quiere ingresar 120
	//como no puede ingresar mas de lo que tiene pues devuelve, el dinero que ya tenga en la cuenta
	//en este caso 0, ya que la cuenta no tiene dinero.
	@Test
	public void IngresoIncorrectoTest() {
		Cuenta cli = new Cuenta ("Antonio", 100);
		int resultado = cli.ingresaFondo(120);
		assertEquals("Saldo de la cuenta incorrecta",0, resultado);
	}
	
	//Probamos al cliente Manuel, el cual tiene en su cartera 500 y quiere ingresar 450
	//por lo que a el saldo suyo le restamos lo que vamos a ingresar y se lo sumamos al saldo de la cuenta, 
	//en este caso en la cuenta tendria 450.
	@Test
	public void IngresoCorrectoTest() {
		Cuenta cli2 = new Cuenta ("Manuel", 500);
		int resultado = cli2.ingresaFondo(450);
		assertEquals("Saldo de la cuenta incorrecta", 450, resultado);
	}
	
	//Probamos a la cliente María, el cual tiene en su cartera 500 y quiere ingresar primero 100 y luego 300
	//por lo que a el saldo suyo le restamos lo que vamos a ingresar y se lo sumamos al saldo de la cuenta, 
	//en este caso en la cuenta tendria 400. 100 del primer ingreso y 300 del segundo.
	@Test
	public void DosIngresosTest() {
		Cuenta cli3 = new Cuenta ("María", 500);
		cli3.ingresaFondo(100);
		int resultado = cli3.ingresaFondo(300);
		assertEquals("Saldo del cliente incorrecto",400, resultado);
	}
	
	//Probamos al cliente Rafael, el cual tiene en su cartera 120 y quiere ingresar primero 100, 
	//Como queremos saber cuanto dinero se le quedaría, nos debería de devolver 20.
		@Test
		public void saldoClienteTest() {
			Cuenta cli4 = new Cuenta ("Rafael", 120);
			cli4.ingresaFondo(100);
			int resultado = cli4.getSaldo();
			assertEquals("Saldo del cliente incorrecto",20, resultado);
		}
	
	//Probamos a la cliente Rosalía, el cual tiene en su cartera 200 y quiere ingresar primero 100 y luego 50, 
	//Como queremos saber cuanto dinero se le quedaría, nos debería de devolver 50.
	@Test
	public void saldoCliente2Test() {
		Cuenta cli5 = new Cuenta ("Rosalía", 200);
		cli5.ingresaFondo(100);
		cli5.ingresaFondo(50);
		int resultado = cli5.getSaldo();
		assertEquals("Saldo del cliente incorrecto",50, resultado);
	}
	
	//Probamos a la cliente Marisa, el cual tiene en su cartera 200 y quiere ingresar primero 100 y luego 50, 
	//Luego vamos a sacar 20
	//Como queremos saber cuanto dinero se le quedaría en la cuenta, nos debería de devolver 130.
		@Test
		public void sacaCuentaTest() {
			Cuenta cli6 = new Cuenta ("Marisa", 200);
			cli6.ingresaFondo(100);
			cli6.ingresaFondo(50);
			int resultado = cli6.sacaFondo(20);
			assertEquals("Saldo de la cuenta incorrecto",130, resultado);
		}
		
		//Probamos a la cliente Dolores, el cual tiene en su cartera 200 y quiere ingresar primero 100 y luego 50, 
		//Luego vamos a sacar 20
		//Como queremos saber cuanto dinero se le quedaría a la persona, nos debería de devolver 70.
		@Test
		public void sacaCuenta2Test() {
			Cuenta cli7 = new Cuenta ("Dolores", 200);
			cli7.ingresaFondo(100);
			cli7.ingresaFondo(50);
			cli7.sacaFondo(20);
			int resultado = cli7.getSaldo();
			assertEquals("Saldo del cliente incorrecto",70, resultado);
		}
		
		//Probamos al cliente Luis, el cual tiene en su cartera 200 y quiere ingresar primero 100 y luego 50, 
		//Luego vamos a sacar 300, que es mas de lo que tiene en el banco, por lo que no se va a producir la extracción y
		//va a devolrver lo que hay en el banco.
		@Test
		public void sacaCuenta3Test() {
			Cuenta cli8 = new Cuenta ("Luis", 200);
			cli8.ingresaFondo(100);
			cli8.ingresaFondo(50);
			int resultado = cli8.sacaFondo(300);
			assertEquals("Saldo del cliente incorrecto",150, resultado);
		}
}
