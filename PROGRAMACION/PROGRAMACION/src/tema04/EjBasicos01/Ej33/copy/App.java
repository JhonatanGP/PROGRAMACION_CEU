package tema04.EjBasicos01.Ej33.copy;

public class App {

		public static void main(String[] args) {
			// paso 1
			Semaforo semaforo = new Semaforo();
			System.out.println(semaforo);
			// paso 2
			semaforo.setColor("azul");
			System.out.println(semaforo);
			// paso 3
			semaforo.setColor(Semaforo.VERDE);
			System.out.println(semaforo);
			// paso 4
			semaforo.setParpadeando(true);
			System.out.println(semaforo);
			// paso 5
			semaforo.setColor(Semaforo.AMBAR);
			System.out.println(semaforo);
			// paso 6
			semaforo.setParpadeando(true);
			System.out.println(semaforo);
			// paso 7
			for (int i = 0; i < 5; i++) {
				semaforo.cambiarEstado();
			}
			System.out.println(semaforo);
		
			
			// paso 8
			Semaforo copia = new Semaforo();	
			copia.setColor(semaforo.getColor());
			copia.setParpadeando(semaforo.getParpadeando());
			System.out.println(copia);
			
		}

	}