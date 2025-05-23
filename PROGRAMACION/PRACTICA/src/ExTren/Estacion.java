package ExTren;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Estacion {
//01
	private String nombre;
	private List<Tren> listaTren;

//02
	public Estacion(String nombre) {
		this.nombre = nombre;
		this.listaTren = new ArrayList<>();
	}
//03 No hay GET and SET

//04
	public void addTren(Tren tren) {
		listaTren.add(tren);
	}

	public void borrarTrenesCompletos() {
		Iterator<Tren> it = listaTren.iterator();
		while (it.hasNext()) {
			if (it.next().getPlazasLibres() <= 0) {
				it.remove();
			}
		}
	}

	public Tren getProximoTren(String ciudad, Integer hora) {
		for (Tren tren : listaTren) {
			if (tren.getPlazasLibres() > 0) {
				if (tren.getHoraSalida() > hora && tren.getCiudad().equals(ciudad)) {
					return tren;
				}
			}
		}
		return null;
	}

	public Tren getTrenMasRapido(String ciudad) {
		Tren trenRapido = null;
		for (Tren tren : listaTren) {
			if (trenRapido == null || tren.getVelocidad() > trenRapido.getVelocidad()) {
				trenRapido = tren;
			}
		}
		return trenRapido;
	}

	public List<Tren> getListaTrenesAsequibles(BigDecimal precio) {
		List<Tren> trenAseq = new ArrayList<>();
		for (Tren tren : listaTren) {
			if (tren.getPrecio().compareTo(precio) <= 0) {
				trenAseq.add(tren);
			}
		}
		return trenAseq;
	}

	public Tren getTrenPasajero(String dni) {
		for (Tren tren : listaTren) {
			for (Pasajero pas : tren.getListaPas()) {
				if (pas.getDni().equals(dni)) {
					return tren;
				}
			}
		}
		return null;
	}

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
		Estacion other = (Estacion) obj;
		return Objects.equals(nombre, other.nombre);
	}
	
	

}
