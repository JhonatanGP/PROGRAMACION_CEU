package Tema02.ej02Prácticos;

public class Ej20 {

	public static void main(String[] args) {
		Integer cont = 0;
		for(int i = 1; i <= 9; i++) { //este es el que baja FILAS
			 System.out.println();
			 
			for(int j = 1; j <= i; j++) { // este es el que va a la derecha COLUMNAS
				System.out.print(" * ");
			}
		}
		for(int i = 8; i >= 1; i--) { //este es el que baja
			 System.out.println();
			 
			for(int j = i; j >= 1; j--) { // este es el que va a la derecha
				System.out.print(" * ");
			}
		}
		
	}

}
