package tema04;

public class Apuntes {

	public static void main(String[] args) {
		/*public static void main(String[] args) {
					  tipo q  nombreF (tipo1 nombre1,tipo2 nombre2) 
					 devuelve		
		}*/
		
		
		/*cuando se pone return no hay que poner void, hay que poner el tipo
		que devuelve
		
		- Cuando te dice imprimir es un void: imprime un saludo y yasta, a no 
		ser que te pida algo más.
		
		- Para crearme un objeto, primero necesito un constructor desde el main. el mismo que el de la clase
		
		public Rotulador(){
		}
		public Rotulador(String color, String marca){
		
		}
		- Luego en la otra clase creo los get and set(se utilizan en el main, para cambiar datos y guardarlos)
		
					Rotulador negro = new Rotulador()

					Rotulador negro = new Rotulador("azul", "marca")

		
		== si es el mismo objeto
		equals si los atributos son los mismos.
		
		Si se pone Integer se pone equals, si se pone int ==.
		
		
		LocalDate->  fecha sin hora.
		LocalTime-> hora sin fecha.
		LocalDateTime-> fecha y hora.
		
		conjunto: 1 En el no se pueden repetir ningun dato. 
				  2 No tiene orden.	
		Set<String> conj1 = new HashSet<>();
		
		-- Creamos un conj usando la clase LinkedHashSet
		 Set<String> conj2 = new LinkedHashSet<>();
		 
		-- Para añadir o borrar algo al conjunto es igual que en las listas
		-- Obtener elementos en un set: Como no hay posiciones si meto algo no necesariamente va estar el ultimo
		-- Recorrer: Solo con FOREACH, ni for normal, ni while, do while ...

		BigDecimal se compara con compareTo
		add es el que suma en BigDecimal
		
***************************** TERCER TRIMESTRE *************************************************************** 
-- MAPAS
	
	Para recorrer un map, encontrar KEY: this.mapa.containsKey(key);
				
	Mapa guarda de dos en dos (clave y valor)
	Clave:Es única.(Es lo más importante).
	Valor: Si puede tener dos valores iguales.
	Si usa una clave que existe la sobre escribe (No pueden haber dos claves iguales).
	No hay orden.
 
	Map <String,Integer> mapa1 = new HashMap<>();
  
	mapa1.put("CLAVE",1234567);
 
	mapa1.get("CLAVE");
 
	mapa1.remove("CLAVE");
 
	Metodos:
	isEmpty();
	clear();
	containsKey(); Si la clave esta --> Devuelve Boolean (Mira el equals)
	containsValue(); Si el valor esta --> Devuelve Boolean (Mira el equals)
 
	Borrar de forma alternativa: mapa.put("Clave", null);
	Como esta nulo seguira existiendo pero no estará asociada a ningun valor.
  
  
	RECORRER MAPAS:
 
	1) Set<String> claves = mapa.keySet();
		for(String key: pares){
		clave = key
		Valor = mapa.get(key);
		}
 
 
	Collection<Alumno> values = mapa.values(); (Recorrer para traer los valores, si te pide clave no se puede usar)
   	for(Alumno alumno: values){
		syso(alumno);
	}
 
  	Collection<Alumno> values = mapa.values();
  	List<Alumno> lista = new ArrayList<>(values);
   	for(Alumno alumno: lista){
		syso(alumno);
	}
 
 
	Set<Entry<String,Alumno>> pares = mapa.entrySet(); 
   	for(Entry<String,Alumno> par : pares){
		syso("Clave:" + par.getKey());
		syso("Valor:" + par.getValue());
	}
	
	****************************** Tema 5 - Excepciones *******************************
		
		
		
		
	*/
		
	}

}
