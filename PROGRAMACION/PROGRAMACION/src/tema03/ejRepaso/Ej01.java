package tema03.ejRepaso;

public class Ej01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] lista = new Integer[] { 7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10 };
		Integer cont = 0;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] < 5) {
				cont++;
			}
		}
		System.out.print("Total de alumnos suspensos: " + cont);// si pongo lista[i] me imprime las notas y si pongo cont me imprime el numero de suspensos

	}

}
