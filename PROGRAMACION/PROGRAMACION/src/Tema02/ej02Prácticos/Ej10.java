package Tema02.ej02Prácticos;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a;
		String b;
		
		do {
			System.out.println("Escriba una palabra:");
			a = sc.nextLine();			
			System.out.println("Escribe otra palabra:");
			b = sc.nextLine();
			
			//NOTA: isBlank() DEVUELVE true Si el string est vacio o solo contiene espacios en blanco
			//NOTA: isEmpty() DEVULVE true si la longitud de la cadena =0
			
			/* EJEMPLO:
			 * 
			 * SI nombre1 ="" Y nombre2="   "
			 * nombre1.isEmpty() --> true
			 * nombre1.isBlank() --> true
			 * nombre2.isEmpty() --> false
			 * nombre2.isBlank() --> true
			 */
			
			/*System.out.println("XX"+nombre1+"XX es vacio?: "+ nombre1.isEmpty());
			System.out.println("XX"+nombre1+"XX tiene solo blancos?: "+ nombre1.isBlank());
			
			System.out.println("XX"+nombre2+"XX es vacio?: "+ nombre2.isEmpty());
			System.out.println("XX"+nombre2+"XX tiene solo blancos?: "+ nombre2.isBlank());
			*/
		}
		while (a.isBlank() || b.isBlank());
				
		int comparacion = a.compareTo(b); 
		if (comparacion <= 0) { //a tiene letras anteriores a b en el alfabeto.
			System.out.println("Orden correcto: " + a + " - " + b);
		}
		else {//a tiene letras posteriores a b en el alfabeto.
			System.out.println("Orden correcto: " + b + " - " + a);
		}
		
		sc.close();

	}

}
