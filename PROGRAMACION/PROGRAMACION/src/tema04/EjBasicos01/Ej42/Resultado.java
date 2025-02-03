package tema04.EjBasicos01.Ej42;

import java.util.Objects;

public class Resultado {
	// 1 ATRIBUTOS
	private int golesLocales;
	private int golesVisitantes;
	
	// 2 CONSTRUCTORES
	public Resultado(int golesLocales, int golesVisitantes) {
		super();
		this.golesLocales = 0;
		this.golesVisitantes = 0;
	}
	
	// 3 GET AND SET
	public int getGolesLocales() {
		return golesLocales;
	}

	public void setGolesLocales(int golesLocales) {
		this.golesLocales = golesLocales;
	}

	public int getGolesVisitantes() {
		return golesVisitantes;
	}

	public void setGolesVisitantes(int golesVisitantes) {
		this.golesVisitantes = golesVisitantes;
	}

	// 4 MÉTODOS
	// EQUALS
	@Override
	public int hashCode() {
		return Objects.hash(golesLocales, golesVisitantes);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Resultado other = (Resultado) obj;
		return golesLocales == other.golesLocales && golesVisitantes == other.golesVisitantes;
	}
	// TO STRING

	@Override
	public String toString() {
		return "Resultado: " + golesLocales + " - " + golesVisitantes + ".";
	}

	// isVictoriaLocal() que devuelve Boolean si han ganado los locales
	public Boolean isVictoriaLocal() {
		if(golesLocales < golesVisitantes) {
			return false;
		}/*else(golesLocales > golesVisitantes){
			return true;
		}*/
		return true;
	}
	// isVictoriaVisitante() que devuelve Boolean si han ganado los visitantes
	public Boolean isVictoriaVisitante() {
		if(golesVisitantes < golesLocales) {
			return false;
		}/*else(golesLocales > golesVisitantes){
			return true;
		}*/
		return true;
	}
	// isEmpate() que devuelve Boolean si ha sido empate
	public Boolean isEmpate() {
		if(golesVisitantes == golesLocales) {
			return true;
		}
		return false;
	}
}
