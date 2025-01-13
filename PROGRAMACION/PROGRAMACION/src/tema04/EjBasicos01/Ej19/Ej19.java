package tema04.EjBasicos01.Ej19;

import java.util.Scanner;

public class Ej19 {

	public static void main(String[] args) {
		// Una vez seguidos los pasos en los 4 pasos en la clase Alumno creo el alumno
		Alumno a1 = new Alumno();
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe el dni:");
		String dni = sc.nextLine();
		a1.setDni(dni);

		System.out.println("Escribe el nombre: ");
		String nombre = sc.nextLine();
		a1.setNombre(nombre);

		System.out.println("Escribe la edad:");
		Integer edad = sc.nextInt();
		a1.setEdad(edad);

		/* System.out.println("Escribe la nota:"); Float nota = sc.nextFloat();
		 * a1.setNota(nota); */

		Integer nota = 0;
		System.out.println("Tus datos son los siguientes: \n" + a1.getDni() + "\n" + a1.getNombre() + "\n"
				+ a1.getEdad() + " años" + "\nNota:" + Alumno.aprobar(nota));
		
		sc.close();
	}

}
