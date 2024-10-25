package Tema02.ej04Avanzado;

import java.util.Scanner;

public class Ej01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un texto:");
		String t = sc.nextLine();
		Integer l = t.length();
		
		String t1 = t.replaceAll(t, t);
		
		String tx = t.replaceAll(" ", "");
		System.out.println(tx);
		
		
		
	}

}
