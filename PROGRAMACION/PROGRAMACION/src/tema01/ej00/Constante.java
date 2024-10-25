package tema01.ej00;

import java.util.Scanner;

public class Constante {
	
	public static final Integer MESES_DEL_ANO = 12;
	public static final String SALUDO = "Hola, ";
	
	public static void main(String[] args) {
		// Las constantes se deben declarar arriba, fuera del método arriba del todo. Son valores fijos.
		// Se escriben en MAYÚSCULAS
		Scanner scanner = new Scanner(System.in);
		Integer num1 = 32;
		Integer num2 = 44;
		System.out.println(SALUDO + "los meses del año son " + MESES_DEL_ANO + ".");
		System.out.println(12+23);
		System.out.println(num1 + num2);
	}

}
