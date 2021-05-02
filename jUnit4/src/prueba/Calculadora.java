package prueba;

public class Calculadora {

	private int num1;
	private int num2;
	
	public Calculadora() {}
	
	public Calculadora(int a, int b) {
		this.num1=a;
		this.num2=b;
	}
	
	public int suma() {
		int result = num1 + num2;
		return result;
	}
	
	public int resta() {       
		int resul;       
		
		if (resta2())             
			resul = num1 - num2;      
		else             
			resul = num2 - num1;       
		return resul; 
	} 
	
	public boolean resta2() {       
		if (num1 >= num2)             
			return true;       
		else             
			return false; 
	} 
	
	public Integer divide2() {       
		if (num2 == 0)             
			return null;
		
		int resul = num1 / num2;
		
		return resul; 
		}
	
	public int multiplicar() {
		int result = num1 * num2;
		return result;
	}
	
	public int dividir() {
		int result = num1 / num2;
		return result;
	}
	/*
	public int divide0() {    
		if (num2 == 0)       
		//	throw new Java.lang.ArithmeticException("Division por 0");
	else {       
		int resul = num1 / num2;             
		return resul;    
	} 
		}
		*/
	}

