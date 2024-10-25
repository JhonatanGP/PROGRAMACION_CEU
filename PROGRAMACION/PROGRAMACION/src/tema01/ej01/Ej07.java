package tema01.ej01;

import java.util.Scanner;

public class Ej07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Indique su altura por favor:");
		Float alt = sc.nextFloat();
		System.out.println("Ahora indique su peso por favor:");
		Float peso = sc.nextFloat();
		Float IMC = peso/(alt*alt);
		System.out.println("Su IMC es de " + IMC + ".");
		
		sc.close();
		
	}

}
