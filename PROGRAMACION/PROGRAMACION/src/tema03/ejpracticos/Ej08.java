package tema03.ejpracticos;

import java.util.Scanner;

public class Ej08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("¿Cuántos números quieres guardar?");
		Integer n = sc.nextInt();
		// Creo el array con el tamaño de n.
		Integer[] lista = new Integer[n];
		// For para recorrer el array y solicitamos un numero
		for (int i = 0; i < lista.length; i++) {
			System.out.print("Introduce número " + i + ": ");
			Integer x = sc.nextInt();
			// en mi array lista guardo nº x
			lista[i] = x;
		}
		// imprimimos el array con un foreach
		for (int i = 0; i < lista.length; i++) {
			System.out.print(lista[i] + " ");
		}
		System.out.println();

		// Le damos la vuelta
		for (int i = 0, j = lista.length - 1; i < j; i++, j--) {
			Integer aux = lista[i];
			lista[i] = lista[j];
			lista[j]= aux;
		}
		for (int i = 0; i < lista.length; i++) {
			System.out.print(lista[i] + " ");
		}
		
		sc.close();
	}

}
