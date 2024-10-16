package ej03PrácticosRepaso;

import java.util.Scanner;

public class Ej08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Boolean v = true;
		do {
			System.out.println("Ingresa un texto:");
			String t = sc.nextLine();
			
			//Primero hola
			Integer primero = t.indexOf(" ");// busca el primer espacio
			String p1 = t.substring(0, primero + 1);
			
			//Segundo hastaluego
			Integer segundo = t.lastIndexOf(" ");// busca el primer espacio
			String p2 = t.substring( segundo, t.length()); //Probar +1 luego 
			
			//Mensaje. Para mensaje no hace falta Integer
			String mensaje 
			
			
			if (t.startsWith("hola") && t.endsWith("hastaluego")) {

			} else {
				System.out.println("No lo he entendido.");
			}

		} while (v);

	}

}
