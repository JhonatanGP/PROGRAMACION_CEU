package Tema02.ej03PrácticosRepaso;

import java.util.Scanner;

public class Ej19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Boolean v = true;
		do {
			System.out.println(
					"Seleccione un programa: \n  1 - De Pesetas a Euros\n  2 - De Euros a Pesetas\n  3 - Salir");
			Integer n = sc.nextInt();

			if (n == 1) {
				System.out.println("De Pesetas a Euros\nIngrese cantidad:");
				Float c = sc.nextFloat();
				Float c1 = c / 166.386F;
				System.out.println(c + " pts = " + c1 + " €.");

			} else if (n == 2) {
				System.out.println("De Euros a Pesetas\nIngrese cantidad:");
				Float c = sc.nextFloat();
				Float c1 = c * 166.386F;
				System.out.println(c + " € = " + c1 + " pts.");

			} else if (n == 3) {
				System.out.println("Fin del programa.");

				v = false;
			} else {
				System.out.println("Por favor solo números del 1 al 3.");
			}
		} while (v);

		sc.close();
	}
}
