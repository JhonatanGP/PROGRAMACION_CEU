package ej01RepasoBásico;

import java.util.Scanner;

public class Ej03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Escibe tu nombre:");
		String n = sc.nextLine();
		
		System.out.println("Escibe tu direccion:");
		String d = sc.nextLine();
		
		System.out.println("Escribe tu teléfono:");
		Integer t = sc.nextInt();
				
		sc.close();
	}

}
