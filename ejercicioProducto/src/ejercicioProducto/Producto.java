package ejercicioProducto;

public class Producto {

	//1. Atributos
		String nombre;
		float precio;
		static float descuento = 15f;
		
		
		//Constructor
		public Producto(String nombre, float precio, float descuento) {
			this.nombre = nombre;
			this.precio = precio;
			Producto.descuento = descuento;
		}
		
		
		//2. Metodos
		//Para mostrar la informacion
		public void imprimirInfo() {
			System.out.println("Nombre: " + this.nombre);
			System.out.println("Precio: " + this.precio);
			System.out.println("Descuento: " + Producto.descuento);
			
			
		}//mostrar la informacion
		
		

		//Para aplicar el descuento
		public float aplicarDescuento() {
			//Obteniendo el descuento al precio
			float valorDescuento = this.precio * (Producto.descuento/100);
			//Aplico el descuento
			float precioFinalConDescuento = Math.round(this.precio - valorDescuento);
			
			System.out.println("Valor con Descuento:" + valorDescuento);
			//Devolver
			return precioFinalConDescuento;
				
		}//aplicar el descuento
	
	
}
