package tema01.ej01;

import java.util.Scanner;

public class Ej04 {
	public static final Integer ANO = 2024;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Indique su año de nacimiento:");
		Integer anyo = sc.nextInt();
		System.out.println("Su edad es " + (ANO - anyo));
		
		sc.close();

	}

}
