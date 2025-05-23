package tema04.EjBasicos01.Ej57;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class App {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Map<String, List<String>> mapa = new HashMap<>();

		while (true) {
			System.out.println("Escribe palabras: ");
			String palabras = scanner.nextLine();
			if (palabras.equalsIgnoreCase("FIN")) {
				System.out.println("FIN de programa: ");
				break;
			}
			String letra = palabras.substring(0, 1).toUpperCase();
			if (!mapa.containsKey(letra)) {
				mapa.put(letra, new ArrayList<>());
			}
			mapa.get(letra).add(palabras);
		}

		// IMPRIMIR
		while (true) {
			List<List<String>> contador = new ArrayList<>();
			System.out.print("Dime una letra: ");
			String letra = scanner.nextLine().trim().toUpperCase();

			if (letra.equalsIgnoreCase("FIN") || letra.length() != 1) {
				System.out.println("¡Gracias por jugar! Bye.");
				break;
			}
			Set<Entry<String, List<String>>> palabras = mapa.entrySet();
			for (Entry<String, List<String>> entry : palabras) {
				if (letra.equals(entry.getKey())) {
					contador.add(entry.getValue());
				}
			}
			if (contador.isEmpty()) {
				System.out.println("No hay palabras que empiecen por " + letra + ".");
			} else {
				List<String> pal = contador.get(0);
				System.out.println("Hay " + pal.size() + " palabra(s) que empiezan por " + letra + ":");
				for (String palabra : pal) {
					System.out.println("\t> " + palabra);
				}
			}
		}
		scanner.close();
	}
}
