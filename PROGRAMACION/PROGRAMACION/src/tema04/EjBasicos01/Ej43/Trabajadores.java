package tema04.EjBasicos01.Ej43;

public abstract class Trabajadores {

	public static final Double SUELDO_ACTORES = 100000D;
	public static final Double SUELDO_GUIONISTA = 50000D;
	public static final Double SUELDO_DIRECTORES = 200000D;

	// 01 ATRIBUTOS
	private String nombre;
	private int año_nac;
	private String nacionalidad;
	// 02 CONSTRUCTORES

	public Trabajadores(String nombre, int año_nac, String nacionalidad) {
		super();
		this.nombre = nombre;
		this.año_nac = año_nac;
		this.nacionalidad = nacionalidad;
	}

	// 03 GET AND SET
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAño_nac() {
		return año_nac;
	}

	public void setAño_nac(int año_nac) {
		this.año_nac = año_nac;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	// 04 MÉTODOS
	public abstract Double getSueldo();

	@Override
	public String toString() {
		return "Trabajadores [nombre=" + nombre + ", año_nac=" + año_nac + ", nacionalidad=" + nacionalidad + "]";
	}

}
