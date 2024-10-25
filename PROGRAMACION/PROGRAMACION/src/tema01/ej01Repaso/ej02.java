package tema01.ej01Repaso;

import java.util.Scanner;

public class ej02 {
	
	public static final Float PI = 3.1416F;

	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Indique dos números enteros y sepa el resultado su multiplicación:");
		Long a = sc.nextLong();
		Long b = sc.nextLong();
		
		Long resultado = a * b;
	 	
	 	System.out.println("El resultado de " + a + " multiplicado por " + b + " es: " + resultado + ".");
	 	
	 	sc.close();

				
	}

}
