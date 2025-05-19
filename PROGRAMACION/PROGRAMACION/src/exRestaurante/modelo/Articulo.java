package exRestaurante.modelo;

import java.math.BigDecimal;

public abstract class Articulo {
	private String descripcion;
	private BigDecimal precio;
	private Boolean servido;
	
	public Articulo(String descripcion, BigDecimal precio) {
		super();
		this.descripcion = descripcion;
		this.precio = precio;
		this.servido = false;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public Boolean getServido() {
		return servido;
	}

	public void setServido(Boolean servido) {
		this.servido = servido;
	}
	
	@Override
	public abstract String toString();
	public abstract BigDecimal getPrecioFinal();


}
