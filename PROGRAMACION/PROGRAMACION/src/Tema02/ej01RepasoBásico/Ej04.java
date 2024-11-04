package Tema02.ej01RepasoBásico;

import java.util.Scanner;

public class Ej04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe tu id:");
		Integer i = sc.nextInt();
		sc.nextLine();

		System.out.println("Nombre:");
		String n = sc.nextLine();
		
		System.out.println("Apellidos:");
		String a = sc.nextLine();
		
		System.out.println("Edad:");
		Integer e = sc.nextInt();

		System.out.println("Datos: " + i + " " + n + " " + a + " " + e);

		sc.close();
	}

}
