package tema04.EjBasicos01.Ej322;

import java.util.Objects;

public class Reloj {
//01
	private Integer hora;
	private Integer minuto;
	private Integer segundo;
	private Boolean formato24h;

//02
	public Reloj() {
		this.hora = 00;
		this.minuto = 00;
		this.segundo = 00;
		this.formato24h = true;
	}

	public Reloj(Integer hora, Integer minuto, Integer segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
		this.formato24h = true;
	}

//03
	public Integer getHora() {
		return hora;
	}

	public Integer getMinuto() {
		return minuto;
	}

	public Integer getSegundo() {
		return segundo;
	}

	public Boolean isFormato24h() {
		return formato24h;
	}

//04 	// métodos ponerEnHora:
	// a. Uno sólo recibe horas y minutos. (Los segundos no se cambiarían)//Si solo
	// recibe es VOID
	public void ponerEnHora(Integer hora, Integer minuto) {
		this.hora = hora;
		this.minuto = minuto;
	}

	// b. Otro que recibe horas, minutos y segundos
	public void ponerEnHora(Integer hora, Integer minuto, Integer segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}

	// Método set para formato24Horas
	public void setFormato24h(Boolean formato24h) {
		this.formato24h = formato24h;
	}

	// Método check para validar la hora
	public Boolean check() {
		Boolean v = true;
		if ((hora >= 00 && hora <= 23) && (minuto >= 00 && minuto <= 59) && (segundo >= 00 && segundo <= 59)) {
			return v;
		}
		return v = false;
	}

	// Método TO_STRING
	@Override
	public String toString() {
		if (!check()) {
			return "HORA INCORRECTA";
		}
		String respuesta = "";
		if (this.formato24h = true) {
			respuesta = hora + ":" + minuto + ":" + segundo;
			return respuesta;
		} else {
			if (hora >= 12) {
				return respuesta = ((hora - 12) + ":" + minuto + ":" + segundo + "am");
			} else {
				return respuesta = (hora + ":" + minuto + ":" + segundo + "pm");
			}
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(hora, minuto, segundo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reloj other = (Reloj) obj;
		return Objects.equals(hora, other.hora) && Objects.equals(minuto, other.minuto)
				&& Objects.equals(segundo, other.segundo);
	}
	
	

}
