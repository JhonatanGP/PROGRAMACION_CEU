package tema04.EjRepaso.Ej04;

import java.time.LocalDate;

public class Libro {

	private String titulo;
	private String autor;
	private LocalDate fechaEdicion;
	private Integer pagina;

	
	

	public Libro(String titulo, String autor, LocalDate fechaEdicion, Integer pagina) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.fechaEdicion = fechaEdicion;
		this.pagina = pagina;
	}


	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public LocalDate getFechaEdicion() {
		return fechaEdicion;
	}

	public void setFechaEdicion(LocalDate fechaEdicion) {
		this.fechaEdicion = fechaEdicion;
	}

	public Integer getPagina() {
		return pagina;
	}

	public void setPagina(Integer pagina) {
		this.pagina = pagina;
	}
	
	

}
