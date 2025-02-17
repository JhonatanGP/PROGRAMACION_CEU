package tema04.EjBasicos01.Ej50;

import java.util.Objects;

public class Pais {
	//01
	private String codigo;
	private String descripcion;
	
	//02
	public Pais(String codigo, String descripcion) {
		super();
		this.codigo = codigo.toUpperCase();
		this.descripcion = descripcion;
	}

	//03
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	//04
	@Override
	public String toString() {
		return "Pais [codigo=" + codigo + ", descripcion=" + descripcion + "]";
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
		Pais other = (Pais) obj;
		return Objects.equals(codigo, other.codigo);
	}

}
