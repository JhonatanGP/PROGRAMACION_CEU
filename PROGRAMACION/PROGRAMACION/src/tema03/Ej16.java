package tema03;

import java.util.Scanner;

public class Ej16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe una frase y contaré el número de 'a' y palabras:");
		String frase = sc.nextLine().toLowerCase();
		String[] pal = frase.split(" ");//array para guardar cada palabra y espacio
		String[] a = frase.split("");//array para guardar cada caracter

		Integer cont = 0;
		for (int i = 0; i < a.length; i++) { // para contar las a me creo 1 varible cont1 = 0
			if (a[i].contains("a") || a[i].contains("á")) {
				cont++; // para que sume las a
			}
		}
		System.out.println("Hay " + pal.length + " palabras y " + cont + " letras 'a'.");
		sc.close();
	}
}