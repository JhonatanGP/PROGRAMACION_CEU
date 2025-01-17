package tema04.EjBasicos01.Ej08;

public class Calculadora1 {

	public static final String SUMAR = "ADD";
	public static final String RESTAR = "SUB";
	public static final String MULTIPLICAR = "MUL";
	public static final String DIVIDIR = "DIV";

	public static Integer getSumar(Integer n1, Integer n2) {
		Integer suma = n1 + n2;
		return suma;
	}

	public static Integer getRestar(Integer n1, Integer n2) {
		Integer resta = n1 - n2;
		return resta;
	}

	public static Integer getMult(Integer n1, Integer n2) {
		Integer mult = n1 * n2;
		return mult;
	}

	public static Integer getDiv(Integer n1, Integer n2) {
		Integer div = n1 / n2;
		return div;
	}

	public static Integer getCalcular(String oper, Integer n1, Integer n2) {

		if (oper.equals(SUMAR)) {
			return getSumar(n1, n2);
		} else if (oper.equals(RESTAR)) {
			return getRestar(n1, n2);
		} else if (oper.equals(MULTIPLICAR)) {
			return getMult(n1, n2);
		} else if (oper.equals(DIVIDIR)) {
			return getDiv(n1, n2);
		}
		return 0;
	}

}
