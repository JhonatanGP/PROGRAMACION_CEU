package Tema02.ej02Prácticos;

import java.util.Scanner;

public class Ej09_Array {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escribe su nombre completo");
		String nombre = scanner.nextLine();
		String[] nombre1 = nombre.split(" ");
		
		if (nombre1.length <3) {
		System.out.println("Pon tu nombre y apellidos correctamente.");
		}
		
		else {
			String name = nombre1[0];
			String apellido1 = nombre1[1];
			String apellido2 = nombre1[2];
			System.out.println("Tu nombre: "+ name+ ".\nTu apellido: "+ apellido1+ ".\nTu segundo apellido es: "+ apellido2+".");
		}
		scanner.close();
	}


}