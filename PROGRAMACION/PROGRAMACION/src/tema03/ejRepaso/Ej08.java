package tema03.ejRepaso;

import java.util.Scanner;

public class Ej08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe tu HTML:");
		String html = sc.nextLine();

		String[] frase = html.split("");
		Boolean confirmar = false;
		String guardar = ""; //Para guardar las palabras
		
		for (int i = 0; i < frase.length; i++) {
			if(frase[i].equals("<")) {
				confirmar = true;
			}else if(frase[i].equals(">")) {
				confirmar = false;
			}else if(confirmar == false) {
				guardar += frase[i];
			}
		}
		System.out.println(guardar);
		sc.close();
	}

}
