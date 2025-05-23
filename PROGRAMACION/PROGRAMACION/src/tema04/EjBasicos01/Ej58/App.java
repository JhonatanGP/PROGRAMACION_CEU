package tema04.EjBasicos01.Ej58;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Diccionario diccionario = new Diccionario();
		List<String> palabras = new ArrayList<>();

		Scanner scanner = new Scanner(System.in);
		String palabra;

		do {
			System.out.println("Dime una palabra:");
			palabra = scanner.nextLine();
			if (palabra.equalsIgnoreCase("FIN"))
				break;
			palabras.add(palabra);

		} while (!palabra.equalsIgnoreCase("FIN"));

		diccionario.cargarDiccionario(palabras);

		String letra;
		do {
			System.out.println("Dime una letra:");
			letra = scanner.nextLine();
			if (letra.equalsIgnoreCase("FIN"))
				break;

			diccionario.imprimirPalabras(letra);

		} while (!letra.equalsIgnoreCase("FIN"));
		System.out.println("Gracias por jugar con nosotros!!");

		scanner.close();
	}
}
