package tema04.EjBasicos01.Ej51;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		List<BigDecimal> numeros = new ArrayList<>();

		System.out.println("Introduce 5 números en orden creciente:");

		for (int i = 1; i <= 5; i++) {
			System.out.println("Número " + i + ":");
			BigDecimal num = scanner.nextBigDecimal();

			if (!numeros.isEmpty()) {
				BigDecimal ult = scanner.nextBigDecimal();

			}else {
				
			}

		}

	}

}
