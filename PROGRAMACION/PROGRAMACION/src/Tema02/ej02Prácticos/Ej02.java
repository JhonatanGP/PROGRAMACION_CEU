package Tema02.ej02Prácticos;


import java.util.Scanner;

public class Ej02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indique su altura por favor:");
		Float alt = sc.nextFloat();
		System.out.println("Ahora indique su peso por favor:");
		Float peso = sc.nextFloat();
		Float IMC = peso/(alt*alt);
		System.out.println("Su IMC es de " + IMC + ".");
		
		if (IMC >= 0  && IMC < 18.5 ) {
			System.out.println("Peso inferior al normal");
		}
		else if (IMC >= 18.5  && IMC <= 24.9 ) {
			System.out.println("Peso normal");
		}
		else if (IMC >= 25.0  && IMC <= 29.9 ) {
			System.out.println("Peso normal");
		}
		else if (IMC >= 30.0 ) {
			System.out.println("Obesidad.");
		}
		
		else {
			System.out.println("Datos erróneos.");
		}
		
		sc.close();
		
	}

}
