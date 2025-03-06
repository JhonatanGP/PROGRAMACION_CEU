package tema04.EjRepaso.Ej02;

public class Fijo extends Telefono{
	
	private String direccion;

	public Fijo(Integer numero, String direccion) {
		super(numero);
		this.direccion = direccion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	
}
