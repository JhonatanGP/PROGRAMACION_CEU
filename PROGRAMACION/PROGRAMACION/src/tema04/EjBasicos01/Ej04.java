package tema04.EjBasicos01;

import java.util.Scanner;

public class Ej04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe una palabra");
		String palabra = sc.nextLine();
		Boolean v = false;

		while (!v) {
			System.out.println("Escribe un número del 1 al 2");
			Integer n = sc.nextInt();

			if (n == 1 || n == 2) {
				System.out.println(getMayMin(n, palabra));
				v = true;
			} else {
				System.out.println("Ese número no está bien.");
				v = false;
			}
		}
	}

	public static String getMayMin(Integer n, String p) {
		String resultado = "";
		if (n == 1) {
			resultado = Ej01.getMayuscula(p);
		} else {
			resultado = Ej02.getMinus(p);
		}
		return resultado;
	}
}
