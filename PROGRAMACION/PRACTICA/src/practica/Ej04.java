package practica;

import java.util.Scanner;

public class Ej04 {

	public static void main(String[] args) {
		Integer[] array = new Integer[] { 7, 9, 4, 6, 1, 3, 2, 5, 8 };
		Scanner sc = new Scanner(System.in);
		Boolean encontrado = true;

		while (encontrado) {
			System.out.println("Escribe un palabra: ");
			String p = sc.nextLine();
			// Averiguo la longitud de la palabra
			Integer longitud = p.length();
			Boolean rep = false;

			for (int i = 0; i < array.length; i++) {
				if (longitud == array[i]) {
					System.out.println("La palabra tiene una longitud igual que el número que está en la posición " + i);
					encontrado = false;
					rep = true;
					break;
				}
			}
			if (!rep) {
				System.out.println("No hay ningún número con la longitud de esa palabra.");
			}
		}
	}
}