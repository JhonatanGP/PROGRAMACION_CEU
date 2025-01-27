package tema04.EjBasicos01.Ej36;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	private Long identificador;
	private String descripcion;
	//private Alumno[] alumnos;
	private List<Alumno> alumnos;
	private Integer numAlumnosMaximo;

	public Curso(Integer numAlumnos) {
		this.numAlumnosMaximo = numAlumnosMaximo;
		alumnos = new ArrayList<>();
	}

	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public void addAlumno(Alumno alumno) {
		if (alumnos.size() < numAlumnosMaximo) {
			alumnos.add(alumno);
		} else {
			System.err.println("No hay sitio para ms alumnos");
		}

//		for (int i = 0; i < alumnos.length; i++) {
//			if (alumnos[i] == null) {
//				alumnos[i] = alumno;
//				return;
//			}
//		}
//		System.err.println("No hay sitio para más alumnos");		

	}

	public Long getIdentificador() {
		return identificador;
	}

	public void setIdentificador(Long identificador) {
		this.identificador = identificador;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Curso [identificador=" + identificador + ", descripcion=" + descripcion + "]";
	}

}
