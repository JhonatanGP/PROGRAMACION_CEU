package tema03.ejRepaso;

public class Ej06 {

	public static void main(String[] args) {

		Integer[] lista = new Integer[] { 7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10 };

		for (int i = 0; i < lista.length; i++) {
			if (i % 2 == 0) {
				lista[i] = lista[i] * 2;
			}
		}
		for (Integer notas : lista) {
			System.out.print(notas + " ");
		}
	}
}