package tema04.EjBasicos01.Ej08;

public class Ej08 {

	public static void main(String[] args) {
		Integer result1 = Calculadora1.getCalcular(Calculadora1.SUMAR, 8, 4);
		Integer result2 = Calculadora1.getCalcular(Calculadora1.RESTAR, 8, 4);
		Integer result3 = Calculadora1.getCalcular(Calculadora1.MULTIPLICAR, 8, 4);
		Integer result4 = Calculadora1.getCalcular(Calculadora1.DIVIDIR, 8, 4);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
	}

}
