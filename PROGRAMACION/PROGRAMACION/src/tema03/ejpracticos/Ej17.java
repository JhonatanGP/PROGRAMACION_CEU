package tema03.ejpracticos;

public class Ej17 {

	public static void main(String[] args) {
		Double sumar = 0d;
		Double[] lista = new Double[] { 5.4, 3.1, 9.0, 4.7 };

		for (Double double1 : lista) {
			System.out.print(double1 + "\t");
		}
		System.out.println();
		for (Double double2 : lista) {
			sumar += double2;
		}

		System.out.println("En total suma: " + sumar);
	}
}