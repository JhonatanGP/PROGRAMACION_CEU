package tema04.EjBasicos01.Ej56;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Map<Integer, Integer> mapa = new HashMap<>();
		Integer numero;
		Integer cont = 0;

		do {
			System.out.println("Escribe un número: ");
			numero = scanner.nextInt();
			if(!numero.equals(0)) {
				cont ++;
				if(mapa.containsKey(numero)) {
					mapa.put(numero, mapa.get(numero)+1);
				}
				else {
					mapa.put(numero,1);
				}
			}
		}
		while(!numero.equals(0));
		
		System.out.println("Total numeros indicados:" + cont);
		System.out.println("Distribución:");
		
		Set<Entry<Integer,Integer>> pares = mapa.entrySet(); 
	   	for(Entry<Integer,Integer> par : pares){
	   		String terminacion = "veces";
	   		if (par.getValue().equals(1)) {
				terminacion = "vez";
			}
			System.out.println("\t> Número " + par.getKey() + ": " + par.getValue() + " " + terminacion);
		}
		
		
	}
}
