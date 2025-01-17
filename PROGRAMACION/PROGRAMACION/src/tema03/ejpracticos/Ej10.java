package tema03.ejpracticos;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tamaño = 0;
		int principio = 0;
		int finall = 1;
		int resultado = 0;

		do {
			System.out.println("Escribe el tamaño de serie Fibonacci, mayor a 2:");
			tamaño = sc.nextInt();
			Integer[] listaPalabras = new Integer[tamaño];
			if (tamaño > 2) {
				// FIBONACCI
				System.out.print(principio + " " + finall + "");
				for (int i = 0; i < listaPalabras.length - 2; i++) {
					resultado = finall + principio;
					System.out.print(" " + resultado + "");
					principio = finall;
					finall = resultado;
				}
			} else if (tamaño <= 2) {
				System.err.println("El número no puede ser menor o igual a 2.");
			}
		} while (!(tamaño > 2));
		sc.close();
	}
}
