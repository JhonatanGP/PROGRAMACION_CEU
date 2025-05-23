package tema05.EjerciciosBasicos.Ej02;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> numeros = new ArrayList<>();
		Integer num = 0;

		try {
			do {
				System.out.println("Ingresa números:");
				num = sc.nextInt();
				if (!num.equals(-1)) {
					numeros.add(num);
				}
				
			} while (!num.equals(-1));
			System.out.println("Lista de números: " + numeros);

		} catch (InputMismatchException e){
			System.out.println("Error: Debes introducir un número válido.");
			sc.nextLine();
			num = 0;
		}
		finally {
			sc.close();
		}
	}
}