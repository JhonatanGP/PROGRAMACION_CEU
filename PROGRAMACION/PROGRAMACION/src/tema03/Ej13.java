package tema03;

import java.util.Scanner;

public class Ej13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Escriba una palabra y vea como se ve al revés:");
		String p = sc.nextLine();
		// Creo un array y guardo la palabra
		String[] caracter = p.split(""); // con esto guardo cada caracter en una posicion del array

		for (int i = caracter.length - 1; i >= 0; i--) {
			System.out.print(caracter[i]);
		}
		sc.close();
	}
}
