package tema04.EjBasicos01.Ej37;

import java.util.ArrayList;
import java.util.List;

public class ColaCadenas {
	//1 ATRIBUTOS
	private List<String> cola;
	
	// CONSTRUCTOR
	public ColaCadenas() {
		cola = new ArrayList<>();	
	}	
	//2 GET AND SET
	public List<String> getCola() {
		return cola;
	}
	public void setCola(List<String> cola) {
		this.cola = cola;
	}
	//3 METODOS 
	//añadirCadena():recibe una cadena y no devuelve nada. Se tendrá que añadir esa cadena a la cola de espera. 
	public void añadirCadena(String cad) {
		cola.add(cad);
	}
		// sacarCadena(): no recibe nada y devuelve una cadena. Tendrá que devolver la cadena que hace más tiempo que se añadió.
	public String  sacarCadena() {
		if(cola.isEmpty()) { // si hacemos get(0) y esta vacia da error
			return null;
		}
		String cadena = cola.get(0);
		cola.remove(0);
		return cadena; // o return cola.remove
	}
	// getTamaño(): no recibe nada y devuelve un entero con todos los elementos que hay en la cola
	public Integer getTamaño() {
		int num = cola.size();
		return num;
	}
	// - toString(): debe imprimir el contenido de la cola 

	@Override
	public String toString() {
		return  cola.toString();
	}
	
	

}
