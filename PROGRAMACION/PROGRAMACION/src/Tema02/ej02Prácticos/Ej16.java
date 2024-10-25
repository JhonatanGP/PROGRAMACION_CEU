package Tema02.ej02Prácticos;

public class Ej16 {

	public static void main(String[] args) {
		Integer r = 0;
		Integer cont = 0;
		for(int i = 0; i < 10000; i++) {
			cont++ ;
			 r = r + cont;
		}
		System.out.println("El resultado es " + r + ".");

	}

}
