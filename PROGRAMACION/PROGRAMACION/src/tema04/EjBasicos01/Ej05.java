package tema04.EjBasicos01;

import java.util.Scanner;

public class Ej05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Averigua la suma de dos números\nIntroduce un número: ");
		Integer n1 = sc.nextInt();
		System.out.println("Introduce otro número: ");
		Integer n2 = sc.nextInt();

		System.out.println("La suma es: " + getSumar(n1,n2));
	}

	public static Integer getSumar(Integer n1, Integer n2) {
		Integer suma = n1 + n2;
		return suma;
	}
}