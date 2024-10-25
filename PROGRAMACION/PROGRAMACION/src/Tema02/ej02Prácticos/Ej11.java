package Tema02.ej02Prácticos;

import java.util.Scanner;

public class Ej11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		
		Boolean error = false;
		do {
		System.out.println("Introduce un correo electrónico:");
		String email = sc.nextLine();
			if (!email.contains("@")) {
			error = true;
			System.out.println("Su email no contiene @. Pruebe otra vez");
			}
			if (email.contains("@.")) {
			error = true;
			System.out.println("Su email no es válido, no puede haber un punto detrás del arroba. Pruebe otra vez");
			}
			if (email.endsWith(".")) {
			error = true;
			System.out.println("Su email no es válido, no puede terminar en punto. Pruebe otra vez");
			}	
		} 
		while (error==true);
		System.out.println("Su email es válido.");
		
		sc.close();
			
	}

}
