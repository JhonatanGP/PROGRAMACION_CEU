package Tema02.ej03PrácticosRepaso;

import java.util.Scanner;

public class Ej22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Números del 1 al 10.\nPulse enter para comenzar.");
		sc.nextLine();

		for (int i = 1; i <= 10; i++) {
			System.out.print(i);
			sc.nextLine();
		}
		System.out.println("¡Fin del programa!");

		sc.close();
	}
}
