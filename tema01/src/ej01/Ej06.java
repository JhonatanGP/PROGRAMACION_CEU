package ej01;

import java.util.Scanner;

public class Ej06 {
	
	public static final Float IVA = 0.21F;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuál es el precio sin IVA del teclado?");
		Float teclado = sc.nextFloat();
		
		Float ivaTecl = teclado * IVA;
		Float precioFin = teclado + ivaTecl;
		
		System.out.println("El IVA del teclado es " + ivaTecl + " euros.\nEl precio final es " + precioFin + " euros.");
		
		sc.close();
		
		
	}

}
