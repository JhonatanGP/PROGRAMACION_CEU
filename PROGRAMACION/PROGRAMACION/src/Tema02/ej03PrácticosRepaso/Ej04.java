package Tema02.ej03PrácticosRepaso;

import java.util.Scanner;

public class Ej04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba su precio:");
		Float p = sc.nextFloat();
		System.out.println("Escriba las unidades:");
		Float u = sc.nextFloat();

		Float st = p * u;
		Float d = 0f;
		Float t = 0f;
		System.out.println("Subtotal = " + p + " X " + u + " = " + st + " euros.");

		if (u > 100) {
			d = st * 0.40f;
			t = st - d;
			System.out.println("Descuento = 40% de " + st + " = " + d + " euros.");
			System.out.println("Total = " + st + " - " + d + " = " + t + " euros.");
		} else if (u >= 25 && u <= 100) {
			d = st * 0.20f;
			t = st - d;

			System.out.println("Descuento = 20% de " + st + " = " + d + " euros.");
			System.out.println("Total = " + st + " - " + d + " = " + t + " euros.");
		} else if (u >= 10 && u <= 24) {
			d = st * 0.10f;
			t = st - d;

			System.out.println("Descuento = 10% de " + st + " = " + d + " euros.");
			System.out.println("Total = " + st + " - " + d + " = " + t + " euros.");
		} else {
			t = st - d;
			System.out.println("Descuento = 0% de " + st + " = " + st + " euros.");
			System.out.println("Total = " + st + " - " + d + " = " + t + " euros.");
		}

		sc.close();
	}

}
