package tema04.EjBasicos01.Ej26;

import java.util.Scanner;

public class Ej26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Alumno[] lista = new Alumno[3];
		Curso c = new Curso();
		c.setDescripcion("DAM-DAW");
		c.setIdentificador("1");

		for (int i = 0; i < lista.length; i++) {
			Alumno alumno = new Alumno();
			System.out.println("Escribe el dni del Alumno " + (i+1));

			String dni = sc.nextLine();
			alumno.setDni(dni);

			System.out.println("Escribe nota del Alumno " + (i+1));
			Float nota = sc.nextFloat();
			alumno.setNota(nota);

			alumno.setCurso(c);

			lista[i] = alumno;
			sc.nextLine();
		}

		for (Alumno alumno : lista) {
			System.out.println(alumno);
		}

		// Validar duplicados por DNI
        for (int i = 0; i < lista.length; i++) {
            for (int j = i + 1; j < lista.length; j++) {
                if (lista[i].equals(lista[j])) {
                    System.out.println("Error: Alumno duplicado con DNI " + lista[i].getDni());
                }
            }
        }

		sc.close();
	}

}
