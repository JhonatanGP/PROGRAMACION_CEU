package ExAvion;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Normal extends Asiento{

	public Normal(Integer fila, String letra) {
		super(fila, letra);
	}

	@Override
	public BigDecimal getPrecioVenta() {
		return getPrecio().setScale(2,RoundingMode.HALF_DOWN);
	}

}
