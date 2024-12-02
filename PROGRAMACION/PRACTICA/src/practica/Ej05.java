package practica;

import java.util.Scanner;

public class Ej05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Solicitar el número como texto
		System.out.println("Introduce un número largo (puede incluir ceros): ");
		String numero = sc.nextLine();

		// Dividir el número en bloques usando "0" como separador
		String[] bloques = numero.split("0");

		// Recorrer los bloques con foreach y calculo sus sumas
		for (String b : bloques) {
			if (!b.isEmpty()) { // Ignorar bloques vacíos
				int suma = 0;
				// Sumar los dígitos del bloque convirtiendo la cadena en entero
				for (int i = 0; i < b.length(); i++) {
					// Extraer cada dígito como un substring
					String digitoString = b.substring(i, i + 1);
					// Convertir el substring en entero y sumar
					suma += Integer.parseInt(digitoString);
				}
				// Imprimir el bloque y su suma
				System.out.println("Bloque: " + b + " → Suma: " + suma);
			}
		}
		sc.close();
	}
}