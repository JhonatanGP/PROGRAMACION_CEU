package tema03.ejpracticos;

import java.util.Scanner;

public class Ej09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Boolean v = true;
		Integer s = 0;
		Integer n1 = 0;
		Integer n2 = 1;
		
		do {
			System.out.print("Escriba un número: ");
			Integer n = sc.nextInt();
			if(n <= 2) {
				System.out.println("Número no válido. Debe ser mayor o igual que 2.");
				v = true;
			}else {
				System.out.print("La serie de Fibonacci de " + n + " es: " + n1 + "," + n2 + ",");
				for (int i = 1; i <= n; i++) {
					s = n1 + n2;
					if(i == n) {
						System.out.println(s);
						break;
					}
					System.out.print(s + "," );
					n1 = n2;
					n2 = s;
				} v = false;
			}
			
		}while (v);

		

		sc.close();
	}
}