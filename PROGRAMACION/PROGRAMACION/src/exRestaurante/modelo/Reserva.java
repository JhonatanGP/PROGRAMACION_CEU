package exRestaurante.modelo;

import java.time.LocalDate;
import java.time.Period;

public class Reserva {
//01
	private LocalDate fecha;
	private Integer n_personas;
	private Boolean confirmada;
//02
	public Reserva(LocalDate fecha, Integer n_personas){
		super();
		this.fecha = fecha;
		this.n_personas = n_personas;
		this.confirmada = false;
	}	
//03
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public Integer getN_personas() {
		return n_personas;
	}
	public void setN_personas(Integer n_personas) {
		this.n_personas = n_personas;
	}
	public Boolean getConfirmada() {
		return confirmada;
	}
	public void setConfirmada(Boolean confirmada) {
		this.confirmada = confirmada;
	}
	public Boolean isProxima() {
		LocalDate hoy = LocalDate.now();
		Period periodo = this.fecha.until(hoy);
		if (periodo.getDays() <= 3) {
			return true;
		}
		return false;
	}
}
