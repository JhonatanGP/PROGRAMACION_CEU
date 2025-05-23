package tema04.EjBasicos01.Ej59;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Geografia {
	
	private Map<String,String> paises;
	

	public Geografia() { // en los mapas dentro del constructor debo meter los hashMap como las listas
		this.paises = new HashMap<>();
	}
	          // key / valor
	public Map<String, String> getPaises() {
		return paises;
	}

	public void setPaises(Map<String, String> paises) {
		this.paises = paises;
	}
	
/*1. agregarPais. Recibe un país y su capital y lo añade al mapa. El país lo guardará siempre en mayúsculas y la 
 * capital la guardará con la primera letra sólo en mayúsculas. Si el país ya está en el mapa, actualizará la 
 * nueva capital. Devolverá true si el país estaba en el mapa y false si no estaba. */
	public Boolean agragarPais(String pais, String capital) { // key/ valor
		pais = pais.toUpperCase(); // para que todos los paises esten en mayus
		String may = capital.substring(0,1).toUpperCase(); //Para que la Primera letra de la capital sea mayus.
		String resto = may + capital.substring(1,capital.length()); // para saber la longitud de la palabra cap.length()
		
		if(this.paises.containsKey(pais)) { //actua como un for, busca en el mapa el parametro por el que pregunto
			this.paises.put(pais, resto);
			return true;
		}							  // Como si hubiera un else, pero no lo pongo porque falla.
		this.paises.put(pais, resto); // aqui tmb, porque como no está lo agrego.
		return false;
	}
/*2. obtenerCapital. Recibe un país y devuelve la capital de dicho país. En caso de que no exista el pais en el 
 * mapa, devolverá la cadena vacía. OJO: el país puede que lo recibas en minúsculas. */
	public String obtenerCapital(String pais) {
		pais = pais.toUpperCase();
        if (this.paises.containsKey(pais)) {
           return this.paises.get(pais);
		}		
		return ""; // cad vacia
	//Otra forma: 
	}
/*3. imprimirPaises: imprime el mapa de la siguiente manera: PAIS: “país” – CAPITAL: “capital” (uno en cada línea)*/
	public void imprimirPaises() {
		for (Map.Entry<String, String> entry : paises.entrySet()) {	
			
			System.out.println("PAÍS: " + entry.getKey() + "– CAPITAL: " + entry.getValue());
		}
	}
	
/*4. eliminarPais: Recibe un país y borra la entrada del mapa de dicho país si existe. OJO: el país puede que 
 * lo recibas en minúsculas.*/
	public void eliminarPais(String pais) { 
		Iterator<Map.Entry<String, String>> borrar = paises.entrySet().iterator();//Es como for, lo recorre y borra si existe
		while (borrar.hasNext()) {
	        Map.Entry<String, String> entry = borrar.next();
	        
	        if(this.paises.containsKey(pais)) { //borra la entrada del mapa de dicho país si existe
	        	borrar.remove();
	        	break;
	        }else {
	        	System.out.println("El pais no existe.");
	        }
		} 
	//Forma más eficiente: paises.remove(pais.toUpperCase()); es de 10.
	}
	
/*5. calcularLongitudMediaPaises. Devuelve la media del número de caracteres que tiene el nombre de los países.Es decir,  
la suma total de caracteres de todos los nombres de los países entre la cantidad. Si no tenemos países, debe devolver 0.*/
	public Double calcularLongitudMediaPaises() {
		Double numeros = 0d;
		if (this.paises.isEmpty() || this.paises.size() <= 0) {
			return numeros;
		}
		for (Map.Entry<String, String> entry : paises.entrySet()) {
			numeros += entry.getKey().length();
		}
		return numeros/this.paises.size();
	}
	
/*6. eliminarPaisConCapitalLetra: Recibe una letra, y elimina del mapa la entrada donde la capital comience por letra 
* especificada. Eliminará sólo la primera ocurrencia del mapa que coincida*/
	public void eliminarPaisConCapitalLetra(String letra) {
		Set<Entry<String,String>> pares = paises.entrySet(); 
		Iterator<Map.Entry<String, String>> borrar = paises.entrySet().iterator();
		while (borrar.hasNext()) {
	        
	        if(borrar.next().getValue().substring(0,1).equalsIgnoreCase(letra)) { 
	        	borrar.remove();
	        	break;
	        }else {
	        	System.out.println("La capital no existe.");
	        }
	     }
	}
	
/*7. numeroPaisesConCapitalLetra: Recibe una letra y devuelve el número de países cuya capital comience con la 
 * letra especificada. */
	public Integer numeroPaisesConCapitalLetra(String letra) {
		Set<Entry<String,String>> pares = paises.entrySet();
		Integer cont = 0;
	   	for(Entry<String,String> par : pares){
	   		if(par.getValue().substring(0,1).equalsIgnoreCase(letra)) {
	   			cont++;
	   		}
		}
		return cont;
	}
	
/*8. imprimirNumeroPaisesLetra: Recibe una letra e imprimirá las entradas del mapa cuya capital empiece por la letra
 * especificada. Si no hay ninguna, imprimir: “Ninguna capital del mapa comienza por (”letra”). Suponemos que la letra
 *  recibida no está vacía ni es null.*/
	public void imprimirNumeroPaisesLetra(String letra) {
		Set<Entry<String,String>> pares = paises.entrySet();
	   	for(Entry<String,String> par : pares){
	   		if(par.getValue().substring(0,1).equalsIgnoreCase(letra)) {
	   			System.out.println("La letra es: " + par.getKey());
	   		}
	   		else {
	   			System.out.println("Ninguna capital del mapa comienza por " + letra);
	   		}
		}
	}
	
/*9. mismaLetra: No recibe nada. Imprime las entradas del mapa cuyo nombre y su capital comiencen por la misma letra. 
 * Si no hay ninguna, imprimirá: no hay ningún país y capital que comiencen por la misma letra. */
	public void mismaLetra() {
		
	
}

}










