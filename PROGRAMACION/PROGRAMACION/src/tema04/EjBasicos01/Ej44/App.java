package tema04.EjBasicos01.Ej44;

public class App {

	public static void main(String[] args) {
		// 1. Crea un jugador que tenga un equipo de combate compuesto por 3 asesinos.
		Asesino a1 = new Asesino("a1","a1");
		a1.setNombre("a1");
		a1.setCodigo("a1");
		
		Jugador j1 = new Jugador();
		j1.setNombre("Player1");
		
		
		// 2. Crea un parásito con nombre “Blas” y código “B69”. Muestra cuántos puntos quita al rival y cada cuánto tiempo.
		Parasito p1 = new Parasito("Blas", "B69");
		System.out.println("El parasito " + p1.getNombre() + " con código " + p1.getCodigo()+" quita " + p1.getDaño() +" puntos cada "
		+ p1.getDañoPorSegundo()+" segundo");
		// 3. Añade el parásito Blas al jugador.
		
		// 4. Imprime los puntos de vida del equipo de combate del jugador
		
		// 5. Intenta añadir de nuevo el parásito Blas al equipo del jugador
		
		// 6. Imprime todos los personajes del equipo de combate del jugador (Deberían ser sólo 4)
		
		// 7. Crea otros dos parásitos nuevos. Intenta añadirlos al equipo de combate del jugador.
		
		// 8. Imprime todos los personajes del equipo de combate del jugador (Deberían ser sólo 5)
		
		// 9. Imprime los puntos del equipo de combate del jugador. (Deberían ser 700)
		

	}

}
