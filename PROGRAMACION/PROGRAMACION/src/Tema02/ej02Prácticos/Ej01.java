package Tema02.ej02Prácticos;

import java.util.Scanner;

public class Ej01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("¿En qué año naciste?");
		Integer año = sc.nextInt();
		
		if (año <= 1900) { 
			System.out.println("Pertenece a la Generación Perdida."); 
		}
		else if (año >= 1901 && año <= 1927) {
			System.out.println("Pertenece a la Generación Grandiosa/GM. ");
		}
		else if (año >= 1928 && año <= 1945) {
			System.out.println("Pertenece a la Generación Silenciosa. "); 
		}
		else if (año >= 1946 && año <= 1964) {
			
			System.out.println("Pertenece a la Generación Baby Boommers. ");
		}
		else if (año >= 1965 && año <= 1980) {
			System.out.println("Pertenece a la Generación X. ");  
		}
		else if (año >= 1981 && año <= 1996) {
			System.out.println("Pertenece a la Generación Y/Millenials. ");
		}
		else if (año >= 1997 && año <= 2012) {
			System.out.println("Pertenece a la Generación Z/Zoomers. ");
		}
		else {
			System.out.println("Pertenece a la Generación Alfa.");
			
		}
		sc.close();
		
	}

}
