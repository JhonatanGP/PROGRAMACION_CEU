package tema03;

import java.util.Scanner;

public class Ej15 {

	public static void main(String[] args) {
		String normal = ""; // Lo inicializo a 0 con un ""
		String alreves = "";// Lo inicializo a 0 con un ""
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe un número:");
		String n = sc.nextLine();
		String[] num = n.split("");// para guardar cada número
		// Normal
		for (int i = 0; i < num.length; i++) {
			normal += num[i];// guarda los numeros de forma ordenada
		}
		// Alrevés
		for (int i = num.length - 1; i >= 0; i--) {
			alreves += num[i]; // guarda los numeros al reves
		}
		// Comparar
		if (alreves.equals(normal)) {
			System.out.println("Felicidades! Es un número capicúo.");
		} else {
			System.err.println("No es un número capicúo.");
		}
		sc.close();
	}
}