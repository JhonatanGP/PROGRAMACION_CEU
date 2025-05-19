package exRestaurante.modelo;

import java.math.BigDecimal;

public class Bebidas extends Articulo{
	private String marca;
	
	public Bebidas(String descripcion, BigDecimal precio) {
		super(descripcion, precio);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Despcripción: " + this.getDescripcion() 
		+ " - Precio: " + this.getPrecio() + "€";
	}

	@Override
	public BigDecimal getPrecioFinal() {
		return getPrecio();
	}
}
