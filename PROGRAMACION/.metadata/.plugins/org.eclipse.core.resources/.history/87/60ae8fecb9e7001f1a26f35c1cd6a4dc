package tema04.EjBasicos01.Ej44;

public abstract class Personaje {
	// 01
	private String nombre;
	private String codigo;
	private Integer puntosVida;

	// 02											// Al ser clase  padre el constructor no puede estar vacio, debe tener 
	public Personaje(String nombre, String codigo , Integer puntosVida) { // como minimo nombre y codigo, que hereden sus hijas asesino y parasito
		super();
			}

	// 03
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	

	public Integer getPuntosVida() {
		return puntosVida;
	}

	public void setPuntosVida(Integer puntosVida) {
		this.puntosVida = puntosVida;
	}

	public abstract Integer getDaño();

	public abstract Integer getDañoPorSegundo();
	
	// 04
	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", codigo=" + codigo + "]";
	}
	

}
