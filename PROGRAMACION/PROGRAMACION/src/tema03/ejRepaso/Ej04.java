package tema03.ejRepaso;

import java.util.Scanner;

public class Ej04 {

	public static void main(String[] args) {
		Integer[] lista = new Integer[] { 7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10 };
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Qué notas buscas?");
		Integer n = sc.nextInt();
		Integer cont = 0;
		
		for (int i = 0; i < lista.length; i++) {
			if(lista[i] >= n) {
				cont++;
			}
		}
		System.out.println("Hay " + cont + " notas mayores a la indicada.");

		sc.close();
	}
}
