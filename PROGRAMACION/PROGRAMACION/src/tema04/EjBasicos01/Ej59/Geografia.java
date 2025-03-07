package tema04.EjBasicos01.Ej59;

import java.util.HashMap;
import java.util.Map;

public class Geografia {
	
	private Map<String,String> paises;
	

	public Geografia() { // en los mapas dentro del constructor debo meter los hashMap como las listas
		super();
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
	public Boolean agragarPais(String pais, String cap) { // key/ valor
		pais = pais.toUpperCase(); // para que todos los paises esten en mayus
		String may = cap.substring(0,1).toUpperCase();
		String resto = may+cap.substring(1,cap.length()); // para saber la longitud de la palabra cap.length()
		
		if(this.paises.containsKey(pais)) { // .containsKey(pais) actua como un for, busca en el mapa el parametro por el que pregunto
			this.paises.put(pais, resto);
			return true;
		}
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
	}
	/*3. imprimirPaises: imprime el mapa de la siguiente manera: PAIS: “país” – CAPITAL: “capital” (uno en cada línea)*/
	public void imprimirPaises() {
		for (Map.Entry<String, String> entry : paises.entrySet()) {	
			
			System.out.println("PAIS: " + entry.getKey() + "– CAPITAL: " + entry.getValue());
		}
	}
	
	/*4. eliminarPais: Recibe un país y borra la entrada del mapa de dicho país si existe. OJO: el país puede que 
	 * lo recibas en minúsculas.*/
	
	
	/*5. calcularLongitudMediaPaises. Devuelve la media del número de caracteres que tiene el nombre de los países.Es 
decir, la suma total de caracteres de todos los nombres de los países entre la cantidad. Si no tenemos países, debe devolver 0.*/
	
	/*6. eliminarPaisConCapitalLetra: Recibe una letra, y elimina del mapa la entrada donde la capital comience por letra 
	 * especificada. Eliminará sólo la primera ocurrencia del mapa que coincida*/

}
