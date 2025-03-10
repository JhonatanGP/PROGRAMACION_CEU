package tema04.EjBasicos01.Ej09;

public class ArraysUtils {
	// Para imprimir algo se utiliza void(no pongo nada de string, integer...)
	public static void imprimirArray(String[] array) {

		for (String lista : array) {
			System.out.println(lista);
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	// EJ10
	public static String obtenerPalabra(String[] cad, Integer num) {
		return cad[num];
	}

	// Ej11
	public static int buscarPalabra(String[] a, String b) {
		for (int i = 0; i < a.length; i++) {
			if (b.equalsIgnoreCase(a[i])) {
				return i;
			}
		}

		System.out.println("No existe.");

		return -1;
	}
}