package tema01.ej01;

import java.util.Scanner;

public class Ej05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuánto te gustaría ganar al año?");
		Integer salario = sc.nextInt();
		Integer mensual = salario/12;
		System.out.println("Su sueldo mensual sería de " + mensual + " euros.");
		
		sc.close();
	}

}
