package Tema02.ej03PrácticosRepaso;

import java.util.Scanner;

public class Ej21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Boolean v = true;

		do {
			System.out.println("Escribe el tamaño del cuadrado:");
			Integer n = sc.nextInt();
			if (n == 0) {
				System.out.println("El número debe ser mayor que 0.\nInténtelo de nuevo.");
			} else {
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						if (i == j) {
							System.out.print("* ");
						} else {
							System.out.print("- ");
						}
					}
					System.out.println();
					v = false;
				}
			}
		} while (v);
		sc.close();
	}
}
