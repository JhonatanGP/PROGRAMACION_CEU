package tema04.EjBasicos01.Ej322;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

// 1. Crea un objeto reloj con el constructor por defecto
		Reloj reloj = new Reloj();

// 2. Solicita al usuario una hora correcta en tres pasos (hora, minutos, segundos). Y pon en hora el reloj.
		Scanner sc = new Scanner(System.in);
		Integer hora, minuto, seg;
		do {
			System.out.println("Ingresa la hora:");
			hora = sc.nextInt();
			System.out.println("Ingresa los minutos:");
			minuto = sc.nextInt();
			System.out.println("Ingresa los segundos:");
			seg = sc.nextInt();
			reloj.ponerEnHora(hora, minuto, seg);
			if (!reloj.check()) {
				System.err.println("Hora incorrecta, inténtelo de nuevo.");
			}
		} while (!reloj.check());

		System.out.println(reloj);
		// 3. Cambiar a formato NO 24 horas
		reloj.setFormato24h(false);
		System.out.println(reloj);
		// 4. Cambia la hora a las 24:17
		reloj.ponerEnHora(24, 17);
		System.out.println(reloj);
		// 5. Cambia la hora a las 21:82
		reloj.ponerEnHora(21, 82);
		System.out.println(reloj);
		// 6. Cambia la hora a las 17:16:15
		reloj.ponerEnHora(17, 16, 15);
		System.out.println(reloj);
		// 7. Crea otro objeto reloj con el constructor que recibe la hora e indica
		// esta: 17:16:15
		Reloj reloj2 = new Reloj(17, 16, 15);
		System.out.println(reloj2);
		// 8. Pregunta si los dos objetos son iguales e imprime el resultado
		System.out.println(reloj.equals(reloj2));
	}

}
