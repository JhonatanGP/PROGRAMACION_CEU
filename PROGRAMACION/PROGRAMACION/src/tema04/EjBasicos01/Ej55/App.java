package tema04.EjBasicos01.Ej55;

import java.math.BigDecimal;

public class App {

	public static void main(String[] args) {

		Evaluacion ev1 = new Evaluacion();

		ev1.addNota("123456789J", new BigDecimal("10.0"));
		ev1.addNota("123456789H", new BigDecimal("6.45"));
		ev1.addNota("123456789A", new BigDecimal("3.8"));
		ev1.addNota("123456789B", new BigDecimal("2.7"));
		ev1.addNota("123456789C", new BigDecimal("7.9"));
		System.out.println(ev1.toString());
	}

}
