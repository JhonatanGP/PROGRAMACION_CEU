package tema04.EjRepaso.Ej01;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

public class Smartphone {
//01
	private String marca;
	private String modelo;
	private String imei;
	private BigDecimal precio;
	private LocalDate fechaFab;
	private Boolean activo;

//02
	public Smartphone() {
		this.precio = BigDecimal.ZERO;
		this.activo = true;
	}

	public Smartphone(String imei) {
		this.imei = imei;
		this.precio = BigDecimal.ZERO;
		this.activo = true;
	}

	public Smartphone(String marca, String modelo, String imei) {
		this.marca = marca;
		this.modelo = modelo;
		this.imei = imei;
		this.precio = BigDecimal.ZERO;
		this.activo = true;
	}

//03
	public void setPrecio(BigDecimal precio) {// cambia el precio del Smartphone
		this.precio = precio;
	}

//04
	public void activar() {// activa el Smartphone
		this.activo = true;
	}

	public void desactivar() { // desactiva el Smartphone
		this.activo = false;
	}

	// devuelve los años entre el 1 de abril del 2000 y la fecha de fabricación del Smartphone
	public Integer getEdad() {
		LocalDate fecha = LocalDate.of(2000, 4, 1);
		Period p = fecha.until(fechaFab);
		return p.getYears();
	}
	// recibe una marca y modelo para cambiar los del Smartphone
	public void cambiarMarcaModelo(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
	// recibe y cambia la fecha de fabricación del Smartphone
	public void establecerFabricacion(LocalDate fecha) {
		this.fechaFab = fecha;
	}
	// devuelve el precio del Smartphone sumándole el IVA (21%)
	public BigDecimal getPrecioMasIva() {
		BigDecimal precio = BigDecimal.ZERO;
		precio = precio.add(precio.multiply(new BigDecimal(0.21)));
		return precio;
	}
	// isAltaGama() recibe un precio base y devolverá un booleano indicando si el Smartphone es de alta gama o no. 
	//Los Smartphone de alta gama son aquellos cuyo precio es mayor al precio base recibido
	
	// isDatosCompletos() devuelve un booleano indicando si los datos del Smartphone están completos. Para que lo estén,
	//al menos el imai debe no estar vacío ni contener sólo espacios en blanco, y el precio no puede ser null.
	
	// isGratis() devuelve si el precio del Smartphone es o no es 0 euros.
	
	// rebajar() modifica el precio del Smartphone restándole 10 euros.
	
	//toString() sobrescribe el método toString de Object. Debe devolver una cadena con el formato “marca (modelo)”. 
	//Si el Smartphone además está inactivo, la cadena será así “marca (modelo) – INACTIVO”. 


}
