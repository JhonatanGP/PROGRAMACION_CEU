package tema04.EjBasicos01.Ej43;

public class Actores extends Trabajadores {

	public Actores(String nombre, int año_nac, String nacionalidad) {
		super(nombre, año_nac, nacionalidad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double getSueldo() {
		// TODO Auto-generated method stub
		return SUELDO_ACTORES;
	}
	

}
