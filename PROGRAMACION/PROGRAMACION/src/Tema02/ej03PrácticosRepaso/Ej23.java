package Tema02.ej03PrácticosRepaso;

import java.util.Random;
import java.util.Scanner;

public class Ej23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		Boolean v = true;
		Integer cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0, cont6 = 0;

		System.out.println("¿Cuántas veces quieres lanzar el dado?");
		Integer n = sc.nextInt();
		sc.nextLine();
		do {
			for (int i = 1; i <= n; i++) {
				Integer d = r.nextInt(1, 7);
				System.out.print("Tiro " + i + ": " + d);
				sc.nextLine();
				if (d == 1) {
					cont1++;
				}
				if (d == 2) {
					cont2++;
				}
				if (d == 3) {
					cont3++;
				}
				if (d == 4) {
					cont4++;
				}
				if (d == 5) {
					cont5++;
				}
				if (d == 6) {
					cont6++;
				}
				v = false;
			}
		} while (v);
		System.out.println("Ya no tienes más tiradas.\nResultados de lanzamientos:");
		System.out.println("El número 1 ha salido " + cont1 + " veces.");
		System.out.println("El número 2 ha salido " + cont2 + " veces.");
		System.out.println("El número 3 ha salido " + cont3 + " veces.");
		System.out.println("El número 4 ha salido " + cont4 + " veces.");
		System.out.println("El número 5 ha salido " + cont5 + " veces.");
		System.out.println("El número 6 ha salido " + cont6 + " veces.");

		sc.close();
	}
}
