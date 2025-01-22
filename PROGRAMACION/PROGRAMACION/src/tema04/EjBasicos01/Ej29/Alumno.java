package tema04.EjBasicos01.Ej29;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Alumno extends Persona {
	// Primero los atributos
	private String dni;
	private Float nota;
	private Curso curso;

	// Segundo los constructores

	// Constructor con parametros
	public Alumno(String dni) {
		super();
		this.dni = dni.toUpperCase();
	}

	public Alumno() {
		super();
	}
	// Tercero get and set

	// A un metodo no se pone nunca un static
	public void aprobar() {
		this.nota = 5.0f;
	}

	public Boolean validarDni(String dni) {
		Boolean v = false;
		if (dni == null || dni.isEmpty() || dni.length() < 9 || dni.length() > 9) {
			System.err.println("Error, el DNI no cumple los requisitos");
			v = true;
		}
		Pattern patron = Pattern.compile("[0-9]{7,8}[A-Z a-z]");
		Matcher match = patron.matcher(dni);
		if (match.matches()) {
			v = false;
		} else {
			v = true;
		}

		return v;
	}

	public Boolean validar() {
		Boolean v = false;
		if (validarDni(dni)) {
			v = true;
		} else if (curso == null) {
			v = true;
		} else if (getNombre() == null || getNombre().length() > 9) {// no puedo acceder al atributo privado de persona.
																		// Debo llamar al metodo
			v = true;
		} else if (getEdad() == null || getEdad() <= 12 || getEdad() >= 65) {
			v = true;
		}
		return v;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni.toUpperCase();
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

	// to_string
	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nota=" + nota + ", curso=" + curso + "]";
	}
	// equals

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(dni, other.dni);
	}

	// Cuarto, el resto

}
