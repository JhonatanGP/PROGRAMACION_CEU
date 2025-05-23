package tema05.EjerciciosBasicos.Ej07;

import java.math.BigDecimal;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Sociedad s1 = new Sociedad();
		try {
			Persona persona = new Persona();

			try {
				System.out.println("Introduce el género (H/M): ");
				String genero = sc.nextLine();
				persona.setGenero(genero);

				System.out.println("Introduce la altura en metros: ");
				BigDecimal altura = sc.nextBigDecimal();
				System.out.println(persona.toString());

			} catch (ParametroIncorrectoException e) {
				System.out.println(e.getMessage());
			}

		} finally {
			System.out.println("Fin");
			sc.close();
		}
	}

}
