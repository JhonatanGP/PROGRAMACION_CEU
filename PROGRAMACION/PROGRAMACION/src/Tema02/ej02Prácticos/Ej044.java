package Tema02.ej02Prácticos;

import java.util.Scanner;

public class Ej044 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Integer num = 1;
		Integer suma = 0;

		while (num != 0) {
			System.out.println("Dame un número");
			num = sc.nextInt();
			suma = suma + num;
		}
		System.out.print("Resultado es:" + suma + ".");

		sc.close();

	}

}
