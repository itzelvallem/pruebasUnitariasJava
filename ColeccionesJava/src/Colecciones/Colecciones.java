package Colecciones;


	
	import java.util.Set; //papa
	import java.util.HashSet; //hijo

	import java.util.ArrayList; 
	import java.util.List;

	import java.util.Map; 
	import java.util.HashMap;




	public class Colecciones {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			//Instanciando un espacio donde guardar objetos
			//Set<String> cartasDeJuego = new HashSet<>();
			
			//Declarando mi primer arreglo de Java []
			//Primero el tipo de dat que voy a almacenar, despues el nombre de mi arreglo y por ultimo la instancia mi arreglo.
			
			String[] listaCompras = new String[] {"leche", "pan", "frutas"};
			
			//Impresion de mi array
			System.out.println(listaCompras);
			
			//forEach para imprimir cada elemento de mi lista de compras
			//para nuestros datos del tipo String, que se almacenan en una variable temporal llamada ProductoTemporal, que se esta llenando de un arreglo llamado listaCompras, vas a imprimir ese productoTempral
			for(String productoTemporal : listaCompras) {
				System.out.println(productoTemporal);
			}
			
			//Declaro mi Arreglo de habitaciones de un hotel
			String[] habitaciones = new String[10];
			
			//Inicializco o asigno valores a cada indice
			habitaciones[0] = "101";
			habitaciones[1] = "102";
			habitaciones[2] = "103";
			habitaciones[3] = "104";
			habitaciones[4] = "105";
			habitaciones[5] = "106";
			habitaciones[6] = "107";
			habitaciones[8] = "109";
			habitaciones[9] = "110";
			
			/*habitaciones[10] = "111"; Si tratamos de acceder a un elemento mas alla de los elementos declaradosal principio, tendremos una excepcion que solo veremos cuando se ejecute el programa.*/
			
			//Cuando imprimimon un elemento que no esta definido dentro del arreglo, veremos un null. Esto pasa porque para JAVA es preferible tener un elemento nulo a un indefinido. 
			System.out.println(habitaciones[8]);
			
			//En caso de querer usar un for each para imprimir los elementos, solo se imprimiran 7 elementos. (Solo itera sobre los elementos existentes).
			for(String habitacionTemporal : habitaciones) {
				System.out.println(habitacionTemporal);
			} //for
			
			//ArrayList para una lista de contactos
			
			//Uso la interface List que almacena Contactos (objeto), se llama listaDeContactos e instancia un arrayList para manejar los mismos tipos de datos (Contacto)
			List<Cliente> listaDeClientes = new ArrayList<>();
			
			//Primero instancio un objeto de la clase Cliente (nombre, cuenta, saldo, nip)
			Cliente Felipe = new Cliente("Felipe Maqueda", "ABC123", 150.50f, "1234");
			
			//Agrego el cliente a mi lista de clientes con el metodo .add
			listaDeClientes.add(Felipe);
			
			//Instancio al cliente y lo agrego a la lista (Agregarlo en una sola linea)
			listaDeClientes.add(new Cliente("Naruto", "XXX111", 100.00f, "0000"));
			
			
			System.out.println("Lista completa");
			//Imprimo la informacion de mi lista (utilizar metodos)
			for (Cliente cliente : listaDeClientes) {
			    System.out.println(cliente);
			}
			
			System.out.println();
			//Sacar un elemento de la lista y asignarlo a una variable
			System.out.println("Elemento en el indice 0");
			Cliente datoDeLaLista = listaDeClientes.get(0);
			
			System.out.println();
			//Imprimir el elemento de la lista con un dato especifico
			System.out.println("Impresion de un elemento de la lista");
			System.out.println(datoDeLaLista.getCuentaBancaria());
			
			System.out.println();
			//Eliminar elementos de la lista
			listaDeClientes.remove(0);
			
			System.out.println();
			//Imprimo la informacion de mi lista (utilizar metodos)
			System.out.println(listaDeClientes);
			
			//Conjunto para servicios de un hotel
			Set<String> roomService = new HashSet<>();
			
			roomService.add("Chilaquiles");
			roomService.add("Agua mineral");
			roomService.add("Wi-fi");
			
			//Hotel con promocion (si pidieron mineral aplicamos un descuento del 50%)
			if(roomService.contains("Agua mineral")) { //tiene que respetar el texto
				System.out.println("Obtienes un descuento del 50%");
			}
			
			//Que pasa si imprimio mi roomService?
			//roomService.clear();
			System.out.println(roomService);
			
			//HashMap para mi sistema de reservas del hotel
			// llave     valor
			Map<String, Cliente> reservaHabitacion = new HashMap<>();
			
			reservaHabitacion.put("101", new Cliente("Jesus", "135JJJ", 1890.87f, "0011") );
			reservaHabitacion.put("102", new Cliente("Bugs Bunny", "BGSB12", 10890.87f, "7777") );
			
			//Impresion de una reserva
			Cliente reservaBugsBunny = reservaHabitacion.get("102"); //obtener un dato del hashmap (key)
			
			//Que pasa si imprimo la variable reservaHabitacion
			
			
			
			
		

		} //main
} //colecciones
