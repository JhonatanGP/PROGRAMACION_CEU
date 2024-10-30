package tema03;

import java.util.Scanner;

public class Ej03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Boolean v = true;
		do {
			System.out.println("Escribe un número:");
			Integer n = sc.nextInt();

			Integer[] lista = new Integer[6];
			for (int i = 0; i < lista.length; i++) {
				//lista[i] = (n + i) * (n + i); // n * n;
											  // n++
			}
			for (int cuadrado : lista) {         //for (int i = 0; i < lista.length; i++{
				System.out.print(cuadrado + " ");// System.out.print(lista[i] + " ");
			}
		}while(v);
		
		sc.close();
	}

}
