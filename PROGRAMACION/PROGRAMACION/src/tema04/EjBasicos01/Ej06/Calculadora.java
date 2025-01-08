package tema04.EjBasicos01.Ej06;

public class Calculadora {

	public static Integer getSumar(Integer n1, Integer n2) {
		Integer suma = n1 + n2;
		return suma;
	}
	
	public static Integer getRestar(Integer n1, Integer n2) {
		Integer resta = n1-n2;
		return resta;
	}
	public static Integer getMult(Integer n1, Integer n2) {
		Integer mult = n1 * n2;
		return mult;
	}
	public static Integer getDiv(Integer n1, Integer n2) {
		if(n2 == 0){
			return 0;
		}else {
			Integer div = n1 / n2;
			return div;	
		}
		
	}

}
