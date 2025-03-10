package tema04.EjBasicos01.Ej33;

public class App {

	public static void main(String[] args) {
// 1. Crea un Semáforo.
		Semaforo s = new Semaforo();
		System.out.println(s);
// 2. Cambia el color a un color incorrecto.
		s.setColor("blanco");
		System.out.println(s);
// 3. Cambia el color a verde.
		s.setColor(s.VERDE);
		System.out.println(s);
// 4. Pon el atributo parpadeando a cierto.
		s.setParpadeando(true);
		System.out.println(s);
// 5. Cambia el color a ámbar.
		s.setColor(s.AMBAR);
		System.out.println(s);
// 6. Pon el atributo parpadeando a cierto.
		s.setParpadeando(true);
		System.out.println(s);
// 7. Llama 5 veces al método cambiarEstado (usando un bucle)
		for (int i = 0; i < 5; i++) {
			s.cambiarEstado();
		}
		System.out.println(s);

// 8. Crea un nuevo semáforo que sea copia del anterior.
		Semaforo s2 = new Semaforo();
		s2.setColor(s.getColor());
		s2.setParpadeando(s.getParpadeando());
		System.out.println(s2);

	}

}