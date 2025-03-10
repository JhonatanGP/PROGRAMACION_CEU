package tema04.EjRepasoEj7;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

public class Curso {
	//01
	private String nombre;
	private LocalDate  fechaInicio;
	private LocalDate fechaFin;
	private BigDecimal precio;
	private Integer plazasTotales;
	private Integer plazasOcupadas;
	
	//02
	public Curso(String nombre, BigDecimal precio, Integer plazasTotales) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.plazasTotales = plazasTotales;
		this.plazasOcupadas = 0;
	}
	//03
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public Integer getPlazasTotales() {
		return plazasTotales;
	}

	public void setPlazasTotales(Integer plazasTotales) {
		this.plazasTotales = plazasTotales;
	}

	public Integer getPlazasOcupadas() {
		return plazasOcupadas;
	}

	public void setPlazasOcupadas(Integer plazasOcupadas) {
		this.plazasOcupadas = plazasOcupadas;
	}
	
	//04
	/*Método getDuracionCurso() que devuelve el número de meses que dura el curso */
	public Integer getDuracionCurso() {
		Period periodo = fechaInicio.until(fechaFin); 
		return periodo.getMonths() + periodo.getYears()*12;
	}
	
	/* Método isPlazasLibres() que devuelve un booleano indicando si hay o no plazas libres*/
	public Boolean isPlazasLibres() {
		if(plazasTotales-plazasOcupadas > 0) {
			return true;
		}return false;
	}
	/* Método getPrecioMes() que devuelve el precio/mes del curso. Se obtiene dividiendo el precio por la cantidad 
	 * de meses de duración del mismo.*/ 
	public BigDecimal getPrecioMes() {
		return this.precio.divide(new BigDecimal(getDuracionCurso()));
	}
	

	
	
	



}
