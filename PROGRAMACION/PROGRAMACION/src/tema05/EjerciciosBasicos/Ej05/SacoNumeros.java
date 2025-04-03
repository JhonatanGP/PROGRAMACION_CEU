package tema05.EjerciciosBasicos.Ej05;

import java.math.BigDecimal;
import java.math.RoundingMode;
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
		try {
			BigDecimal resultado = new BigDecimal(numeros.get(0));
			for (int i = 1; i < numeros.size(); i++) {
				BigDecimal siguiente = new BigDecimal(numeros.get(i));
				resultado = resultado.divide(siguiente,2,RoundingMode.HALF_UP);
			}
			return resultado;
		}
		catch(ArithmeticException e) {
			return BigDecimal.ZERO;
		}
		catch(IndexOutOfBoundsException e) {
			return BigDecimal.ZERO;
		}
		finally {
			System.out.println("Division completa");
		}
	}

	@Override
	public String toString() {
		return "Lista de Numeros: " + numeros;
	}

}
