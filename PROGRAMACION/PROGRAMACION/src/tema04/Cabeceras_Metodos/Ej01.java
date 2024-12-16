package tema04.Cabeceras_Metodos;

public class Ej01 {

	public static void main(String[] args) {
		Integer n1 = 5; 
		Integer n2 = 25; 
		Integer suma = sumadenumeros(n1,n2);
		System.out.println(suma);
	}
	
	public static Integer sumadenumeros(Integer n1,Integer n2) {
	Integer suma=n1+n2;
	return suma;	
	}

}
