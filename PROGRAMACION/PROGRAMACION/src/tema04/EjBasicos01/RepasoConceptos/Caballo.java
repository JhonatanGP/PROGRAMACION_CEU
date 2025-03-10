package tema04.EjBasicos01.RepasoConceptos;

public class Caballo {
	private String nombre;
	private int carrerasGanadas;
	private int edad;
	private String color;
	
	public Caballo() {
		
	}
	
	public Caballo(String nombre, int carrerasGanadas, int edad, String color) {
		super();
		this.nombre = nombre;
		this.carrerasGanadas = carrerasGanadas;
		this.edad = edad;
		this.color = color;
	}


	public void imprimeCarrerasGanadas() {
		System.out.println("El número de carreras ganadas es " + this.carrerasGanadas);
	}

	public Integer anyoNacimiento() {
		return 2025 - this.edad;
	}

	public void incrementarCarrerasGanadas() {
		this.carrerasGanadas++;
		System.out.println(this.carrerasGanadas);
	}
	
	public void relincha() {
		System.out.println("Hiiiieeee");
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCarrerasGanadas() {
		return carrerasGanadas;
	}

	public void setCarrerasGanadas(Integer carrerasGanadas) {
		this.carrerasGanadas = carrerasGanadas;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
