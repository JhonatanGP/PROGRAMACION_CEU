package tema04.EjBasicos01.RepasoConceptos;

public class main {

	public static void main(String[] args) {
		/*
		 * Caballo caballo1 = new Caballo(); System.out.println(caballo1.nombre);
		 * System.out.println(caballo1.carrerasGanadas);
		 * System.out.println(caballo1.color); *
		 */
		Caballo caballo1 = new Caballo();
		System.out.println(caballo1.getColor());
		System.out.println(caballo1.getCarrerasGanadas());
		caballo1.setEdad(20);
		System.out.println(caballo1.anyoNacimiento());
		caballo1.setCarrerasGanadas(5);
		
		caballo1.incrementarCarrerasGanadas();
		caballo1.relincha();
		System.out.println(caballo1.getNombre());
		caballo1.setNombre("bolita");
		System.out.println(caballo1.getNombre());
		caballo1.setColor("negro");
		System.out.println(caballo1.getColor());
		caballo1.setEdad(2);
		caballo1.setCarrerasGanadas(10);
		
		Caballo c2 = new Caballo("Fideo",4,20,"blanco");
		System.out.println(c2.getNombre() + c2.getCarrerasGanadas() + c2.getEdad() + c2.getColor());
		
	}

}
