package tema04.EjBasicos01.Ej53;

import java.math.BigDecimal;

public class App {

	public static void main(String[] args) {

		//1 Crea una hucha. Debe imprimir 0,00 €
		Hucha hucha = new Hucha();
		System.out.println(hucha);

		//2 Mete 100 euros. Debe imprimir 100,00 €
		BigDecimal cien = new BigDecimal(100);
		hucha.meterDinero(cien);
		System.out.println(hucha);

		//3 Mete 50,501 euros. Debe imprimir 150,50 €
		hucha.meterDinero(new BigDecimal(50.501));
		System.out.println(hucha);

		//4 Saca 20,5 euros. Debe imprimir 130,00 €
		BigDecimal retirado = hucha.sacarDinero(new BigDecimal(20.5));
		System.out.println(hucha);

		//5 Intenta sacar 200 €. Debe imprimir 0,00 €
		hucha.sacarDinero(new BigDecimal(200));
		System.out.println(hucha);

		//6 Vuelve a meter en la hucha el importe que habías sacado. Debe imprimir 130,00€
		hucha.meterDinero(retirado);
		System.out.println(hucha);

		//7 Llama a contarDinero(). Lo que devuelva, mételo en la hucha. Debe imprimir 260,00 €
		hucha.meterDinero(hucha.contarDinero());
		System.out.println(hucha);

		//8 Llama a romperHucha(). Lo que devuelva, mételo en la hucha de nuevo
		BigDecimal roto = hucha.romperHucha();
		hucha.meterDinero(roto);
		System.out.println(hucha);
	}

}
