package tema04.EjBasicos01.Ej44;

import java.util.Objects;

public abstract class Personaje {
	// 01
	private String nombre;
	private String codigo;
	private Integer puntosVida;

	// 02											// Al ser clase  padre el constructor no puede estar vacio, debe tener 
	public Personaje(String nombre, String codigo) { // como minimo nombre y codigo, que hereden sus hijas asesino y parasito
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

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personaje other = (Personaje) obj;
		return Objects.equals(codigo, other.codigo);
	}
	
	

}
