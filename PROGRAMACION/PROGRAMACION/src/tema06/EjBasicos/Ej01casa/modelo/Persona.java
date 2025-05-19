package tema06.EjBasicos.Ej01casa.modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

import tema06.EjBasicos.Ej03.modelo.DatosIncompletosException;

public class Persona {
//01 atributos
	private String dni;
	private String nombre;
	private String apellidos;
	private LocalDate fecha_nac;
	
//2 constructores
	public Persona() {
	
} 
	
//3 get and set
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public LocalDate getFecha_nac() {
		return fecha_nac;
	}
	public void setFecha_nac(LocalDate fecha_nac) {
		this.fecha_nac = fecha_nac;
	}
	
	public Boolean  validar() throws DatosIncompletosException {
		if(dni.equals(null) || dni.isEmpty() ||nombre.equals(null) || nombre.isEmpty()
				|| apellidos.equals(null) || apellidos.isEmpty()|| fecha_nac.equals(null)	) {
    		throw new DatosIncompletosException ("Hay campos vacíos");
		}
		return true;
	}
	
	@Override
	public String toString() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "Persona dni = " + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fecha_nac=" 
        		+ formato.format(fecha_nac)	+ ".";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(dni, other.dni);
	}

	
	
	

	

}
