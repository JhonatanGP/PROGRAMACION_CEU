package ej02Prácticos;

import java.util.Scanner;

public class Ej04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Integer num = 0;
		Integer suma = 0;
		
		do {
			System.out.println("Averigue la suma de números. Para finalizar escriba 0.");
			num = sc.nextInt();
			suma = suma + num;//suma += num;
		}
		while(num != 0);
					
		System.out.println("La suma de todos los números es " + suma + ".");
		
		sc.close();
		
	}

}
