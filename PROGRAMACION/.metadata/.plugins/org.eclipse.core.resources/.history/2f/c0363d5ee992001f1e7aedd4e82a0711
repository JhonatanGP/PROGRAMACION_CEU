package ej02Prácticos;

import java.util.Scanner;

public class Ej03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el precio sin IVA:");
		Float sinIVA = sc.nextFloat();
		
		sc.nextLine();
		
		System.out.println("Ahora introduce el tipo de IVA");
		String tipo = sc.nextLine();
		
		Float normal = sinIVA * 0.21F ;
		Float reducido = sinIVA * 0.10F;
		Float superreducido = sinIVA * 0.04F;
		Float exento = sinIVA * 0.0F;
		
		if (tipo.equals("normal")) {
			System.out.println("Precio con IVA normal: " + normal + "€.");
			
		}
		else if (tipo.equals("reducido")) {
			System.out.println("Precio con IVA reducido: " + reducido + "€.");
			
		}
		else if (tipo.equals("superreducido")) {
			System.out.println("Precio con IVA superreducido: " + superreducido + "€.");
			
		}
		else if (tipo.equals("exento")) {
			System.out.println("Precio con IVA exento: " + exento + "€.");
			
		}
		else {
			System.out.println("Tipo de IVA no válido.");
		}
		
		sc.close();
	}

}
