package tema03.ejpracticos;

public class Ej01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] listaNum = new Integer[30];
		for (int i = 1; i <= listaNum.length; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
