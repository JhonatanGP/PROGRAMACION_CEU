package tema04.EjBasicos01.Ej52;

public class Cliente {
	// 01
	private String dni;
	private String nombre;

	// 02
	public Cliente() {
		super();
	}

	// 03
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// 04
	@Override
	public String toString() {
		return "Cliente: " + dni + "-" + nombre + ".";
	}

}
