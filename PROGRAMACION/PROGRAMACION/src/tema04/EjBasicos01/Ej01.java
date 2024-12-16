package tema04.EjBasicos01;

public class Ej01 {

	public static void main(String[] args) {
		String cad1 = " Frase aleatoria con espacios. ";
		String resultado = getMayuscula(cad1);
		System.out.println(resultado);
	}

	public static String getMayuscula(String cad) {
		return cad.toUpperCase().trim();
	}

}
