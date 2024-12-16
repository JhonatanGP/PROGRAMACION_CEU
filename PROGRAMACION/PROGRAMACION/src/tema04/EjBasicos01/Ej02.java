package tema04.EjBasicos01;

public class Ej02 {

	public static void main(String[] args) {
		String palabra = "  ESTO ESTÁ EN MAYÚSCULAS.   ";
		String resultado = getMinus(palabra);
		System.out.println(resultado);
	}
	public static String getMinus(String p) {
		return p.toLowerCase().trim();
	}

}
