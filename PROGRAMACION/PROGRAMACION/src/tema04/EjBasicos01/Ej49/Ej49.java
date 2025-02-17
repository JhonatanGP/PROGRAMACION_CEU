package tema04.EjBasicos01.Ej49;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ej49 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Set<String> lista = new HashSet<>();
		// FOR PARA PEDIR 5 CADENAS
		for (int i = 1; i <= 5; i++) {
			System.out.println("Escribe una cadena " + i);
			String cad = sc.nextLine();
			lista.add(cad);
		}
		System.out.println(lista);
		// 1 PONER TODAS EN MAYÚSCULAS
		System.err.println("eje 1");

		/*for (int i = 0; i < lista.size(); i++) { lista.set(i,
		 * lista.get(i).toUpperCase()); }*/
		Set<String> aux = new HashSet<>();
		for (String string : lista) {
			String cadMay = string.toUpperCase();
			aux.add(cadMay);
		}
		lista = aux;
		System.out.println(lista);

		// 2 COMPROBAR SI LA LISTA TIENE ALGUNA CADENA VACÍA
		System.err.println("eje 2");

		Boolean v = lista.contains(""); // if(lista.contains("")){
		if (v == true) { // System.err.println("CADENA VACÍA")
			System.err.println("CADENA VACÍA"); // }
		}

		// 3 BORRAR CADENAS INFERIOR A 6 CARACTERES
		System.err.println("eje 3");

		Iterator<String> iterador = lista.iterator();
		while (iterador.hasNext()) {
			String cadena = iterador.next();
			if (cadena.length() < 6) {
				iterador.remove();
			}
		}
		for (String string : lista) {
			System.out.println(string);
		}
		sc.close();
	}
}