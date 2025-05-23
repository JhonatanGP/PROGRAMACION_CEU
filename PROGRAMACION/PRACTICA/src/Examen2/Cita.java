package Examen2;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Cita {
	// 01
	private LocalDate fecha;
	private Integer hora;
	private String nombre;
	private Boolean seguroMedico;
	private Boolean facturada;
	private CitaRevision numeroRev;

	// 02
	public Cita(String nombre) {
		super();
		this.nombre = nombre;
		this.seguroMedico = false;
		this.facturada = false;
	}

	public Cita(LocalDate fecha, Integer hora, String nombre, Boolean seguroMedico) {
		super();
		if (seguroMedico == true) {
			this.fecha = fecha;
			this.hora = hora;
			this.nombre = nombre;
			this.seguroMedico = seguroMedico;
		}
		this.facturada = false;
	}

	// 03
	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Integer getHora() {
		return hora;
	}

	public void setHora(Integer hora) {
		this.hora = hora;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean getSeguroMedico() {
		return seguroMedico;
	}

	public void setSeguroMedico(Boolean seguroMedico) {
		this.seguroMedico = seguroMedico;
	}

	public Boolean getFacturada() {
		return facturada;
	}

	public void setFacturada(Boolean facturada) {
		this.facturada = facturada;
	}

	public CitaRevision getNumero() {
		return numeroRev;
	}

	public void setNumero(CitaRevision numeroRev) {
		this.numeroRev = numeroRev;
	}

	// 04
	@Override
	public int hashCode() {
		return Objects.hash(fecha, hora);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cita other = (Cita) obj;
		return Objects.equals(fecha, other.fecha) && Objects.equals(hora, other.hora);
	}

	// getImporteFactura() devuelve el importe BigDecimal al que se factura
	public BigDecimal getImporteFactura() {
		if (numeroRev.getNumRevision() != 0) { // Aqui tiene numero de revision, se lecobra 50€
			return new BigDecimal(50).add(new BigDecimal(10));
		} else {
			if (seguroMedico = true) {
				new BigDecimal(100);
			}
			return new BigDecimal(150);
		}
	}

// TO_STRING
	@Override
	public String toString() {
		if (seguroMedico = false) {
			return nombre + " - " + fecha + " - " + hora + " horas" + " - SIN SEGURO";
		}
		return nombre + " - " + fecha + " - " + hora + " horas" + " - CON SEGURO";
	}

	public Integer getDiasHastaCita() {
		LocalDate fechaHoy = LocalDate.now();
		Period period = this.fecha.until(fechaHoy);
		if (this.fecha.isAfter(fechaHoy)) { // si la cita es desp de hoy, ya ha pasado
			return -1;
		}
		return period.getDays();
	}
}
