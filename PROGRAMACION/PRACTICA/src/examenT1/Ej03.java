package examenT1;

import java.util.Random;
import java.util.Scanner;

public class Ej03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		boolean v = false;
		boolean rep = true;
		String guardar = "";
		do {
			System.out.println("Escribe una frase :");
			String frase = sc.nextLine();
			// int num = Integer.parseInt(frase);
			int longitud = frase.length();
			if (longitud < 10) {
				System.out.println("La frase no es correcta.");
			} else {
				String nf = frase.toLowerCase();
				String[] sin = nf.split(" ");
				for (int i = 0; i < sin.length; i++) {
					guardar += sin[i];
				}
				System.out.println("Nueva frase: " + guardar);
				do {
					Integer aleatorio1 = r.nextInt(0, guardar.length());
					Integer aleatorio2 = r.nextInt(0, guardar.length());

					if (aleatorio1 == aleatorio2) {
						rep = false;
					} else {
						System.out.println("Números generados: " + aleatorio1 + " - " + aleatorio2);
						if (aleatorio1 > aleatorio2) {
							String mensaje = guardar.substring(aleatorio2, aleatorio1);
							System.out.println("Subcadena: " + mensaje);
						} else {
							String mensaje = guardar.substring(aleatorio1, aleatorio2);
							System.out.println("Subcadena: " + mensaje);
						}

						break;
					}
				} while (rep);

				break;
			}
		} while (v);
		sc.close();
	}

}
