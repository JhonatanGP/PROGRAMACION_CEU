package tema05.EjerciciosBasicos.Ej07;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class Sociedad {
	 
	private Set<Persona> conjunto;
 
	public Set<Persona> getConjunto() {
		return conjunto;
	}
 
	public void setConjunto(Set<Persona> conjunto) {
		this.conjunto = conjunto;
	}
 
	public Sociedad() {
		conjunto = new HashSet<>();
	}
 
	public void addPersona(String genero, BigDecimal altura) throws ParametroIncorrectoException {
		try {
			Persona p1 = new Persona();
			if (!genero.equalsIgnoreCase("H") && !genero.equalsIgnoreCase("M")) {
				throw new ParametroIncorrectoException("El genero tiene que ser H o M");
			} else {
				p1.setAltura(altura);
				p1.setGenero(genero);
				conjunto.add(p1);
			}
		} catch (ParametroIncorrectoException e) {
			System.out.println("Genero no es ni H ni M");
		}
	}
 
	public BigDecimal calcularAlturaMediaHombres() throws ListaVaciaException {
		BigDecimal media = BigDecimal.ZERO;
		Integer contador = 0;
		try {
			for (Persona persona : conjunto) {
				if (persona.getGenero().equalsIgnoreCase("H")) {
					media = media.add(persona.getAltura());
					contador ++;
				}
			}
			if (contador == 0) {
				throw new ListaVaciaException("No hay genero H");
			}
		} catch (ListaVaciaException e) {
			System.out.println("Lista Vacia");
		}
		return media.divide(new BigDecimal(contador));
	}
 
	public BigDecimal calcularAlturaMediaMujeres() throws ListaVaciaException {
		BigDecimal media = BigDecimal.ZERO;
		Integer contador = 0;
		try {
			for (Persona persona : conjunto) {
				if (persona.getGenero().equalsIgnoreCase("M")) {
					media = media.add(persona.getAltura());
					contador++;
				}
			}
			if (contador == 0) {
				throw new ListaVaciaException("No hay genero M");
			}
		} catch (ListaVaciaException e) {
			System.out.println("Lista Vacia");
		}
		return media.divide(new BigDecimal(contador));
	}
 
	public BigDecimal calcularAlturaMedia() throws ListaVaciaException {
		BigDecimal media = BigDecimal.ZERO;
		BigDecimal contador = BigDecimal.ZERO;
		try {
			for (Persona persona : conjunto) {
				if (persona.getGenero().equalsIgnoreCase("H") || persona.getGenero().equalsIgnoreCase("M")) {
					media = media.add(persona.getAltura());
					contador = contador.add(new BigDecimal(1));
				}
			}
			if (media.compareTo(new BigDecimal(0)) <= 0) {
				throw new ListaVaciaException("No hay genero M ni H");
			}
		} catch (ListaVaciaException e) {
			System.out.println("Lista Vacia");
		}
		return media.divide(contador);
	}
 
}
