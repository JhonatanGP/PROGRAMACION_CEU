package Tema02.ej02Prácticos;

public class Ej055While {

	public static void main(String[] args) {

		Integer suma = 0;
		Integer cont = 1;
		
		while(cont <= 10000) {
			suma += cont;
			cont++;
		}
					
		System.out.println("La suma de todos los números es " + suma + ".");
				
	}

}

