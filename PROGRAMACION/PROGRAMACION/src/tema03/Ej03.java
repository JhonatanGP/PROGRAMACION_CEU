package tema03;

import java.util.Scanner;

public class Ej03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("¿Cuántos números?");
		Integer n = sc.nextInt();
		//Creo el array con el tamaño de n.
		Integer[] lista = new Integer[n];
		//For para recorrer el array y solicitamos un numero
		for (int i = 0; i < lista.length; i++) {
			System.out.println("Introduce número " + i + ":");
			Integer x = sc.nextInt();
			//en mi array lista guardo nº x 
			lista[i] = x;
		}
		//imprimimos el array con un foreach
		for (int i : lista) { // for (int i = 0; i < lista.length; i++{
			System.out.print(i + " ");// System.out.print(lista[i] + " ");
		}
		sc.close();
	}

}