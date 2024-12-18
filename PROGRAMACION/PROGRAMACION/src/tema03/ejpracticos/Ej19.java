package tema03.ejpracticos;

import java.util.Random;
import java.util.Scanner;

public class Ej19 {

	public static void main(String[] args) {
		// 1. Creo el array con las palabras que me dice
		String[] lista = new String[] { "azulejo", "tenedor", "saltamontes", "carretilla", "molinero", "sofisticado",
				"terremoto", "culinario", "teclado", "primavera" };
		// Creo el Random r para que eliga una palabra de mi array
		Random r = new Random();
		Integer aleatorio = r.nextInt(lista.length);
		String pal = lista[aleatorio]; // variable que de mi array escoge una palabra aleatoria

		String[] juego = new String[pal.length()];// la palabra escogida aleatoriamente antes la guardo en un array
		juego[0] = pal.substring(0, 1);// accedo a la primera posición y muestro la primera letra
		for (int i = 1; i < pal.length(); i++) { // con el for i=1 relleno los huecos con _ _
			juego[i] = "_";
		}
		/* Juego */
		Scanner sc = new Scanner(System.in);
		int fallo = 0;
		int vidas = 10;
		boolean game = true;

		while (game) {
			System.out.print("Palabra: ");
			for (String letras : juego) { //foreach llamado letras e imprimo el array juego
				System.out.print(letras + " ");
			}
			System.out.println();
			System.out.print("Escribe una letra:");
			String letra = sc.nextLine();

			Integer letrasAcertadas = 0;
			for (int i = 1; i < pal.length(); i++) {
				if (pal.substring(i, i + 1).equals(letra)) {
					juego[i] = letra;
					letrasAcertadas++;
				}
			}
			if (letrasAcertadas == 0) {
				fallo++;
				System.err.println("Letra incorrecta | Fallos: " + fallo);
			}
			if (fallo >= vidas) {
				System.err.println("Fin del JUEGO, la palabra es...\n" + pal);
				break;
			}
			Boolean f = true;
			for (String pal2 : juego) {
				if (pal2.equals("_")) {
					f = false;
					break;
				}
			}
			if (f) {
				System.out.println("¡Felicidades! Has adivinado la palabra: " + pal);
				break;
			}
		}
		sc.close();
	}
}
