package Tema02.ej03PrácticosRepaso;

import java.util.Scanner;

public class Ej14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Boolean v = true;

		do {
			System.out.print("Ingrese una contraseña: ");
			String c = sc.nextLine();

			if (c.length() < 8) {
				System.out.println("La contraseña es menor a 8 caracteres.\nInténtalo de nuevo:");
				v = true;
			} else {
				System.out.println(c.replaceAll("a", "4").replaceAll("e", "3").replaceAll("i", "1")
						.replaceAll("o", "0").replaceAll("t", "7"));
				v = false;
			}
		} while (v);

		sc.close();
	}

}
