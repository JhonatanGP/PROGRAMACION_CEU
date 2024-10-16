package ej03PrácticosRepaso;

import java.util.Scanner;

public class Ej01 {
	
	public static final Integer AÑO = 2030;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe tu nombre:");
		String nombre = sc.nextLine();
		
		System.out.println("Escribe tu año de nacimiento:");
		Integer a = sc.nextInt();
		Integer n = AÑO - a;
		
		System.out.println("Hola " + nombre + ", en el año 2030 tendrás " + n + " años.");
	}

}
