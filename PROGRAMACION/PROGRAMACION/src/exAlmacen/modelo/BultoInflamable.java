package exAlmacen.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BultoInflamable extends Bulto{
	private Boolean voluminoso;

	public BultoInflamable(String descripcion, BigDecimal peso) {
		super(descripcion, peso);
		this.voluminoso = false;
	}

	public Boolean isVoluminoso() {
		return voluminoso;
	}

	public void setVoluminoso(Boolean voluminoso) {
		this.voluminoso = voluminoso;
	}
	
	@Override
	public BigDecimal getSobrecosteDiario() {
		if(voluminoso = true) {
			return new BigDecimal(60).setScale(2,RoundingMode.HALF_UP);
		} return new BigDecimal(30).setScale(2,RoundingMode.HALF_UP);
	}
}
