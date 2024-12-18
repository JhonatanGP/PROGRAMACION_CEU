package Tema02.ej02Prácticos;

import java.util.Scanner;

public class Ej033 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el precio sin IVA:");
		Float sinIVA = sc.nextFloat();
		
		sc.nextLine();
		
		System.out.println("Ahora introduce el tipo de IVA:\n-Normal\n-Reducido\n-Superreducido\n-Exento");
		String tipo = sc.nextLine().toLowerCase().trim();
				
		if (tipo.equals("normal")) {
			Float normal = sinIVA * 0.21F ;
			Float r = sinIVA + normal;
			System.out.println("Precio con IVA normal: " + r + "€.");
			
		}
		else if (tipo.equals("reducido")) {
			Float reducido = sinIVA * 0.10F;
			Float r = sinIVA + reducido;
			System.out.println("Precio con IVA reducido: " + r + "€.");
			
		}
		else if (tipo.equals("superreducido")) {
			Float superR = sinIVA * 0.04F;
			Float r = sinIVA + superR;
			System.out.println("Precio con IVA superreducido: " + r + "€.");
			
		}
		else if (tipo.equals("exento")) {
			Float exento = sinIVA * 0.0F;
			Float r = sinIVA + exento;
			System.out.println("Precio con IVA exento: " + r + "€.");
			
		}
		else {
			System.out.println("Tipo de IVA no válido.");
		}
		
		sc.close();
	}

}
