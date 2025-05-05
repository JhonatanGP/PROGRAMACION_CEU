package tema06.EjBasicos.Ej09.modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import tema06.EjBasicos.Ej09.servicios.DatosIncompletosException;

public class Persona {
	
	private String dni;
	private String nombre;
	private String apellidos;
	private LocalDate fechaNac;
	
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
	public LocalDate getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}
	public void validar() throws DatosIncompletosException{
    	if(nombre.equals(null) || nombre.isEmpty()|| apellidos.equals(null) || apellidos.isEmpty()
    			|| dni.equals(null) || dni.isEmpty() || fechaNac.equals(null)) {
    		throw new DatosIncompletosException ("Hay campos vacíos");
    	}
    }
	
	@Override
    public String toString() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Persona dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNac="
                + formato.format(fechaNac) + ".";
	}

}