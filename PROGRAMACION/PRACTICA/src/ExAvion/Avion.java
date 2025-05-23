package ExAvion;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Avion {
//01
	private String compañia;
	private LocalDate fechaFab;
	private List<Asiento> lista;

//02
	public Avion(String compañia) {
		this.compañia = compañia;
		this.fechaFab = LocalDate.of(2000, Month.JANUARY, 1);
		this.lista = new ArrayList<>();
	}

//03
	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	public LocalDate getFechaFab() {
		return fechaFab;
	}

	public void setFechaFab(LocalDate fechaFab) {
		this.fechaFab = fechaFab;
	}

	public List<Asiento> getLista() {
		return lista;
	}

	public void setLista(List<Asiento> lista) {
		this.lista = lista;
	}

	public void agregarAsiento(Asiento asiento) {
		lista.add(asiento);
	}

//03
	public Integer getAntiguedad() {
		LocalDate hoy = LocalDate.now();
		Period p = this.fechaFab.until(hoy);
		return p.getYears();
	}
	public Integer getCantidadAsientosOcupados() {
		Integer contador = 0;
		for (Asiento asiento : lista) {
			if (asiento.getOcupado() == true) {
				contador++;
			}
		}
		return contador;
	}
	public List<Asiento> getListaAsientoLibres() {// Creo otra lista en la que guardo los que esten libres
		List<Asiento> libre = new ArrayList<>();
		for (Asiento asiento : lista) {
			if (asiento.getOcupado() == false) {
				libre.add(asiento);
			}
		}
		return libre;
	}

	public void establecerPrecioBaseAsiento(BigDecimal precioBase) {// Para cambiar el precio recorro la lista y
		for (Asiento asiento : lista) { // con set cambio el precio.
			asiento.setPrecio(precioBase);
		}
	}
	public BigDecimal getPrecioMedioVenta() {
		BigDecimal total = BigDecimal.ZERO;
		for (Asiento asiento : lista) {
			total = total.add(asiento.getPrecioVenta());
		}
		return (total.divide(new BigDecimal(lista.size()))).setScale(2, RoundingMode.HALF_UP);
	}

	public Asiento getAsientoLibreMasBarato() {
		Asiento asientoLibre = null;
		for (Asiento asiento : lista) {
			if (asiento.getOcupado() == false) {
				if (asientoLibre == null || asiento.getPrecioVenta().compareTo(asientoLibre.getPrecio()) < 0) {
					asientoLibre = asiento;
				}
			}
		}
		return asientoLibre;
	}

	public void eliminarAsientoFila(Integer fila) {
		Iterator<Asiento> it = lista.iterator();
		while (it.hasNext()) {
			if (it.next().getFila().equals(fila)) {
				it.remove();
			}
		}
	}

	@Override
	public String toString() {
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String fecha = fechaFab.format(f);
		return "Compañía: " + compañia + ". Fabricación: " + fecha;
	}

}
