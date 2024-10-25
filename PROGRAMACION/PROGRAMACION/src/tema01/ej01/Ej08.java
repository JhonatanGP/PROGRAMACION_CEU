package tema01.ej01;

import java.util.Scanner;

public class Ej08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Indique un número de tipo String A");
		String a = sc.nextLine();
		
		System.out.println("Indique un número decimal de tipo Double B");
		Double b = sc.nextDouble();
		
		System.out.println("Indique un número entero de tipo Float C");
		Float c = sc.nextFloat();
		
		Long x1 = Long.parseLong(a);
		
		String x2 = b.toString();
		
		//Integer x3 = Integer.parseInt(x2);
		Integer x3 = b.intValue();
		
		Long x4 = c.longValue();
		
		System.out.println(x1 + x2 + x3 + x4);
		
		sc.close();

	}

}
