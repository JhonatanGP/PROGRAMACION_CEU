package tema04.EjBasicos01.Ej24;

import java.util.Scanner;

public class Ej24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Alumno a2 = new Alumno("54999853E");

		Curso curso2 = new Curso();
		curso2.setDescripcion("Programación");
		curso2.setIdentificador("9785767H");

		a2.setNombre("MANUEL");
		a2.setEdad(54);
		a2.setNota(3f);
		a2.setCurso(curso2);

		/*
		 * System.out.println("Tus datos son los siguientes: \n" + a2.getDni() + "\n" +
		 * a2.getNombre() + "\n" + a2.getEdad() + " años" + "\nNota:" + a2.getNota() +
		 * "\nCurso:" + a2.getCurso().getDescripcion() + " " + a2.getCurso().getIdentificador());
		 */
		System.out.println(a2);

		sc.close();
	}

}
