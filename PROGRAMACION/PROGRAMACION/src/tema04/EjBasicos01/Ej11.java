package tema04.EjBasicos01;

import java.util.Scanner;

import tema04.EjBasicos01.Ej09.ArraysUtils;

public class Ej11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] array = new String[] { "avion", "beber", "casa", "dedo", "elefante", "fifa", "gormiti", "hambre" };
		
		System.out.println("Escribe una palabra");
		String palabra = sc.nextLine();
		
		System.out.println("Posición: " + ArraysUtils.buscarPalabra(array, palabra));
		sc.close();
	}

}