package Tema02.ej02Prácticos;

import java.util.Scanner;

public class Ej15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número y sepa su tabla de multiplicar:");
		Integer n = sc.nextInt();
		System.out.println("TABLA DE MULTIPLICAR DE " + n);

		for(int i = 0; i < 11; i++) {
			Integer r = n * i;
			System.out.println(n + " X " + i + " = " + r);
		}
		
		sc.close();
			
	}

}
