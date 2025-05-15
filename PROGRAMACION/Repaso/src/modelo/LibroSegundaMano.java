package modelo;

import java.math.BigDecimal;

public class LibroSegundaMano extends Libro{
//01
	private Integer antigüedad;

//02
public LibroSegundaMano() {

}

//3
public Integer getAntigüedad() {
	return antigüedad;
}

public void setAntigüedad(Integer antigüedad) {
	this.antigüedad = antigüedad;
}

//04
@Override
public String toString() {
	return "LibroSegundaMano [antigüedad=" + antigüedad + "]";
}
@Override
public BigDecimal getPrecio() {
	return super.getPrecio().subtract(super.getPrecio().multiply(new BigDecimal (0.5)));
}

	

}
