package tema03.ejpracticos;

import java.util.Scanner;

public class Ej11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Boolean v = true;
		
		do {
			System.out.println("Escribe su nombre completo:");
			String nombre = sc.nextLine();
			// Creo un array x y le guardo el nombre de antes con el .split y dentro de ("
			// ") para que lo separe
			String[] nombre1 = nombre.split(" ");
			// if del tamaño del array menor que 3, porque nombres compuestos no valen
			if (nombre1.length < 3) {
				System.out.println("Nombre incompleto.");
			} else {
				String name = nombre1[0];
				String apellido1 = nombre1[1];
				String apellido2 = nombre1[2];
				System.out.println("Tu nombre: " + name + ".\nTu apellido: " + apellido1 + ".\nTu segundo apellido es: " + apellido2 + ".");
				v = false;
			} 
		}while(v);
		
		sc.close();
	}
}