package tema03.ejRepaso;

import java.util.Scanner;

public class Ej03 {

	public static void main(String[] args) {
		Integer[] lista = new Integer[] { 7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10 };
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Qué notas buscas?");
		Integer n = sc.nextInt();
		Boolean encontrada = false; // Variable para controlar si se encuentra la nota

		for (int i = 0; i < lista.length; i++) {
			if (lista[i] == n) {
				System.out.println("La nota buscada existe y está en la posición: " + i + ".");
				encontrada = true;
				break;
			}
		}
		if (!encontrada) {
			System.out.println("La nota buscada no existe.");
		}
		sc.close();
	}
}