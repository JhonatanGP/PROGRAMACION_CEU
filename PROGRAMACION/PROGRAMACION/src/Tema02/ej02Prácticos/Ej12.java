package Tema02.ej02Prácticos;

import java.util.Scanner;

public class Ej12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		Boolean error = true;
		
		do {
		System.out.println("Introduce un correo electrónico:");
		String user = sc.nextLine().trim().toUpperCase();
			if (user.length()<10) {
			error = false;
			System.out.println("Su email es inferior a 10 caracteres. Pruebe otra vez");
			}
			else if (user.isBlank()) {
			error = false;
			System.out.println("Su email no es válido, no puede contener espacios en blanco. Pruebe otra vez");
			}
							
		} 
		while (error==true);
		System.out.println("Su email es válido.");
		
		sc.close();
			
	}

}
