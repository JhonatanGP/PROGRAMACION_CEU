package Tema02.ej03PrácticosRepaso;

import java.util.Random;
import java.util.Scanner;

public class Ej15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		Integer na = r.nextInt(0, 10);
		Boolean v = true;
		Integer p = 10;

		System.out.print("Adivine el número: ");
		do {
			Integer n = sc.nextInt();
			if (n <= 9) {
				if (na != n) {
					System.out.println("Número incorrecto.\nInténtalo de nuevo:");
					p = p - 1;
					if (p == 0) {
						System.out.println("Te has quedado sin vidas. Puntuación: 0 puntos.");
						break;
					}
					v = true;
				} else if (na == n) {
					System.out.println("¡Felicidades! Número correcto.\nPuntuación: " + p + " puntos.");
					v = false;
				}
			} else {
				System.out.println("El número debe ser 0-9");
			}
		} while (v);

		sc.close();
	}
}
