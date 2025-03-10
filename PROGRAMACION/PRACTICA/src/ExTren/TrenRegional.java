package ExTren;

public class TrenRegional extends Tren {

	private Boolean electrico;

	public TrenRegional(String ciudad, Integer capacidad) {
		super(ciudad, capacidad);
	}

	public Boolean getElectrico() {
		return electrico;
	}

	public void setElectrico(Boolean electrico) {
		this.electrico = electrico;
	}


	@Override
	public Integer getVelocidad() {
		if (electrico == true) {
			return 200;
		}
		return 150;
	}

	@Override
	public Integer getCapacidadTotal() {
		return this.getCapacidad();
	}

}
