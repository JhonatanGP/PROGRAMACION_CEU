package tema04.EjBasicos01.Ej43;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {

	// 01
	private int ano_estreno;
	private String titulo;
	private List<Actores> actores;
	private Guionistas guionista;
	private Directores director;
	
	// 02
	public Pelicula(int ano_estreno, String titulo, Guionistas guionista, Directores director) {
		super();
		this.ano_estreno = ano_estreno;
		this.titulo = titulo;
		this.actores = new ArrayList<>();
		this.guionista = guionista;
		this.director = director;
	}
	
	// 03
	public int getAno_estreno() {
		return ano_estreno;
	}
	
	public void setAno_estreno(int ano_estreno) {
		this.ano_estreno = ano_estreno;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public List<Actores> getActores() {
		return actores;
	}
	public void setActores(List<Actores> actores) {
		this.actores = actores;
	}
	
	public Guionistas getGuionista() {
		return guionista;
	}

	public void setGuionista(Guionistas guionista) {
		this.guionista = guionista;
	}

	public Directores getDirector() {
		return director;
	}

	public void setDirector(Directores director) {
		this.director = director;
	}
	
	// 04 
	@Override
	public String toString() {
		return "Pelicula [ano_estreno=" + ano_estreno + ", titulo=" + titulo + ", actores=" + actores + ", guionista="
				+ guionista + ", director=" + director + "]";
	}

}
