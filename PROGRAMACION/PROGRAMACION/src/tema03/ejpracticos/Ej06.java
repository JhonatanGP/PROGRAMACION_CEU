package tema03.ejpracticos;

import java.util.Scanner;

public class Ej06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// Creamos un array de tamaño 3
		String[] palabras = new String[3];

		// Escribimos 3 palabras y las guardamos en el array
		for (int i = 0; i < palabras.length; i++) {
			System.out.print("Ingresa la palabra " + i + ":");
			String palabra = sc.nextLine();
			palabras[i] = palabra;
		}
		// Concatenamos todas las palabras en una sola cadena
		String resultado = "";

		for (int i = 0; i < palabras.length; i++) {
			resultado += palabras[i];
		}
		System.out.print(resultado);

		sc.close();
	}
}