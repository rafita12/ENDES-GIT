package ejercicio;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Amigos [] amigos= {
			new Amigos("Pepe",50f),
			new Amigos("Juan",70f),
			new Amigos("María",100f),
			new Amigos("Eva",80f),
		};
		
		for(Amigos a:amigos)
			a.muestraEstado();
		
		Amigos.muestraFondo();
		
		for(Amigos a:amigos)
			a.ingresaFondo(5);

		for(Amigos a:amigos)
			a.muestraEstado();
		Amigos.muestraFondo();
		
		Amigos.sacaFondo(10);
		
		for(Amigos a:amigos)
			a.muestraEstado();
		Amigos.muestraFondo();

		for(Amigos a:amigos)
			a.ingresaFondo(20);

		for(Amigos a:amigos)
			a.muestraEstado();
		Amigos.muestraFondo();
*/
		
		Cuenta a = new Cuenta("Jose", 500);
		
		a.ingresaFondo(300);
		
		a.sacaFondo(250);
		
		a.muestraEstado();
		
		a.muestraFondo();
		
		
	}

}
