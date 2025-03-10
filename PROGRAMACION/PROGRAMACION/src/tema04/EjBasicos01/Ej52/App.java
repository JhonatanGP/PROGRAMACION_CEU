package tema04.EjBasicos01.Ej52;

import java.math.BigDecimal;

public class App {

	public static void main(String[] args) {
		// 1
		Cliente c1 = new Cliente();
		c1.setDni("12345678K");
		c1.setNombre("Blas");

		// 2
		Carrito car = new Carrito(c1);
		System.out.println(c1);
		// 3
		Ropa poncho = new Ropa();
		poncho.setColor("Azul");
		poncho.setDescripcion("Poncho");
		poncho.setTalla("XL");
		poncho.setPrecio(new BigDecimal(20.0)); //"20"

		// 4
		car.addArticulo(poncho);
		car.addArticulo(poncho);
		System.out.println(car);
		// 5
		Libro nietzsche = new Libro();
		nietzsche.setAutor("Nietzsche");
		nietzsche.setDescripcion("As habl Zaratustra");
		nietzsche.setPrecio(new BigDecimal(15.0)); // "15"
		// 6
		car.addArticulo(nietzsche);
		System.out.println(car);
		// 7
		car.borrarArticulo(1);
		System.out.println(car);
		// 8
		System.out.println(car.getPrecioMedio());
		// 9
		car.vaciarCesta();
		System.out.println(car);
		// 10
		System.out.println(car.getPrecioMedio());

	}

}
