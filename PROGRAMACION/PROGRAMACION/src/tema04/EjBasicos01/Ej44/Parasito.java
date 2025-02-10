package tema04.EjBasicos01.Ej44;

public class Parasito extends Personaje{

	public Parasito(String nombre, String codigo) {
		super(nombre, codigo);//en la clase padre Personaje, el constructor debe tener como minimo nombre y cdigo y sus hijas tmb
	}

	@Override
	public Integer getDaño() {
		return 2;
	}

	@Override
	public Integer getDañoPorSegundo() {
		return 1;
	}

	@Override
	public String toString() {
		return "Parasito [getDaño()=" + getDaño() + ", getDañoPorSegundo()=" + getDañoPorSegundo() + ", getNombre()="
				+ getNombre() + ", getCodigo()=" + getCodigo() + ", getPuntosVida()=" + getPuntosVida()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	

}
