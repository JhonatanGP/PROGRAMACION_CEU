package tema04.EjBasicos01.Ej38;

public class App {

	public static void main(String[] args) {
		// 1. Crea un objeto cola.
		PilaCadenas pila = new PilaCadenas();

		System.out.println(pila);
		// 2.Añade a la cola las palabras “primero” y “segundo” 
		pila.añadirCadena("primero");
		pila.añadirCadena("segundo");
		System.out.println(pila);

		// 3.Saca de la cola un elemento e imprímelo.
		String elemento = pila.sacarCadena();
		System.out.println(elemento);
		System.out.println(pila);

		// 4.Añade a la cola la palabra “tercero”
		pila.añadirCadena("tercero");
		System.out.println(pila);
		// 5.Saca todos los elementos que queden en la cola e imprímelos. 
		while (pila.getTamaño() > 0) {
			elemento = pila.sacarCadena();
			System.out.println(elemento);
		}
		System.out.println(pila);
		// 6.Añade a la pila la palabra cuarto.
		pila.añadirCadena("cuarto");
		System.out.println(pila);

	}

}
