package practica;

import java.util.Scanner;

public class Ej02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("Escriba una palabra que contenga la letra M o m:");
			String p = sc.nextLine().toLowerCase();

			if (p.contains("m")) {
				// 1 Busco donde se encuentra la primera m
				Integer pos = p.indexOf("m"); // indexOf me da la posicion donde se encuentra M
				// 2 Divido la palabra en dos, sabiendo la pos de m
				String p1 = p.substring(pos); // Le +1 para que coja la siguiente a la M
				String p2 = p.substring(0, pos); // Desde la pos 0 hasta la m incluida(hay que +1)
				String p3 = p1 + p2;
				System.out.println("Nueva palabra: " + p3 + ".");
				break;
			} else {
				System.out.println("Error. La palabra indicada no contiene m.");
			}
		}
		sc.close();
	}
}