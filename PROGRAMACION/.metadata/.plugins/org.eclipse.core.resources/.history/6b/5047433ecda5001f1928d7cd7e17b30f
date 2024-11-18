package tema03.ejRepaso;

import java.util.Scanner;

public class Ej07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe tu telegrama: ");
		String t = sc.nextLine().toUpperCase();
		String[] tg = t.split(" ");
		// Para calcular el precio
		Integer cont = 0; // Para que cuente las palabras

		for (int i = 0; i < tg.length; i++) {
			if (!tg[i].contains("STOP")) {
				cont++;
			}
		}
		Double precio = cont * 0.24d;
		System.out.println("El precio es de: " + precio + "€.");
		sc.close();

	}
}
