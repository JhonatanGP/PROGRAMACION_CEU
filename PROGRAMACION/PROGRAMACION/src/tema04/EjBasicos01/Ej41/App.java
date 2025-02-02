package tema04.EjBasicos01.Ej41;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * 1. Crea dos equipos con al menos 3 jugadores cada uno. Solicitando los datos
		 * al usuario. Designa al capitán de cada equipo (será el primer jugador
		 * indicado). Cuando los tengas, imprime los equipos por consola.
		 */

		List<Jugador> listaEquipo1 = new ArrayList<>(); // LISTA EQUIPO 1
		List<Jugador> listaEquipo2 = new ArrayList<>(); // LISTA EQUIPO 2

		System.out.println("Ingrese los nombres de los jugadores para el Equipo 1 (mínimo 3):");
		for (int i = 0; i < 3; i++) {
			System.out.print("Jugador " + (i + 1) + ": ");
			//listaEquipo1.add(sc.nextLine());
		}

		System.out.println("Ingrese los nombres de los jugadores para el Equipo 2 (mínimo 3):");
		for (int i = 0; i < 3; i++) {
			System.out.print("Jugador " + (i + 1) + ": ");
			// listaEquipo2.add(sc.nextLine());
		}

		System.out.println("\nEquipos formados:");
		System.out.println("Equipo 1:");
		// System.out.println("Capitán: " + equipo1.get(0));
		// System.out.println("Jugadores: " + equipo1);

		System.out.println("\nEquipo 2:");
		// System.out.println("Capitán: " + equipo2.get(0));
		// System.out.println("Jugadores: " + equipo2);

		sc.close();

		// 2. Crea un partido para estos dos equipos. Establece el resultado en 0 a 0.
		// Imprime el partido.

		// 3. Pregunta al usuario por el resultado y cámbialo. Imprime el partido.

		// 4. Imprime el equipo ganador.

		// 5. Añade al equipo visitante un jugador con el dorsal 99 y nombre “Blas
		// infiltrado”. Imprime el equipo visitante.

		// 6. Cambia el capitán del equipo local para que sea el último jugador de la
		// lista de sus jugadores. Imprime el equipo local.

	}

}
