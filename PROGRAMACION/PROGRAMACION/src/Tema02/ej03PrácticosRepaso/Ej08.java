package Tema02.ej03PrácticosRepaso;

import java.util.Scanner;

public class Ej08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Boolean v = true;
		do {
			System.out.println("Ingresa un texto:");
			String t = sc.nextLine();

			// Primero hola
			Integer primero = t.indexOf(" ");// busca el 1 espacio
			String p1 = t.substring(0, primero + 1);

			// Segundo hastaluego
			Integer segundo = t.lastIndexOf(" ");// busca el 2 espacio
			String p2 = t.substring(segundo, t.length()); // Probar +1 luego

			// Mensaje. Para mensaje no hace falta Integer
			String mensaje = t.substring(primero, segundo);
			// System.out.println(mensaje); el syso lo escribo para probar que es lo que
			// coge.

			if (t.startsWith("hola") && t.endsWith("hastaluego")) {
				System.out.println("Lo he entendido. Mensaje: " + mensaje + ".");
				v = false; // esto es para salir directamente y no pregunte de nuevo: Ingrese un texto.
			} else {
				System.out.println("No lo he entendido.");
			}

		} while (v);
		sc.close();

	}

}
