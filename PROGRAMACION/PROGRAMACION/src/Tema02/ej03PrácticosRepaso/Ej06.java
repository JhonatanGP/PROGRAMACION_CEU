package Tema02.ej03PrácticosRepaso;

public class Ej06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer suma = 0;

		for (int i = 3; i <= 30; i += 3) {
			suma += i;
			if (i < 30) {
				System.out.print(i + " + ");
			} else {
				System.out.print(i + " = ");
			}
		}
		System.out.print(suma);

	}

}
