package tema03;

import java.util.Scanner;

public class Ej14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba una frase:");
		String frase = sc.nextLine();
		// Creo un array y guardo la palabra
		String[] caracter = frase.split(" "); //" " con un espacio para que coja a partir de cada espacio
		// Lo recorro con un for
		for (int i = 0; i < caracter.length; i++) {
			String pos1 = caracter[i]; // Utilizo la i para que cada vez incremente la posicion
			if (i == 0) { //if para que la primera pos del array que es 0 lo pase a minus
				String p1 = pos1.toLowerCase();
				System.out.print(p1);
			} else if (i > 0) { // else if mayores de i, son las demas palabras guardadas. Las guardo en otra variable
				String p2 = caracter[i];
				// creo otro array y guardo el resto de palabras y le hago split
				String[] may = p2.split(""); // "" para cada caracter
				for (int j = 0; j < may.length; j++) {
					String pos2 = may[j];// j  Utilizo la j para que cada vez incremente la posicion
					if (j == 0) { // como ahora lo tengo separado por caracter, al primero que es 0 lo pasa a mayus
						String p22 = pos2.toUpperCase();
						System.out.print(p22);
					} else {
						System.out.print(pos2);
					}
				}
			}
		}
		sc.close();
	}
}
