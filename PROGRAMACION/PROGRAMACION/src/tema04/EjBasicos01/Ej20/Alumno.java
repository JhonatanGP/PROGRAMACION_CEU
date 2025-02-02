package tema04.EjBasicos01.Ej20;

public class Alumno {
	// Primero los atributos
	private String dni;
	private String nombre;
	private Integer edad;
	private Float nota;

	// Segundo los constructores
	
	// Constructor con parametros
	public Alumno(String dni) {
		super();
		this.dni = dni;
	}

	public Alumno() {
		super();
	}
	// Tercero get and set

	// A un metodo no se pone nunca un static
	public void aprobar() {
		this.nota = 5.0f;
	}

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

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Float getNota() {
		return nota;
	}

	public void setNota(Float nota) {
		this.nota = nota;
	}

	// Cuarto, el resto

}
