package tema03.ejRepaso;

public class Ej05 {

	public static void main(String[] args) {
		Integer[] lista = new Integer[] { 7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10 };

		for (int i = 0; i < lista.length; i++) {
			if (lista[i] < 5) {
				lista[i] = 5;
			}
		}
		for (Integer notas : lista) {
			System.out.print(notas + " ");
		}

	}

}