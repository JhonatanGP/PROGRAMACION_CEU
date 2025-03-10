package tema04.EjBasicos01.Ej42;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Equipo {
	// 1 ATRIBUTOS
	private String nombre;
	private Jugador capitan;
	private List<Jugador> jugadores;
	private static String competicion;
	
	// 2 CONSTRUCTORES
	public Equipo(String nombre) {
		super();
		this.nombre = nombre;
		jugadores = new ArrayList<>(); 
	}

	// 3 GET AND SET 
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Jugador getCapitan() {
		return capitan;
	}

	public void setCapitan(Jugador capitan) {
		this.capitan = capitan;
	}

	public List<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	
	public String getCompeticion() {
		return competicion;
	}

	public static void setCompeticion(String competicion) {
		Equipo.competicion = competicion;
	}

	// 4. MÉTODOS
	// EQUALS
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipo other = (Equipo) obj;
		return Objects.equals(nombre, other.nombre);
	}

	// TO STRING
	@Override
	public String toString() {
		return "Equipo: " + nombre + ", capitan: " + capitan + ", jugadores: " + jugadores + ", competicion:"
				+ competicion + ".";
	}

	
	
	
}
