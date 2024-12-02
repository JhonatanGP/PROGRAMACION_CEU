package Tema02.ej03PrácticosRepaso;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Boolean v = true;
		String m = "";
		String p1 = "";
		String p2 = "";
		String p3 = "";
		do {
			System.out.println("Ingresa una dirección de página como la siguiente: http://www.google.com o https://w3w.blasblau.es");
			String p = sc.nextLine();

			if (p.contains("http://") || p.contains("https://") ) {
				m = p.substring(0,p.lastIndexOf("/") + 1);
				p1 = p.substring(p.lastIndexOf("/") + 1, p.indexOf("."));
				p2 = p.substring(p.indexOf(".") + 1, p.lastIndexOf("."));
				p3 = p.substring(p.lastIndexOf(".") +1, p.length());
				System.out.println(m);
				System.out.println(p1);
				System.out.println(p2);
				System.out.println(p3);

				v = false;
			}else {
				System.out.println("No lo he entendido.");
			}
		} while (v);

		sc.close();

	}

}