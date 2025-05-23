package ExTren;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Pasajero {
//01
	private String dni;
	private String nombre;
	private LocalDate fechaNac;
//02
	public Pasajero() {
		
	}
//03
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni.toUpperCase();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}
//04
	public Boolean isTerceraEdad() {
		LocalDate hoy = LocalDate.now();
		Period p = this.fechaNac.until(hoy);
		if(p.getYears() >= 65) {
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return dni+ " - " + nombre + " - " + fechaNac.format(f);
	}
	
	
	
	


}
