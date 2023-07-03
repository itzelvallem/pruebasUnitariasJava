package ejercicioProducto;

public class Consumidor extends Producto {

	//1. Atributos 
		String nombreConsumidor;
		
		
		//Heredar la informacion del Producto
		public Consumidor(String nombre, float precio, float descuento, String nombreConsumidor) {
			super(nombre, precio, descuento);
			this.nombreConsumidor = nombreConsumidor;
		}

		
		
		//La clase MAIN
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			//Instancia de Producto
			Consumidor laptop = new Consumidor("Lenovo", 12000, descuento,"Juan");
			
			//Mostrar la informacion 
			laptop.imprimirInfo();
		
			//Mostrar info del metodo aplicarDescuento()
			System.out.println("El Precio Final con Descueto es: " + laptop.aplicarDescuento());

		}
	
}
