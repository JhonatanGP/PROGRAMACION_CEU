package tema04.EjBasicos01.Ej53;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Hucha {
	//01
	private BigDecimal dinero = BigDecimal.ZERO;
	
	//02
	public Hucha() {
		super();
		this.dinero = BigDecimal.ZERO.setScale(2, RoundingMode.HALF_DOWN);

	}
	//03
	public BigDecimal getDinero() {
		return dinero;
	}

	public void setDinero(BigDecimal dinero) {
		this.dinero = dinero;
	}
	/* meterDinero() que recibe un BigDecimal con el importe a introducir y nos devuelve
	otro BigDecimal con el importe que quedará en la Hucha*/
	public BigDecimal meterDinero(BigDecimal importe) {
		this.dinero = importe.add(dinero);
		return importe;
	}
	/* sacarDinero() que recibe un BigDecimal con el importe a sacar y nos devuelve otro BigDecimal con
	 el importe finalmente sacado. Si se intenta sacar más dinero del que hay, sólo se sacará lo que haya.*/
	public BigDecimal sacarDinero(BigDecimal importe) {
		BigDecimal cero = BigDecimal.ZERO;
		if(importe == null) {
			return cero;
		}
		if (importe.compareTo(dinero) > 0) {
			BigDecimal sacar = dinero;
			dinero = BigDecimal.ZERO;
			return sacar;

		} else {
			BigDecimal resto = dinero.subtract(importe);
			return dinero = resto;
			}
	}
	/*contarDinero() que nos devuelve un BigDecimal con el importe que tenemos en la Hucha.*/
	public BigDecimal contarDinero() {
		if (dinero == null) {
			return BigDecimal.ZERO;
		}
		return dinero;
	}
	/*romperHucha() saca todo el dinero de la Hucha y nos devuelve un BigDecimal con todo lo sacado.*/
	public BigDecimal romperHucha() {
		BigDecimal sacar = dinero;
		dinero = BigDecimal.ZERO;
		return sacar;
	}	
	//04
	@Override
	public String toString() {
		DecimalFormat formato = new DecimalFormat("#,##0.00€");
		return "Hucha: " + formato.format(dinero);
	}	
}
