package tema04.EjBasicos01.Ej47;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Carrito {
	// 01
	private LocalDate fechaCreacion;
	private LocalDate fechaActualizacion;
	private Cliente cliente;
	private List<Articulo> articulo;

	// 02
	public Carrito(Cliente cliente) {
		super();
		this.cliente = cliente;
		this.fechaCreacion = LocalDate.now();
		this.fechaActualizacion = LocalDate.now();
		this.articulo = new ArrayList<>();
	}

	// 03
	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public LocalDate getFechaActualizacion() {
		return fechaActualizacion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public List<Articulo> getArticulo() {
		return articulo;
	}

	// 04
	public Integer getCantidad() {
		if (this.articulo.size() < 0) {
			return 0;
		}
		return articulo.size();
	}

	public Double getTotal() {
		Double precio = 0D; // 0.0 o 0d
		if (this.articulo.size() < 0) {
			return 0d;
		}
		for (int i = 0; i < articulo.size(); i++) {
			precio += articulo.get(i).getPrecio();
		}
		return precio;
	}

	public Double getPrecioMedio() {
		Double precio = 0d;
		if (getCantidad() == 0) {
			return 0d;
		}
		for (int i = 0; i < articulo.size(); i++) { // getTotal()/getCantidad()
			precio += articulo.get(i).getPrecio();
		}
		Double media = precio / articulo.size();
		return media;
	}

	@Override
	public String toString() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String fecha = this.fechaActualizacion.format(formato);

		return "Cliente --> Nombre: " + this.cliente.getNombre() + " | DNI:" + this.cliente.getDni()
				+ " Carrito --> [Número de Articulos = " + this.articulo.size() + ", Total a pagar: " + getTotal()
				+ "€ , Última Actualizacion : " + fecha + "]";
	}

	public void addArticulo(Articulo articulo) {
		this.articulo.add(articulo);
		this.fechaActualizacion = LocalDate.now();

	}

	public void borrarArticulo(int posicion) { // Integer es null|| int empieza en 0.
		// hay que comprobar si la posicion es correcta:

		if (posicion >= 0 && posicion < this.articulo.size()) // posicion < getCantidad()
		{
			this.articulo.remove(posicion);
			this.fechaActualizacion = LocalDate.now();
		}

	}

	public void vaciarCesta() {
		this.articulo.clear();
		this.fechaActualizacion = LocalDate.now();
	}

}
