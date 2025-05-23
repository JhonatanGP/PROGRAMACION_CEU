package tema04.EjBasicos01.Ej58;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Diccionario {
	private Map<String, List<String>> mapa;

	public Diccionario() {
		this.mapa = new HashMap<>();
	}

	public Map<String, List<String>> getMapa() {
		return mapa;
	}

	public void setMapa(Map<String, List<String>> mapa) {
		this.mapa = mapa;
	}

	public void cargarDiccionario(List<String> palabras) {
		if (palabras != null) {

			for (String palabra : palabras) {
				// Primera letra
				String inicial = palabra.substring(0, 1);
				inicial = inicial.toUpperCase();

				if (mapa.containsKey(inicial)) {
					mapa.get(inicial).add(palabra);
				} else {
					List<String> lista = new ArrayList<>();
					lista.add(palabra);
					mapa.put(inicial, lista);
				}
			}
		}
	}

	public void borrarDiccionario() {
		this.mapa.clear();
	}

	public void imprimirPalabras(String letra) {
		if (letra != null) {
			List<String> lista = mapa.get(letra.toUpperCase());
			if (lista == null) {
				System.out.println("No hay palabras que empiezan por " + letra);
			} else {
				System.out.println("Hay " + lista.size() + " palabras que empiezan por " + letra);
				for (String palabra : lista) {
					System.out.println("\t> " + palabra);
				}
			}
		}
	}
}
