package exRestaurante.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Comanda {
	private List<Articulo>lista_Art;

	public Comanda() {
		super();
		this.lista_Art = new ArrayList<>();
	}

	public List<Articulo> getLista() {
		return lista_Art;
	}

	public void setLista(List<Articulo> lista) {
		this.lista_Art = lista;
	}
	
	//Funcionalidades especiales
	//a)
	public BigDecimal getTotal() {
		BigDecimal precio = BigDecimal.ZERO;
		for (Articulo articulo : lista_Art) {
			if (articulo.getServido()) {
			precio = precio.add(articulo.getPrecio());
			}
		}
		return precio.setScale(2,RoundingMode.HALF_DOWN);
	}

	@Override
	public String toString() {
		LocalDate hoy = LocalDate.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String fecha = hoy.format(format);
		
		return "--------------------------------\n"
				+ "Fecha: " + fecha + "--------------------------------\n"
				+ this.getLista()+ "--------------------------------\n"
				+ "Total: " + this.getTotal() + " €";
	}
	
}
