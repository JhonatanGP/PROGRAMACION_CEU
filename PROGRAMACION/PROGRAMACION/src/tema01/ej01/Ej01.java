package tema01.ej01;

import java.util.Scanner;

public class Ej01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Indica un nombre por favor:");
		String name = sc.nextLine();
		System.out.println("Indica los apellidos por favor:");
		String apellido = sc.nextLine();
		System.out.println("Su nombre completo es " + name + " " + apellido + ".");
		
		sc.close();
		
				
	}

}
