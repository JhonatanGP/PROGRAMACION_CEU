package exRestaurante.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Tapas extends Articulo {
	private String des_alergenos;

	public Tapas(String descripcion, BigDecimal precio) {
		super(descripcion, precio);
	}
	public String getDes_alergenos() {
		return des_alergenos;
	}
	public void setDes_alergenos(String des_alergenos) {
		this.des_alergenos = des_alergenos;
	}
	@Override
	public String toString() {
		return "Despcripción: " + this.getDescripcion() 
		+ " - Precio: " + this.getPrecio() + "€";
	}
	@Override
	public BigDecimal getPrecioFinal() {
		return getPrecio().multiply(new BigDecimal("0.33"))
				.setScale(2,RoundingMode.HALF_DOWN); //Esta es la tercera Parte
	}

}
