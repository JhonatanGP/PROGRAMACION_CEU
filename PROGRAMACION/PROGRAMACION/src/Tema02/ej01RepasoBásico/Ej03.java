package Tema02.ej01RepasoBásico;

import java.util.Scanner;

public class Ej03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe tu nombre:");
		String n = sc.nextLine();

		System.out.println("Escribe tu dirección:");
		String d = sc.nextLine();

		System.out.println("Escribe tu teléfono:");
		Integer t = sc.nextInt();

		System.out.println("Nombre: " + n + ".\nDirección: " + d + ".\nTeléfono: " + t);

		sc.close();
	}

}
