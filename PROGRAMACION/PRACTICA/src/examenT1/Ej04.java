package examenT1;

import java.util.Scanner;

public class Ej04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuantos ingredientes lleva tu receta?");
		Integer ing = sc.nextInt();
		
		double total = 0;
		double suma = 0;
		if(ing == 0) {
			System.out.println("Precio total: 0.0 €" );
		}else {
			
			String[] lista = new String[ing];			
						
			for (int i = 1; i <= lista.length; i++) {
				sc.nextLine();

				System.out.println("¿Cuál es el ingrediente " + i +"?");
				String ning = sc.nextLine();
				lista[1]= ning;
				//sc.nextLine();
				
				System.out.println("¿Cuánto cuesta el kilo de "+ lista[i] +"?");
				double precio = sc.nextDouble();
				System.out.println("¿Cuánto kilos de "+ lista[i] +" necesitas?");
				double kilo = sc.nextDouble();
				total = precio * kilo;
				suma += total;
			}
			System.out.println("Precio total: " + suma + " € ");

		}
		sc.close();
	}

}