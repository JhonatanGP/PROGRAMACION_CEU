package tema04.EjBasicos01.Ej35;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej35 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//Alumno[] lista = new Alumno[3];
		List <Alumno> lista = new ArrayList <>();

		Curso c = new Curso();
		c.setDescripcion("DAM-DAW");
		c.setIdentificador("1");

		for (int i = 0; i < 3; i++) {
			Alumno alumno = new Alumno();
			System.out.println("Escribe el dni del Alumno ");

			String dni = sc.nextLine();
			alumno.setDni(dni);

			System.out.println("Escribe nota del Alumno ");
			Float nota = sc.nextFloat();
			alumno.setNota(nota);

			alumno.setCurso(c);

			//lista[i] = alumno;
			lista.add(i, alumno);
			sc.nextLine();
		}
		for (Alumno alumno : lista) {
			System.out.println(alumno);
		}
		for (int i = 0; i < lista.size(); i++) {
			if (i == 2) {
				/*if (lista[i].equals(lista[i - 2])) { 
				  System.out.println("Error " + "Alumno + lista[i].getDni());*/
				if (lista.get(i).equals(lista.get(i - 2))) {
					System.out.println("Error " + "Alumno " + lista.get(i).getDni());
				}
			} else if (i < 2) {
				/*if (lista[i].equals(lista[i + 1])) 
				  { System.out.println("Error " + "Alumno " + lista[i].getDni()); */
				if (lista.get(i).equals(lista.get(i + 1))) {
					System.out.println("Error " + "Alumno " + lista.get(i).getDni());
				}
			}
		}
		sc.close();
	}
}
