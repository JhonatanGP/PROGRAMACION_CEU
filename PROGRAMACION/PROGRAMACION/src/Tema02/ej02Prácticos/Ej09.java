package Tema02.ej02Prácticos;

import java.util.Scanner;

public class Ej09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escribe su nombre completo(No se puede nombre compuestos)");
		String nombre = scanner.nextLine();
		
		//Calculamos en que posicion estan los  dos espacios || Indexof para encontrar el primer espacio en blanco
		Integer primerEspacio = nombre.indexOf(" "); 
		//Dividimos la cad hasta el primer espacio. substring va desde 
		String primerNombre = nombre.substring(0, primerEspacio); 
		System.out.println("Nombre: " + primerNombre);
		
		Integer segundoEspacio = nombre.indexOf(" ", primerEspacio+1);  
		String primerApellido = nombre.substring(primerEspacio, segundoEspacio); 
		System.out.println("Primer apellido:" + primerApellido);
		Integer ultimoEspacio = nombre.length(); 
		String segundoApellido = nombre.substring(segundoEspacio, ultimoEspacio); 
		System.out.println("Segundo Apellido: " + segundoApellido);
		
		scanner.close();
	}


}