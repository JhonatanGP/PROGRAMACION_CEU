package tema04.EjBasicos01.Ej32;

public class Reloj {
	// 01
	private int hora;
	private int minuto;
	private int segundo;
	private boolean formato24h;

	// 02
	public Reloj() {
		super();
		this.hora = 0;
		this.minuto = 0;
		this.segundo = 0;
		this.formato24h = true;
	}

	public Reloj(int hora, int minuto, int segundo) {
		super();
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
		this.formato24h = true;
	}

	// 03

	public int getHora() {
		return hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public int getSegundo() {
		return segundo;
	}

	public boolean isFormato24h() {
		return formato24h;
	}

	// 04
	public void ponerEnHora(int hora, int minuto) {
		this.hora = hora;
		this.minuto = minuto;
	}

	public void ponerEnHora(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	public void setFormato24h(boolean formato24h) {
		this.formato24h = formato24h;
	}
	
	public Boolean check( ) {
		if(hora >23||hora<0) {
			return false;
		}
		if(minuto >59||minuto<0) {
			return false;
		}
		if(segundo >50||segundo<0) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		if (!check()) {
			return "Hora incorrecta";
		}
		if (formato24h) {
			
		}
		String franja = "";
		Integer horaRestada = hora;
		if(hora<=12) {
			franja = " AM";
		}
		else {
			
		}
		return "Reloj [hora=" + hora + ", minuto=" + minuto + ", segundo=" + segundo + ", formato24h=" + formato24h
				+ "]";
	}
	
	// TO_STRING

}
