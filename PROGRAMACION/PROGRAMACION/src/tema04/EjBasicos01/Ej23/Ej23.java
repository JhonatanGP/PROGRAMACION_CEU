package tema04.EjBasicos01.Ej23;

import java.util.Scanner;

public class Ej23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Una vez seguidos los pasos en los 4 pasos en la clase Alumno creo el alumno
		Alumno a1 = new Alumno("54999853E");
		Alumno a2 = new Alumno("54999853E");

		Curso curso = new Curso("09876", "DAW");

		Profesor p1 = new Profesor();

		System.out.println("Escribe el nombre del profesor: ");
		String nombrep = sc.nextLine();
		p1.setNombre(nombrep);

		System.out.println("Escribe la edad:");
		Integer edadp = sc.nextInt();
		p1.setEdad(edadp);

		System.out.println("Profesor: " + p1.getNombre()  + "\nEdad: " + p1.getEdad());

		Curso curso2 = new Curso();
		curso2.setDescripcion("Programación");
		curso2.setIdentificador("9785767H");

		a2.setNombre("rdev");
		a2.setEdad(54);
		a2.setNota(3f);
		a2.setCurso(curso2);

		System.out.println("Tus datos son los siguientes: \n" + a2.getDni() + "\n" + a2.getNombre() + "\n"
				+ a2.getEdad() + " años" + "\nNota:" + a2.getNota() + "\nCurso:"  
				+ a2.getCurso().getDescripcion() + " " + a2.getCurso().getIdentificador());

		System.out.println();

		System.out.print("DNI: ");
		System.out.println(a1.getDni());

		System.out.println("Escribe el nombre: ");
		String nombre = sc.nextLine();
		a1.setNombre(nombre);

		System.out.println("Escribe la edad:");
		Integer edad = sc.nextInt();
		a1.setEdad(edad);

		System.out.println("Escribe la nota:");
		Float nota = sc.nextFloat();
		a1.setNota(nota);

		sc.nextLine();

		System.out.println("Escribe el curso:");
		a1.setCurso(curso);
		System.out.println(a1.toString());
		System.out.println();

		System.out.println("Tus datos son los siguientes: \n" + a1.getDni() + "\n" + a1.getNombre() + "\n"
				+ a1.getEdad() + " años" + "\nNota:" + a1.getNota() + "\nCurso:" + a1.toString());
		// a1.getCurso() no se pone, se hace to string

		a1.aprobar();
		System.out.println("Nueva nota:" + a1.getNota());

		sc.close();
	}

}
