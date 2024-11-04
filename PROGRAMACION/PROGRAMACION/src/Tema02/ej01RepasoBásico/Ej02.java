package Tema02.ej01RepasoBásico;

import java.util.Scanner;

public class Ej02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String n;
		System.out.println("Escribe tu nombre completo:");
		n = sc.nextLine();
		System.out.println("Tu nombre es: " + n +".");
		
		sc.close();
	}

}
