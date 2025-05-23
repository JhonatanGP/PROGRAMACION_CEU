package Examen2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Agenda {
//01
	private String medico;
	private List<Cita> lista;

//02
	public Agenda(String medico) {
		super();
		this.medico = medico;
	}

//03
	public String getMedico() {
		return medico;
	}

	public void setMedico(String medico) {
		this.medico = medico;
	}

//04
	public void addCita(Cita cita) {
		if (!lista.contains(cita)) {
			lista.add(cita);
		}
	}

	public List<Cita> getCitasDias(LocalDate fecha) {
		List<Cita> citasHoy = new ArrayList<>(); // Creo mi lista donde voy a guardar las citas de hoy
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getFecha().equals(fecha)) {
				citasHoy.add(lista.get(i));
			}
		}
		return citasHoy;
	}

	public BigDecimal getImportePendienteFacturar() {
		BigDecimal suma = BigDecimal.ZERO;
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getFacturada() == false) {
				suma = suma.add(lista.get(i).getImporteFactura());
			}
		}
		return suma.setScale(2, RoundingMode.HALF_DOWN);
	}

	public Boolean tieneCitaProxima(String nombre) {
		LocalDate fechaHoy = LocalDate.now();
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getNombre().equalsIgnoreCase(nombre)) {
				if (lista.get(i).getFecha().isAfter(fechaHoy)) {
					return true;
				}
			}
		}
		return false;
	}

	public void borrarCitasFacturadas() {
		Iterator<Cita> borrar = lista.iterator();
		while (borrar.hasNext()) {
			if (borrar.next().getFacturada() == true) {
				borrar.remove();
			}
		}
	}

	public void facturarCitasPendientes(String nombre) {
		LocalDate fechaHoy = LocalDate.now();
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getNombre().equalsIgnoreCase(nombre)) {
				if (lista.get(i).getFecha().isBefore(fechaHoy)) {
					lista.get(i).setFacturada(true);
				}
			}
		}
	}
}
