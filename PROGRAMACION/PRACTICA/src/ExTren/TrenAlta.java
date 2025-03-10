package ExTren;

import java.time.LocalDate;

public class TrenAlta extends Tren {

	public TrenAlta(String ciudad, Integer capacidad) {
		super(ciudad, capacidad);
	}

	@Override
	public Integer getVelocidad() {
		if (getFechaFab().isAfter(LocalDate.now())) {
			return 360;
		}
		return 280;
	}

	@Override
	public Integer getCapacidadTotal() {
		return this.getCapacidad();
	}

}
