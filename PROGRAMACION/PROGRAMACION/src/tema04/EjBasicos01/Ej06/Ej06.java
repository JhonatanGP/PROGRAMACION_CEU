package tema04.EjBasicos01.Ej06;

import java.util.Scanner;

public class Ej06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Averigua la suma de dos números\nIntroduce un número: ");
		Integer n1 = sc.nextInt();
		System.out.println("Introduce otro número: ");
		Integer n2 = sc.nextInt();
		
		System.out.println("La suma es: " + Calculadora.getSumar(n1, n2));
		System.out.println("La resta es: " + Calculadora.getRestar(n1, n2));
		System.out.println("La resta es: " + Calculadora.getMult(n1, n2));
		System.out.println("La resta es: " + Calculadora.getDiv(n1, n2));


	}
	
}
