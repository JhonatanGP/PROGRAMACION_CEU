package tema03.ejpracticos;

import java.util.Scanner;

public class Ej18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe una palabra: ");
		String p = sc.nextLine();
		
		String[] s = p.split("");
		
		for (String string : s) {
			System.out.print(string + "  ");
		}

	}

}