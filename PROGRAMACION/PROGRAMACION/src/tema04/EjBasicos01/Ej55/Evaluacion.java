package tema04.EjBasicos01.Ej55;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Evaluacion {
//01
	private Map<String, BigDecimal> mapa;

//02
	public Evaluacion() {
		this.mapa = new HashMap<>();
	}

//03
	public Map<String, BigDecimal> getMapa() {
		return mapa;
	}

	public void setMapa(Map<String, BigDecimal> mapa) {
		this.mapa = mapa;
	}

//04
	public boolean addNota(String dni, BigDecimal nota) {

		if (!mapa.containsKey(dni)) {
			mapa.put(dni, nota);
		}
		return true;
	}

	public boolean corregirNota(String dni, BigDecimal nota) {
		if (mapa.containsKey(dni)) {
			mapa.put(dni, nota);
			return true;
		}
		return false;
	}

	public BigDecimal obtenerNotaAlumno(String dni) {
		if (this.mapa.containsKey(dni)) {
			return this.mapa.get(dni);
		}
		return BigDecimal.ZERO;
	}

	public BigDecimal obtenerNotaMedia() {
		Set<Entry<String, BigDecimal>> mapa1 = mapa.entrySet();
		BigDecimal suma = BigDecimal.ZERO;

		for (Entry<String, BigDecimal> par : mapa1) {
			suma = suma.add(par.getValue());
		}
		return suma.divide(new BigDecimal(mapa.size()), 2, RoundingMode.HALF_DOWN);
	}

	public Integer obtenerCantidadAprobados() {
		Set<Entry<String, BigDecimal>> mapa1 = mapa.entrySet();
		Integer cont = 0;

		for (Entry<String, BigDecimal> par : mapa1) {
			if (par.getValue().compareTo(new BigDecimal(5)) >= 0) {
				cont++;
			}
		}
		return cont;
	}

	public List<String> obtenerSuspensos() {
		Set<Entry<String, BigDecimal>> mapa1 = mapa.entrySet();
		List<String> dniSuspensos = new ArrayList<>();

		for (Entry<String, BigDecimal> par : mapa1) {
			if (par.getValue().compareTo(new BigDecimal(5)) < 0) {
				dniSuspensos.add(par.getKey());
			}
		}
		return dniSuspensos;
	}

	public void borrarAprobados() {
		Iterator<Map.Entry<String, BigDecimal>> borrar = mapa.entrySet().iterator();

		while (borrar.hasNext()) {
			if (borrar.next().getValue().compareTo(new BigDecimal(5)) >= 0) {
				borrar.remove();
			}
		}
	}

	@Override
	public String toString() {
		Set<Entry<String, BigDecimal>> mapa1 = mapa.entrySet();

		String aprobados = "";
		String suspensos = "";

		for (Entry<String, BigDecimal> par : mapa1) {
			if (par.getValue().compareTo(new BigDecimal(5)) >= 0) {
				aprobados +=  "\t" + par.getKey() + ": " + par.getValue() + "\n";

			} else {
				suspensos += "\t" + par.getKey() + ": " + par.getValue() + "\n";
			}
		}
		return "Aprobados: \n" + aprobados + "Suspensos: \n" + suspensos;
	}

}
