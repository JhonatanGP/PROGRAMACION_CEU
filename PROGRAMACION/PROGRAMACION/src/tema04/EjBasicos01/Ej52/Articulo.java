package tema04.EjBasicos01.Ej52;

import java.math.BigDecimal;

public  class Articulo {
	// 01
	private String descripcion;
	private BigDecimal precio;

	// 02
	public Articulo() {
		super();
	}

	// 03
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

}
