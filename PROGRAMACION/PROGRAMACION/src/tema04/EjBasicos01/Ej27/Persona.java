package tema04.EjBasicos01.Ej27;

public class Persona {
	// 1 Creo Atributos
	private String nombre;
	private Integer edad;
	
	
	// 2 Constructores
	public Persona(){
		
	}
	
	// 3 Get and Set
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	// to_string

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
}
