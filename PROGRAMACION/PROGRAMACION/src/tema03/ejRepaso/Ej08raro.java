package tema03.ejRepaso;

import java.util.Scanner;

public class Ej08raro {

	public static void main(String[] args) {

		// Crear un Scanner para recibir el HTML del usuario
		Scanner scanner = new Scanner(System.in);

		System.out.println("Escribe tu HTML:");
		String html = scanner.nextLine();

		// Extraer el texto eliminando las etiquetas HTML usando una expresión regular
		String textoExtraido = html.replaceAll("<[^>]*>", "");

		// Mostrar el resultado
		System.out.println("Texto extraído:");
		System.out.println(textoExtraido);

		// Cerrar el scanner
		scanner.close();
	}

}
