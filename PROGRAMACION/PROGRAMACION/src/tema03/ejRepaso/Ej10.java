package tema03.ejRepaso;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
<<<<<<< HEAD
		Scanner scanner = new Scanner(System.in);
		System.out.println("Cuntos alumnos hay en clase?");
		Integer cantAlumnos = scanner.nextInt();
		scanner.nextLine();
		
		Integer[] medias = new Integer[cantAlumnos];
		String[] nombres = new String[cantAlumnos];
		Integer sumaNotas;
=======
		Scanner sc = new Scanner(System.in);
		System.out.print("¿Cuántos alumnos hay en clase?");
		Integer na = sc.nextInt();
		sc.nextLine();
		Integer[] alumnos = new Integer[na];
		for (int i = 0; i < alumnos.length; i++) {
			System.out.println("¿Cuál es el nombre de alumno" +(i+1) + "?");
			String nombre = sc.nextLine();
			
			for (int j = 0; j < alumnos.length; j++) {
				
			}
>>>>>>> a7009d760e9e2d19fdfb32cd0c94818d4e5f8f7a

		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Cul es el nombre el alumno " + (i+1));
			String nombre = scanner.nextLine();
			nombres[i] = nombre;
			sumaNotas = 0;
			for (int examen = 1; examen <= 3; examen++) {
				System.out.println("Cul es la nota de " + nombre + " para el examen " + examen + "?");
				sumaNotas += scanner.nextInt();
			}
			scanner.nextLine();
			medias[i] = sumaNotas/3;
		}
		
		System.out.println("LISTADO DE NOTAS");
		sumaNotas = 0;
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("\tAlumno: " + nombres[i] + " - Nota media: " + medias[i]);
			sumaNotas += medias[i];
		}
		System.out.println("Media de los alumnos: " + (sumaNotas/cantAlumnos));
		
		scanner.close();




	}

}
