package tema04.EjBasicos01.Ej36;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej36 {

	public class App {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			Curso curso = new Curso(3);
			curso.setIdentificador(1L);
			curso.setDescripcion("DAM/DAW");

			//Alumno[] alumnos = new Alumno[3];
			List <Alumno> lista = new ArrayList <>();
			for (int i = 0; i < 3; i++) {
				Alumno alumno = null;
				Boolean dniCorrecto = false;
				do {
					System.out.println("Dime el dni");
					String dni = scanner.nextLine();
					alumno = new Alumno(dni);
					if (!alumno.validarDNI()) {
						System.err.println("Dni no vlido");
					}
					else {
						dniCorrecto = true;
					}
				}while(!dniCorrecto);
				
				System.out.println("Dime el nombre");
				String nombre = scanner.nextLine();
				alumno.setNombre(nombre);
				System.out.println("Dime la edad");
				Integer edad = scanner.nextInt();
				alumno.setEdad(edad);
				System.out.println("Dime la nota");
				Double nota = scanner.nextDouble();
				scanner.nextLine();
				alumno.setNota(nota);
				alumno.setCurso(curso);
				//alumnos[i] = alumno;
				lista.add(alumno);
				curso.addAlumno(alumno);
			}		
							   //alumnos
			for (Alumno alumno : lista) {
				System.out.println(alumno);
			}
			
			if (lista.get(0).equals(lista.get(1))           //if (alumnos[0].equals(alumnos[1]) 
					|| lista.get(0).equals(lista.get(2))    //    || alumnos[0].equals(alumnos[2])
					|| lista.get(1).equals(lista.get(2))) { //    || alumnos[1].equals(alumnos[2])) {
				System.err.println("Error: hay al menos 2 alumnos repetidos");
			}
			else {
				System.out.println("Felicidades: todos los alumnos son distintos!!");
			}
			                   //alumnos
			for (Alumno alumno : lista) {
				if (!alumno.validar()) {
					System.err.println("Alumno incorrecto con DNI: " + alumno.getDni());
				}
			}
			scanner.close();
		}
	}
}

