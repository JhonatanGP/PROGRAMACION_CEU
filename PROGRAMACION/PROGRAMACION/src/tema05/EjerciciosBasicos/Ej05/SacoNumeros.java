package tema05.EjerciciosBasicos.Ej05;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SacoNumeros {
//01
	private List<Integer> numeros;

//02
	public SacoNumeros() {
		super();
		this.numeros = new ArrayList<>();
	}

//03
	public void addNumeros(Integer num) {
		this.numeros.add(num);
	}

	public Integer getNumero(Integer pos) {
		try {
			
			return this.numeros.get(pos);
		} catch (IndexOutOfBoundsException e) {
			return null;
		}
	}
	
	public BigDecimal division() {
		for (int i = 0; i < numeros.size(); i++) {
			for (int j = 0; j < numeros.size(); j++) {
				this.numeros.get(i).divide();
			}
			
		}
		return ;
	}

	@Override
	public String toString() {
		return "Lista de Numeros: " + numeros;
	}

}
