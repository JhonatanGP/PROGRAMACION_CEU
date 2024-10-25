package tema01.ej01Repaso;

import java.util.Scanner;

public class ej03 {
	
	public static final Float PI = 3.1416F;

	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Indique dos números enteros y sepa el resultado su multiplicación:");
		String a = sc.nextLine();
		String b = sc.nextLine();
		
		Long c = Long.parseLong(a);
		Long d = Long.parseLong(b);
		Long resultado = c * d ;
	 	
	 	System.out.println("El resultado de " + c + " multiplicado por " + d + " es: " + resultado + ".");
	 	
	 	sc.close();

				
	}

}
