package Tema02.ej01RepasoBásico;

import java.util.Scanner;

public class Ej06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Boolean v = true;
		do {
			System.out.println("Escribe un número:");
			Integer n = sc.nextInt();
			if (n < 0) {
				System.out.println("Es negativo.");
			}
			if (n > 0) {
				System.out.println("Es positivo.");
			}else {
				System.out.println("Nulo.");
			}
			
		} while (v);
		sc.close();
	}

}
