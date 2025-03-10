package tema04.EjBasicos01.Ej33;

public class Semaforo {
	public static final String ROJO = "ROJO";
	public static final String VERDE = "VERDE";
	public static final String AMBAR = "AMBAR";

//01
	private String color;
	private Boolean parpadeando;

//02
	public Semaforo() {
		this.color = ROJO;
		this.parpadeando = false;
	}

//03
	public String getColor() {
		return color;
	}

	public Boolean getParpadeando() {
		return parpadeando;
	}

	public static String getRojo() {
		return ROJO;
	}

	public static String getVerde() {
		return VERDE;
	}

	public static String getAmbar() {
		return AMBAR;
	}

//04
	/*
	 * Cuando se intente cambiar el color, si se indica un color no válido, no se
	 * modificará el atributo.
	 */
	public void setColor(String color) {
		if (color.equals(AMBAR) || color.equals(ROJO) || color.equals(VERDE)) {
			this.color = color;
		} else {
			System.out.println("COLOR NO VÁLIDO.");
		}
	}

	public void setParpadeando(Boolean parpadeando) {
		if (color.equals(AMBAR)) {
			this.parpadeando = parpadeando;
		}
	}

	@Override
	public String toString() {
		String mensaje = "Semáforo en " + color;
		if (color.equals(AMBAR)) {
			mensaje = mensaje + " parpadeando";
		}
		return mensaje;
	}

	// cambiarEstado() que modifique el valor de los atributos del semáforo
	// siguiendo este ciclo: v,aP,a,r y again v ..
	public void cambiarEstado() {
		if (color.equals(VERDE)) {
			this.color = AMBAR;
			this.parpadeando = true;
		} 
		else if (color.equals(AMBAR) && parpadeando == true) {
			this.parpadeando = false;
		}
		else if(color.equals(AMBAR) && parpadeando == false) {
			this.color = ROJO;
		}
		else if(color.equals(ROJO)){
			this.color = VERDE;
		}
	}

}
