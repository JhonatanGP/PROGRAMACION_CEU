package tema04.EjBasicos01.Ej47;

public  class Articulo {
	// 01
	private String descripcion;
	private Double precio;

	// 02
	public Articulo() {
		super();
	}

	// 03
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

}
