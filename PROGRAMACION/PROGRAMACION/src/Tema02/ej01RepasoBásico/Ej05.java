package Tema02.ej01RepasoBásico;

import java.util.Scanner;

public class Ej05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe un número:");
		Integer n = sc.nextInt();
		if (n % 2 != 0) {
			System.out.println("Es impar.");
		}
		if (n % 2 == 0) {
			System.out.println("El número es par.");
		}

		sc.close();

	}

}
