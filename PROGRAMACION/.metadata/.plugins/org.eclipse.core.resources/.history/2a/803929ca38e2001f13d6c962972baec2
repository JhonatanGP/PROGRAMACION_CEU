package tema04.EjBasicos01.Ej41;

import java.util.Objects;

public class Jugador {
	// 1 ATRIBUTOS
	private String nombre;
	private int dorsal;
	
	// 2 CONSTRUCTORES
	public Jugador(String nombre, int dorsal) {
		super();
		this.nombre = nombre;
		this.dorsal = dorsal;
	}

	// 3 GET AND SET
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getDorsal() {
		return dorsal;
	}


	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	// 4 MÉTODOS
	// EQUALS()
	@Override
	public int hashCode() {
		return Objects.hash(dorsal);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jugador other = (Jugador) obj;
		return dorsal == other.dorsal;
	}
	// TO STRING()

	@Override 
	public String toString() {
		return "Jugador: " +  dorsal + " - " + nombre + ".";
	}
	
}
