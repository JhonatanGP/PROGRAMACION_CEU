package tema04.EjBasicos01.Ej22;

public class Curso {
	private String identificador;
	private String descripcion;
	
			
	public Curso(String identificador, String descripcion) {
		super();
		this.identificador = identificador;
		this.descripcion = descripcion;
	}
	
	public Curso() {
		super();
	}
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}