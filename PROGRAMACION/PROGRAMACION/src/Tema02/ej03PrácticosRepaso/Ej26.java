package Tema02.ej03PrácticosRepaso;

import java.util.Random;
import java.util.Scanner;

public class Ej26 {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		Boolean v = true;
		String[] juego = { "piedra", "papel", "tijera" };

		do {
			System.out.println("Piedra, papel, tijera... 1, 2 , 3 ... ya!!");
			String p = sc.nextLine().toLowerCase();
			Integer na = r.nextInt(0, 3);
			String m = juego[na];

			if (!p.equals("piedra") && !p.equals("papel") && !p.equals("tijera")) {
				System.out.println("Opción no válida. Debe ser piedra, papel o tijera.");
			}

			if (p.equals(m)) {
				System.out.println(p + " vs " + m + " = Empate");

			} else if (p.equals("piedra") && m.equals("papel")) {
				System.out.println(p + " vs " + m + " = Tu pierdes.");

			} else if (p.equals("piedra") && m.equals("tijera")) {
				System.out.println(p + " vs " + m + " = Ganas.");
				
			}else if (p.equals("papel") && m.equals("tijera")) {
				System.out.println(p + " vs " + m + " = Pierdes.");

			}else {
				System.out.println("");
			}

		} while (v);

		sc.close();
	}
}
