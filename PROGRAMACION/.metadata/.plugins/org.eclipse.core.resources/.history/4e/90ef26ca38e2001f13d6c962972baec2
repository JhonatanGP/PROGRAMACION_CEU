package tema04.EjBasicos01.Ej41;

public class Partido {
	// 1 ATRIBUTOS
	private Equipo equipoLocal;
	private Equipo equipoVisitante;
	private Resultado resultado;
		
	// 2 CONSTRUCTORES
	
	public Partido() {
		super();
	}
	// 3 GET AND SET

	public Equipo getEquipoLocal() {
		return equipoLocal;
	}

	public void setEquipoLocal(Equipo equipoLocal) {
		this.equipoLocal = equipoLocal;
	}

	public Equipo getEquipoVisitante() {
		return equipoVisitante;
	}

	public void setEquipoVisitante(Equipo equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}

	public Resultado getResultado() {
		return resultado;
	}

	public void setResultado(Resultado resultado) {
		this.resultado = resultado;
	}
	// 4 MÉTODOS
	// TO STRING
	@Override
	public String toString() {
		return equipoLocal + "  vs " + equipoVisitante + " " + resultado + ".";
	}
	// getEquipoGanador() devuelve el Equipo que haya ganado. Si hay empate, devolverá null. 
	public Equipo getEquipoGanador() { // Este es 
		if(resultado.getGolesLocales() < resultado.getGolesVisitantes()) {
			return equipoVisitante;
		}else if(resultado.getGolesLocales() > resultado.getGolesVisitantes()) {
			return equipoLocal;
		}
		return null;
	}

}
