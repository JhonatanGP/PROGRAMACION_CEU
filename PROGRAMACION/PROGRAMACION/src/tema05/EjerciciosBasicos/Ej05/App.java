package tema05.EjerciciosBasicos.Ej05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer num = 0;
		Integer pos = 0;

		SacoNumeros a = new SacoNumeros();

		try {
			do {
				try {
					System.out.println("Ingresa números:");
					num = sc.nextInt();
					if (!num.equals(-1)) {
						a.addNumeros(num);
					}
				} catch (InputMismatchException e) {
					System.out.println("Error: Debes introducir un número válido.");
					sc.nextLine();
				}

			} while (!num.equals(-1));
			System.out.println(a.toString());
			sc.nextLine();

			while (!pos.equals(-1)) {
				try {

					System.out.println("¿Qué posicion quieres ver?");
					pos = sc.nextInt();
					
					if (!pos.equals(-1)) {
						System.out.println(a.getNumero(pos));
					} else {
						System.out.println("FIN");
					}

				} catch (InputMismatchException e) {
					System.out.println("Error: Debes introducir un número válido.");
					sc.nextLine();
				}
			}

		} finally {
			sc.close();
		}
	}
}