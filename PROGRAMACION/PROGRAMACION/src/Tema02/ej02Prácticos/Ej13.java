package Tema02.ej02Prácticos;

import java.util.Scanner;

public class Ej13 {

	public static void main(String[] args) {
		
		/*
		Scanner sc = new Scanner(System.in); 
		System.out.println("Introduce un texto:");
		String text = sc.nextLine();
		Integer ini = 0;
		Integer longT = text.length();
		
		do {
			if (ini + 5 > longT) {
				System.out.println(text.substring(ini));
			}
			else System.out.println(text.substring(ini,ini + 5));{
			}
			ini += 5;
		}
		while (ini < longT);
		
		sc.close();
		*/
		
		// FORMA DE BELÉN
		  
	    Scanner sc = new Scanner(System.in); 
		System.out.println("Introduce un texto:");
		String text = sc.nextLine();
		
	    //Dividir el texto en trozos de tamaño 5 y mostrar cada trozo 
		Integer longText = text.length();
		Integer i = 0;
	    Integer fin;
	    
	    while (i < longText) {
	    	//Definimos el indice del trozo 
	    	fin = i + 5;
	    	//Si el indice final supera la longitud del texto , ajustar ..
	    	if (fin > longText) {
	    		fin = longText;
	    	}
	    	//Extraer y mostrar el trozo
	    	String trozo = text.substring(i,fin);
	    	System.out.println(trozo);
	    	
	    	//Avanzar al siguiente texto
	    	
	    }
	 
		
		
		
		
		
		
		
			
	}

}
