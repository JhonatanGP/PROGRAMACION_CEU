package tema04.EjBasicos01.Ej43;

public class Directores extends Trabajadores{

	public Directores(String nombre, int año_nac, String nacionalidad) {
		super(nombre, año_nac, nacionalidad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double getSueldo() {
		// TODO Auto-generated method stub
		return SUELDO_DIRECTORES;
	}
	

}
