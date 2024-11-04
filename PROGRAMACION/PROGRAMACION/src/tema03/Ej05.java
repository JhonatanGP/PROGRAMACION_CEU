package tema03;

import java.util.Scanner;

public class Ej05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("¿Cuántos números quieres guardar?");
		Integer n = sc.nextInt();
		// Creo el array con el tamaño de n.
		Integer[] lista = new Integer[n];
		// For para recorrer el array y solicitamos un numero
		for (int i = 0; i < lista.length; i++) {
			System.out.println("Introduce un número en la posición " + i + ":");
			Integer x = sc.nextInt();
			// en mi array lista guardo nº x
			lista[i] = x;
		}
		//declaro variables para guardar los max y min
		Integer min = lista[0];
		Integer max = lista[0];
		Integer pmax = 0;
		Integer pmin = 0;
		Integer suma = 0;
		
		// imprimimos el array con un for desde el final length -1
		for (int i = lista.length - 1; i >= 0; i--) {
			System.out.print(lista[i] + " ");
		}
		sc.close();
	}

}