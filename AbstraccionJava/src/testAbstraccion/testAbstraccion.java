package testAbstraccion;

public class testAbstraccion {
	
	
public static void main(String[] args) {
		
		//Instancia de la clase automovil
		Automovil myTroquita = new Automovil();
		
		//Instancia de la clase automovil
		Motocicleta ninja = new Motocicleta();
		
		//Llamaos a los metodos de cada instancia
		myTroquita.acelerar();
		ninja.acelerar();
		
		myTroquita.frenar();
		ninja.frenar();
		

	}


}
