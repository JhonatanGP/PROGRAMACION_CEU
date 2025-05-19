package exAlmacen.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Bulto {
	private String descripcion;
	private BigDecimal peso;
	
	public Bulto(String descripcion, BigDecimal peso) {
		super();
		this.descripcion = descripcion;
		this.peso = peso;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public BigDecimal getPeso() {
		return peso;
	}

	public void setPeso(BigDecimal peso) {
		this.peso = peso;
	}

	public BigDecimal getSobrecosteDiario() {
		//Si el peso es mayor a 50
		if(this.getPeso().compareTo(new BigDecimal(50))>0) {
			return new BigDecimal(10).setScale(2,RoundingMode.HALF_UP);
		}
		return BigDecimal.ZERO.setScale(2,RoundingMode.HALF_UP);
	}
	
}
