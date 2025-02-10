package tema04.EjBasicos01.Ej44;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// 01
public class EquipoCombate {
	private List<Personaje> personaje;
	private Integer totalPuntosVida ;
	
// 02
	public EquipoCombate() {
		super();
		this.personaje = new ArrayList<>();
		this.totalPuntosVida = 0;
	}

// 03
	public List<Personaje> getPersonaje() {
		return personaje;
	}

	public void setPersonaje(List<Personaje> personaje) {
		this.personaje = personaje;
	}

	public Integer getTotalPuntosVida() {
		return totalPuntosVida;
	}

	public void setTotalPuntosVida(Integer totalPuntosVida) {
		this.totalPuntosVida = totalPuntosVida;
	}

	// 04

	@Override
	public int hashCode() {
		return Objects.hash(personaje, totalPuntosVida);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EquipoCombate other = (EquipoCombate) obj;
		return Objects.equals(personaje, other.personaje) && Objects.equals(totalPuntosVida, other.totalPuntosVida);
	}

	@Override
	public String toString() {
		return "EquipoCombate [personaje=" + personaje + ", totalPuntosVida=" + totalPuntosVida + "]";
	}
	



	

}
