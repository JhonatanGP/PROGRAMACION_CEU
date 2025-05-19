package exAlmacen.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BultoCorrosivo extends Bulto{
	private Boolean voluminoso;

	public BultoCorrosivo(String descripcion, BigDecimal peso) {
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
			return new BigDecimal(40).setScale(2,RoundingMode.HALF_UP);
		} return new BigDecimal(20).setScale(2,RoundingMode.HALF_UP);
	}
}
