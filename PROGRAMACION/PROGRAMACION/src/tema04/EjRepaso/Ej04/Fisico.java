package tema04.EjRepaso.Ej04;

import java.time.LocalDate;

public class Fisico extends Libro{
	
	private int alto;
	private int ancho;
	private int peso;
	
	public Fisico(String titulo, String autor, LocalDate fechaEdicion, Integer pagina, int alto, int ancho, int peso) {
		super(titulo, autor, fechaEdicion, pagina);
		this.alto = alto;
		this.ancho = ancho;
		this.peso = peso;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	
	

}
