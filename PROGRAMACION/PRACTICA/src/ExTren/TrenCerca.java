package ExTren;

public class TrenCerca extends Tren{
	
	private Integer numPlazaAdic;

	public TrenCerca(String ciudad, Integer capacidad) {
		super(ciudad, capacidad);
	}

	@Override
	public Integer getVelocidad() {
		
		return 120;
	}

	@Override
	public Integer getCapacidadTotal() {
		return this.getCapacidad()+numPlazaAdic;
	}

}
