package tema03.ejRepaso;

public class Ej02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] lista = new Integer[] { 7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10 };
		Double suma = 0.0;
		Integer cont = 0;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] >= 5) {
				suma = lista[i] + suma;
				cont++;
			}
		}
		System.out.print("Nota media de aprobados: " + suma / cont);
		// si pongo lista[i] me imprime las notas y si pongo cont me imprime el numero de suspensos
	}

}