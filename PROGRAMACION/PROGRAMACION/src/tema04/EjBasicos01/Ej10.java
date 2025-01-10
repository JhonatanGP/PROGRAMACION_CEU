package tema04.EjBasicos01;

import java.util.Scanner;

import tema04.EjBasicos01.Ej09.ArraysUtils;

public class Ej10 {

	public static void main(String[] args) {
		String cad = "Hoy es viernes";
		String[] array1 = cad.split(" ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número");
		Integer n = sc.nextInt();

		System.out.println(ArraysUtils.obtenerPalabra(array1, n));

		sc.close();
	}
}