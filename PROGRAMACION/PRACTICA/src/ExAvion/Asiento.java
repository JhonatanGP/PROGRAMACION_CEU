package ExAvion;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Objects;

public abstract class Asiento {
//01
	private Integer fila;
	private String letra;
	private Boolean ocupado;
	private BigDecimal precio;

//02
	public Asiento(Integer fila, String letra) {
		this.fila = fila;
		this.letra = letra.toUpperCase();
		this.ocupado = false;
	}

//03
	public Integer getFila() {
		return fila;
	}

	public void setFila(Integer fila) {
		this.fila = fila;
	}

	public String getLetra() {
		return letra;
	}

	public void setLetra(String letra) {
		this.letra = letra;
	}

	public Boolean getOcupado() {
		return ocupado;
	}

	public void setOcupado(Boolean ocupado) {
		this.ocupado = ocupado;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

//04
	public abstract BigDecimal getPrecioVenta();

	@Override
	public String toString() {
		DecimalFormat f = new DecimalFormat("#,###.00€");		
		if (ocupado == false) {
			return "FILA/ASIENTO: " + fila + "/" + letra + " PVP: " + f.format(getPrecioVenta()) + " LIBRE";
		}
		return "FILA/ASIENTO: " + fila + "/" + letra + " PVP: " + f.format(getPrecioVenta()) + " OCUPADO";
	}

	@Override
	public int hashCode() {
		return Objects.hash(fila, letra);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Asiento other = (Asiento) obj;
		return Objects.equals(fila, other.fila) && Objects.equals(letra, other.letra);
	}

}
