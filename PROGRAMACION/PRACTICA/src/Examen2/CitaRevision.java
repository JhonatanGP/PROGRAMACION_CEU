package Examen2;

public class CitaRevision extends Cita {
	private Integer numRevision;

	public CitaRevision(String nombre, Integer numRevision) {
		super(nombre);
		this.numRevision = numRevision;
	}

	public Integer getNumRevision() {
		return numRevision;
	}

	public void setNumRevision(Integer numRevision) {
		this.numRevision = numRevision;
	}
}
