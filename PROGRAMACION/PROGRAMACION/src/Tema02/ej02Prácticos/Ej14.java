package Tema02.ej02Prácticos;

import java.util.Scanner;

public class Ej14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Introduce un número:");
		Integer n = sc.nextInt();
		
		Integer mult = 0;
		Integer multiplicacion;
		
		System.out.println("TABLA DE " + n);
		
		while (mult <=10) {
			multiplicacion = n * mult;
			System.out.println(n + " X " + mult + " = " + multiplicacion);
		}
		
		
		sc.close();
			
	}

}
