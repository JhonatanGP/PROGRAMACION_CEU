package Tema02.ej03PrácticosRepaso;

import java.util.Scanner;

public class Ej18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escriba una palabra y vea como se ve al revés:");
		String p = sc.nextLine();
				
		for(int i = p.length()-1; i>=0 ; i--) {
			System.out.print(p.charAt(i)); // charAt: devuelve la letra que esta en esa posición
		}
					
		sc.close();
	}
}
