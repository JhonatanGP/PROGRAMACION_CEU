package tema01.ej01Repaso;

import java.util.Scanner;

public class ej04 {
	
	public static final Float PI = 3.1416F;

	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuál es su número favorito?");
		Integer num = sc.nextInt();
		
		sc.nextLine();
		System.out.println("¿Cuál es su ciudad  favorita?");
		String ciudad = sc.nextLine();
		
		System.out.println("Su número favorito es " + num + " y su ciudad favorita es " + ciudad + ".");
	 	
	 	sc.close();

				
	}

}
