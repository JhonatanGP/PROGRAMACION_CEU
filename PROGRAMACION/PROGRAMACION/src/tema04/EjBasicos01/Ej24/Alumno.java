package tema04.EjBasicos01.Ej24;

public class Alumno extends Persona{
	// Primero los atributos
	private String dni;
	private Float nota;
	private Curso curso;

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

	public Float getNota() {
		return nota;
	}

	public void setNota(Float nota) {
		this.nota = nota;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nota=" + nota + ", curso=" + curso + "]";
	}

	

	
	// Cuarto, el resto

}
