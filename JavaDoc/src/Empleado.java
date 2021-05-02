
/**
 * <h2>Clase Empleado, la utilizamos para crear empleados y leerlos de una BD</h2>
 * 
 * Busca informacion de JavaDoc en <a href="https://www.google.com/">Google</a>
 * @version 1-20018
 * @author rafaa
 * @since 15-03-2021
 */
public class Empleado {

	/**
	 * Atributo Nombre del empleado
	 */
	private String nombre;
	
	/**
	 * Atributo apellido del empleado
	 */
	private String apellido;
	
	/**
	 * Atributo alario del empleado
	 */
	private double salario;
	
	/**
	 * Constructor con 3 parametros. Creamos objetos empleado, con nombre, apellido y salario
	 * @param nombre Nombre del empleado
	 * @param apellido Apellido del empleado
	 * @param salarios Salario del empleado
	 */
	
public Empleado(String nombre, String apellido, double salario) {
	
	this.nombre = nombre;
	this.apellido = apellido;
	this.salario = salario;
}

//Métodos Públicos

/**
 * Sube el salario al empleado la cantidad indicada por parametro
 * @see Empleado
 * @param Subida
 */
public void subidaSalarial(double subida) {
	salario=salario+subida;
}

//Métodos Privados

/**
 * @return <ul>
 * <li>true:el nombre es una cadena vacia.</li>
 * <li>false:el nombre no es una cadena vacia.</li>  
 * </ul>
 */
private boolean comprobar() {
	if (nombre.equals("")) {
		return false;
	}
	return true;
	}
}

