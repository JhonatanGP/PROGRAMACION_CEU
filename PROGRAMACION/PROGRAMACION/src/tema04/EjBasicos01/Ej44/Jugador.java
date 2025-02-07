package tema04.EjBasicos01.Ej44;

import java.util.Objects;

public class Jugador {
	//01
	private String nombre;
	private EquipoCombate equipoCombate;
	
	//02
	public Jugador() {
		super();
	}
	//03
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public EquipoCombate getEquipoCombate() {
		return equipoCombate;
	}
	public void setEquipoCombate(EquipoCombate equipoCombate) {
		this.equipoCombate = equipoCombate;
	}
	//04
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", equipoCombate=" + equipoCombate + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(equipoCombate);
	}
	
	
	
	


}
