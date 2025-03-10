package tema04.EjRepaso.Ej07;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Academia {
	//01
	private String ciudad;
	private Integer telefono;
	private List<Curso> lista;
		
	//02
	public Academia() {
		this.lista = new ArrayList<>();
	}
	
	//03
	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public List<Curso> getLista() {
		return lista;
	}

	public void setLista(List<Curso> lista) {
		this.lista = lista;
	}
	
	//04
	/*Método getCursosDisponibles() que devuelve una lista con todos los cursos que tengan plazas libres y cuya fecha de 
	 fin aún no haya pasado*/
	public List<Curso> getCursosDisponibles() {
		List<Curso> entra = new ArrayList<>();
		
		for (Curso curso : lista) {
			//Boolean anterior = curso.getFechaInicio().isAfter(curso.getFechaFin()); // Si la fecha es mas antigua que la fin
			Period periodo = curso.getFechaInicio().until(curso.getFechaFin());
			if(curso.getPlazasTotales() - curso.getPlazasOcupadas() > 0 && periodo.getMonths() > 0 ) { // comparo si la fecha
			// es negativo o la fecha final ya ha pasado. si es negativo no entra, si es positivo entra.
		//ahora debo crearme otra lista para guardar los que si entra. me la creo fuera del for
				entra.add(curso);
			}
		}
		return entra;
	}
	
	/* Método getPrecioMedio() que devuelve el precio medio del curso*/
	public BigDecimal getPrecioMedio() {
		if(lista.isEmpty()) {
			return  BigDecimal.ZERO;
		}
		// debo hacer un forech que recorra la lista y sume el precio de todos los cursos y crear una variable fuera en la 
		// que acumule la suma 
		
		BigDecimal suma = BigDecimal.ZERO;
		for (Curso curso : lista) {
			suma = suma.add(curso.getPrecio());
		}
		return suma.divide(new BigDecimal(lista.size()));
	}
	
	/* Método borrarCursosPasados() que borra todos los cursos cuya fecha de fin ya ha pasado*/	
	public void borrarCursosPasados() {
    // todos los metodos que solo borran es void. Si borra y devuelve algo no es void, seria del tipo que devuelve
        Iterator<Curso> iterator = lista.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getFechaFin().isBefore(LocalDate.now())) {
                iterator.remove();
            }
        }
	}
	
	/* Método getCursoMasBarato() que devuelve el curso con el precioMes más bajo de todos los que aún no han comenzado 
	 (fecha inicio posterior a hoy)*/
	public BigDecimal getCursoMasBarato() {
		for (Curso curso : lista) {
			
		}
		return BigDecimal.ZERO;
	}
	
	
	/* Método getTotalPlazasLibres() que devuelve la suma de todas las plazas libre de todos los cursos. */
	




}
