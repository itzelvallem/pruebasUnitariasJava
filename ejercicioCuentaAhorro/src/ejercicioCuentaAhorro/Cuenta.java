package ejercicioCuentaAhorro;

public class Cuenta {

	

	//1. Atributos
	String titular;
	float cantidad;
	
	//Constructor para pasarlo a las subclases
	public Cuenta(String titular, float cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}//constructor
	
	//2. Metodo para imprimir datos
	public void imprimirDatos() {
		System.out.println("Titular: " + titular);
		System.out.println("Cantidad: " + cantidad);
	}//Imprimir datos
}//Clase Cuenta

