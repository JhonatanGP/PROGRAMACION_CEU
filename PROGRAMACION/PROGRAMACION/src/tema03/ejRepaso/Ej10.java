package tema03.ejRepaso;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Escribe tu HTML: ");
		String html = scanner.nextLine();

		String[] separar = html.split("");
		Boolean confirmarEtiqueta = false;
		String extraer = "";
		Boolean body = false; // Escribir fuera de etiquetas

		for (String caracter : separar) {
			if (caracter.equals("<")) {
				confirmarEtiqueta = true;
				if (body == true) {
					extraer += "\n"; // Salto de línea
					body = false;
				}
			} else if (caracter.equals(">")) {
				confirmarEtiqueta = false;
			} else if (confirmarEtiqueta == false) {
				extraer += caracter; // Agrega cuando no hay etiquetas
				body = true;
			}
		}
		System.out.println("Texto extraído:\n" + extraer.trim());

		scanner.close();
	}

}