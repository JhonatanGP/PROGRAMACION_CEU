package ExAvion;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Primera extends Asiento{

	public Primera(Integer fila, String letra) {
		super(fila, letra);
	}

	@Override
	public BigDecimal getPrecioVenta() {
		return getPrecio().add(getPrecio().multiply(new BigDecimal(0.2))).setScale(2,RoundingMode.HALF_DOWN);
	}

}
