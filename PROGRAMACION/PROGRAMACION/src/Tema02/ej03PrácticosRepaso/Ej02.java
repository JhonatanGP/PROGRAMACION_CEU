package Tema02.ej03PrácticosRepaso;

import java.util.Scanner;

public class Ej02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe la primera ciudad:");
		String c1 = sc.nextLine();

		System.out.println("Escribe la segunda ciudad:");
		String c2 = sc.nextLine();

		System.out.println("Escribe la tercera ciudad:");
		String c3 = sc.nextLine();

		if (c1.length() > c2.length() && c2.length() > c3.length()) {

			System.out.println(c3);
			System.out.println(c2);
			System.out.println(c1);

		} else if (c1.length() > c3.length() && c3.length() > c2.length()) {

			System.out.println(c2);
			System.out.println(c3);
			System.out.println(c1);

		} else if (c2.length() > c1.length() && c1.length() > c3.length()) {

			System.out.println(c3);
			System.out.println(c1);
			System.out.println(c2);

		} else if (c2.length() > c3.length() && c3.length() > c1.length()) {

			System.out.println(c1);
			System.out.println(c3);
			System.out.println(c2);

		} else if (c3.length() > c2.length() && c2.length() > c1.length()) {

			System.out.println(c1);
			System.out.println(c2);
			System.out.println(c3);

		} else if (c3.length() > c1.length() && c1.length() > c2.length()) {

			System.out.println(c2);
			System.out.println(c1);
			System.out.println(c3);
		}
		sc.close();

	}

}
