package tema04.EjRepaso.Ej02;

import java.math.BigDecimal;

public class Movil extends Telefono{
	
	private BigDecimal latitud;
	private BigDecimal longitud;
	
	public Movil(Integer numero, BigDecimal latitud, BigDecimal longitud) {
		super(numero);
		this.latitud = latitud;
		this.longitud = longitud;
	}

	public BigDecimal getLatitud() {
		return latitud;
	}

	public void setLatitud(BigDecimal latitud) {
		this.latitud = latitud;
	}

	public BigDecimal getLongitud() {
		return longitud;
	}

	public void setLongitud(BigDecimal longitud) {
		this.longitud = longitud;
	}

	
}
