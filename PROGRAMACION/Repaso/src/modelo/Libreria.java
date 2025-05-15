package modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

public class Libreria {
	
//01
	private String nombre;
	private Map<String,Libro> mapa;
	
//02 	
	public Libreria() {
		this.mapa = new HashMap<String, Libro>();
	}
	
//03
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Map<String, Libro> getMapa() {
		return mapa;
	}

	public void setMapa(Map<String, Libro> mapa) {
		this.mapa = mapa;
	}

	//04
	
/*- getTasacionCompleta() que no recibe nada y devuelve un BigDecimal con la suma del precio de todos los libros.*/
	public BigDecimal getTasacionCompleta() {
		
		BigDecimal precioTotal = new BigDecimal(0);
		Set<Entry<String,Libro>> pares = mapa.entrySet();
		for (Entry<String, Libro> entry : pares) {
			precioTotal = precioTotal.add(entry.getValue().getPrecio());
		}
		return precioTotal.setScale(2,RoundingMode.HALF_DOWN);
	}
	
/*- getPrecioMedio() que devuelva el precio medio del libro*/
	public BigDecimal getPrecioMedio() {
		BigDecimal precio = BigDecimal.ZERO;
		Integer cont = 0;
		for (Map.Entry<String, Libro> entry : mapa.entrySet()) {
			precio = precio.add(entry.getValue().getPrecio());
			cont++;
		}
		return precio.divide(new BigDecimal(cont));
	}
	
/*- getLibrosBaratos() devuelve una lista (List) con todos los libros (sean del tipo que sean) que cuesten 
 * menos de 10 euros. */
	public List<Libro> getLibrosBaratos() {
		List<Libro> lista = new ArrayList<>();
		for (Map.Entry<String, Libro> entry : mapa.entrySet()) {
			if (entry.getValue().getPrecio().compareTo(new BigDecimal(10)) < 0) {
				lista.add(entry.getValue());
			}
		}
		return lista;
	}
	
	@Override
	public String toString() {
		return "Libreria [nombre=" + nombre + ", mapa=" + mapa + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libreria other = (Libreria) obj;
		return Objects.equals(nombre, other.nombre);
	}



	




}
