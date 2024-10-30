package tema03;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej00 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Pedimos al usuario la cantidad de números que va a ingresar
		System.out.print("¿Cuántos números vas a ingresar? ");
		int cantidadNumeros = scanner.nextInt();

		// Creamos una lista para almacenar los números
		ArrayList<Integer> numeros = new ArrayList<>();

		// Solicitamos cada número y los almacenamos en la lista
		for (int i = 0; i < cantidadNumeros; i++) {
			System.out.print("Ingresa el número " + (i + 1) + ": ");
			Integer numero = scanner.nextInt();
			numeros.add(numero);
		}

		// Mostramos la lista completa de números en el orden ingresado
		System.out.println("\nLista de números ingresados:");
		for (Integer numero : numeros) {
			System.out.println(numero);
		}

		scanner.close();
	}
}
