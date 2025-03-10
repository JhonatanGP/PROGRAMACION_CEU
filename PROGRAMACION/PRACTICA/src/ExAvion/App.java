package ExAvion;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String comp;
		do {
			System.out.println("Ingrese el nombre de la compañía:");
			comp = sc.nextLine().toUpperCase().trim();
			if (comp.isBlank() || comp.isEmpty()) {
				System.out.println("ERROR");
			}
		} while (comp.isBlank() || comp.isEmpty());

		Avion avion = new Avion(comp);
		System.out.println(comp);

		avion.setFechaFab(LocalDate.of(2015, 11, 23));
		Normal aN1 = new Normal(15, "a");
		aN1.setOcupado(true);
		Normal aN2 = new Normal(15, "b");
		Primera aP1 = new Primera(1, "a");

		avion.agregarAsiento(aN1);
		avion.agregarAsiento(aN2);
		avion.agregarAsiento(aP1);

		BigDecimal precioB = BigDecimal.ZERO;
		do {
			System.out.println("Escribe el precio base de los asientos:");
			precioB = sc.nextBigDecimal();
			if(precioB.compareTo(new BigDecimal(100)) <= 0) {
				System.err.println("Debe ser mayor a 100");
			}
		} while (precioB.compareTo(new BigDecimal(100)) <= 0);
		avion.establecerPrecioBaseAsiento(precioB);
		System.out.println("Avión: " + avion.toString());
		System.out.println("Años de antiguedad del avión:" + avion.getAntiguedad());
		System.out.println("Cantidad de asientos ocupados: " + avion.getCantidadAsientosOcupados());
		System.out.println("Lista de asientos libres:" + avion.getListaAsientoLibres());
		System.out.println("Precio medio de venta: " + avion.getPrecioMedioVenta() + "€");
		System.out.println("Asiento Libre más barato: " + avion.getAsientoLibreMasBarato());
		System.out.println("Borramos asientos de la fila 15.");
		avion.eliminarAsientoFila(15);
		System.out.println("Asiento Libre más barato: " + avion.getAsientoLibreMasBarato());

		
	}

}
