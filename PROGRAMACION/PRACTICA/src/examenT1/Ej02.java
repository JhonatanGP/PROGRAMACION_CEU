package examenT1;

import java.util.Scanner;

public class Ej02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean v = true;

		do {
			System.out.println("Escribe un número mayor a 10000 :");
			Integer n = sc.nextInt();
			String a = n.toString();
			int l = a.length();

			if (n <= 1000) {
				System.out.println("El número indicado no es correcto.");
			} else {
				String[] array = new String[l];
				for (int i = 0; i < array.length; i++) {
					array[i] = a.substring(0, i + 1);
				}
				for (String s : array) {
					System.out.print(s + " / ");
				}
				v = false;
			}
		} while (v);
		sc.close();
	}

}