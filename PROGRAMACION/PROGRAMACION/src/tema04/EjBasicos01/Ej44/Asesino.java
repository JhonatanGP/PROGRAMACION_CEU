package tema04.EjBasicos01.Ej44;

public class Asesino extends Personaje{

	public Asesino(String nombre, String codigo) {
		super(nombre, codigo);//en la clase padre Personaje, el constructor debe tener como minimo nombre y cdigo y sus hijas tmb
	}

	@Override
	public Integer getDaño() {
		return 10;
	}

	@Override
	public Integer getDañoPorSegundo() {
		return 5;
	}

}
