package Tema02.ej02Prácticos;

public class Ej05 {

	public static void main(String[] args) {

		Integer num = 0;
		Integer suma = 0;
		
		do {
			System.out.print(num + " + ");
			num ++;
			suma = suma + num;//suma += num;
		}
		while(num < 10000);
					
		System.out.println(num + ". " + "La suma de todos los números es " + suma + ".");
				
	}

}

