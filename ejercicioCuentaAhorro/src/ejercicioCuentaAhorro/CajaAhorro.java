package ejercicioCuentaAhorro;

public class CajaAhorro extends Cuenta {

	public CajaAhorro(String titular, double cantidad) {
		// TODO Auto-generated constructor stub
		super(titular, cantidad);
	}
	
	public void mostrarInformacion() {
		super.mostrarInformacion();
	}
	
	@Override
	public String toString() {
		return "CajaAhorro[" + this.cantidad + ", " + this.titular + "]";
	}
	
}
