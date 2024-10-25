package tema01.ej00;

import java.util.Scanner;

public class PruebaScanner {

	public static void main(String[] args) {
		
		// Primero escribimos siempre esto
		Scanner sc = new Scanner(System.in);
		
		//Mostramos mensaje al usuario
		System.out.println("Indica un texto por favor");
		
		//Lo utilzamos
		String mensaje = sc.nextLine();
		
		//Mostramos mensaje al usuario
		System.out.println("Indica un número por favor");
		
		//Lo utilzamos
		String num = sc.nextLine();
		
		//Mostramos lo que hemos leído
		System.out.println("He leído esto: " + mensaje + " y esto " + num);

	}

}
