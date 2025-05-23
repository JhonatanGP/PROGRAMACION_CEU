package tema05.EjerciciosBasicos.Ej06;

import java.math.BigDecimal;

public class Persona {
//01
	private String genero;
	private BigDecimal altura;
//02
	public Persona() {

	}
//03

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) throws ParametroIncorrectoException {
		if(!genero.equalsIgnoreCase("H") && !genero.equalsIgnoreCase("M")) {
			throw new ParametroIncorrectoException("El género tiene que ser H o M.");
		}
		this.genero = genero;
	} 

	public BigDecimal getAltura() {
		return altura;
	}

	public void setAltura(BigDecimal altura) throws ParametroIncorrectoException {
        if (altura.compareTo(BigDecimal.ZERO) <= 0 || altura.compareTo(BigDecimal.valueOf(3)) >= 0) {
            throw new ParametroIncorrectoException("La altura debe estar entre 0 y 3 metros (excluidos). Valor recibido: " + altura);
        }
        this.altura = altura;
    }

//04
	@Override
	public String toString() {
		return "Género = " + genero + ", altura = " + altura + ".";
	}
	


}
