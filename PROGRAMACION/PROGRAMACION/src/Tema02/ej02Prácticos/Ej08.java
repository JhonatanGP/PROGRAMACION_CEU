package Tema02.ej02Prácticos;

import java.util.Scanner;

public class Ej08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a;
		String b;
		
		do {
			System.out.println("Escriba una palabra.");
			a = sc.nextLine().trim().toLowerCase().toUpperCase();
			
			System.out.println("Escribe otro palabra.");
			b = sc.nextLine().trim().toLowerCase().toUpperCase();;
			 
			 //Para comparar cadenas(palabras) se usa .equals. No se usa ==, eso solo es para comparar números.
			 if (a.equals(b)) {
				 System.out.println("Palabras iguales. Fin del programa.");
			 }
			 else {
				 System.out.println("Palabras diferentes. Pruebe otra vez.");
			 }

		}
		while (!a.equals(b));
		
		sc.close();

	}

}
