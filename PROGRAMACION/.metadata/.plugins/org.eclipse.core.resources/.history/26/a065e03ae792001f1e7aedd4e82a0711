package ej03PrácticosRepaso;

import java.util.Scanner;

public class Ej09 {

	public static final String HOLA = "hola";
	public static final String HASTA_LUEGO = "hastaluego";
	public static final String ADIOS = "adiós";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Boolean v = true;
		String mensaje ="";
		do {
			System.out.println("Ingresa un texto:");
			String t = sc.nextLine();

			if (t.startsWith(HOLA) && t.endsWith(HASTA_LUEGO)) {
				mensaje = t.substring(t.indexOf('a') + 1, t.lastIndexOf(HASTA_LUEGO));
				System.out.println("Lo he entendido. Mensaje: " + mensaje.trim() + ".");
				// v = false; // esto es para salir directamente y no pregunte de nuevo: Ingrese
				// un texto.

			} else if (t.startsWith(HOLA) && t.endsWith(ADIOS)) {
				System.out.println("Lo he entendido. Mensaje: " + mensaje.trim() + ".");
				 v = false; // esto es para salir directamente y no pregunte de nuevo: Ingrese
				// un texto.
			}

			else {
				System.out.println("No lo he entendido.");
				v = true;
			}

		} while (v);

		sc.close();

	}

}
