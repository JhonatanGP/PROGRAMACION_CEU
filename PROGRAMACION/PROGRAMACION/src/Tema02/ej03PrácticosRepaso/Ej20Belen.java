package Tema02.ej03PrácticosRepaso;

public class Ej20Belen {

	public static void main(String[] args) {

		Integer t = 5;

		for (int i = 0; i < t; i++) {
			for (int j = 0; j < t; j++) {
				if (i == j) {
					System.out.print("* ");

				} else {
					System.out.print("- ");
				}
			}
			System.out.println();
		}
	}
}
