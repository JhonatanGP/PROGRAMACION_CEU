package tema03;

import java.util.Scanner;

public class Ej12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe una dirección web:");
		String dir = sc.nextLine();
		String[] dir1 = dir.split("://");

		String p1 = dir1[0];
		String p2 = dir1[1];

		String[] dir2 = p2.split("\\.");
		// String p3 = dir2[0]; así no porque repitiria muchas veces lo mismo
		// String p4 = dir2[1]; mejor utilizo el for each
		System.out.println(p1);
		for (String x : dir2) {
			System.out.println(x);
		}
		sc.close();
	}
} 
