package Tema02.ej03PrácticosRepaso;

import java.util.Scanner;

public class Ej12Belen {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Indica la dimensión del tablero:");
		Integer d = sc.nextInt();

		for (int x = 0; x < d; x++) {
			if (x == 0) {
				System.out.print(" __");
			} else {
				System.out.print("___");
			}
		}
		System.out.println();

		for (int f = 0; f < d; f++) {
			for (int c = 0; c < d; c++) {
				System.out.print("|__");
			}
			System.out.println("|");
		}
		sc.close();
	}
}
