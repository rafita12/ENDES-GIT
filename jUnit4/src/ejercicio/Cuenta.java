package ejercicio;

// Clase que implementa la gestión del fondo de una cuenta bancaria de una persona.
public class Cuenta {
	// Atributos.
	private String nombre;
	private int saldo;
	private int saldoCuenta;
	
	// Métodos constructores.
	public Cuenta(String nombre, int saldo) {
		this.nombre=nombre;
		this.saldo=saldo;
		this.saldoCuenta=0;
	}
	
	// Ingresa dinero indicado en la cuenta, indicando la cantidad a ingresar.
	public int ingresaFondo(float importe) {
		if(this.saldo < importe)
			this.saldoCuenta= saldoCuenta;
		else {
			this.saldo-=importe;
			saldoCuenta+=importe;
			
		}
		
		return saldoCuenta;
		
	}
	
	// Muestra el estado del cliente.
	public void muestraEstado() {
		System.out.println("*************************************");
		System.out.println("Cliente: "+this.nombre);
		System.out.printf("Saldo: %d € \n",this.saldo);
		System.out.println("*************************************");
	}
	
	// Extrae de la cuenta el importe indicado por parámetros.
	public int sacaFondo(float importe) {
		if(saldoCuenta < importe)
			saldoCuenta=saldoCuenta;
			else {
			saldoCuenta-=importe;
			saldo+=importe;
		}
		
		return saldoCuenta;
	}
	
	//Devuelve el saldo del cliente
	public int getSaldo() {
		return saldo;
	}
	
	// Muestra el estado de la cuenta
	public void muestraFondo() {
		System.out.println("========================================");
		System.out.printf("En la cuenta hay: %d € \n",saldoCuenta);
		System.out.println("========================================");
	}
}
