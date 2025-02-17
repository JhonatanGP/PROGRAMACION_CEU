package tema04.EjBasicos01.Ej25;

import java.util.Scanner;

public class Ej25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Alumno[] lista = new Alumno[3];

		Curso c = new Curso();
		c.setDescripcion("DAM-DAW");
		c.setIdentificador("1");

		for (int i = 0; i < lista.length; i++) {
			Alumno alumno = new Alumno();
			System.out.println("Escribe el dni del Alumno " );

			String dni = sc.nextLine();
			alumno.setDni(dni);

			System.out.println("Escribe nota del Alumno " );
			Float nota = sc.nextFloat();
			alumno.setNota(nota);

			alumno.setCurso(c);
			
			lista[i] = alumno;
			sc.nextLine();
		}

		for (Alumno alumno : lista) {
			System.out.println(alumno);
		}

		for (int i = 0; i < lista.length; i++) {
			if (i == 2) {
				if (lista[i].equals(lista[i - 2])) {
					System.out.println("Error " + "Alumno " + lista[i].getDni());
				}
			} else if (i < 2) {
				if (lista[i].equals(lista[i + 1])) {
					System.out.println("Error " + "Alumno " + lista[i].getDni());
				}
			}

		}

		sc.close();
	}

}
