package app;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import modelo.Libreria;
import modelo.Libro;
import servicios.LibreriaService;
import servicios.LibroException;

public class App {

	public static Libreria solicitarLibreria() {
		Libreria libreria = new Libreria();
		libreria.setNombre("Páginas desiertas");
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Escribe nombre del Libro con este formato\n[ISBN;TITULO;AUTOR;PRECIO]" + "");
			String nombreLibro = scanner.nextLine();

			if (nombreLibro.equalsIgnoreCase("FIN")) {
				scanner.close();
				break;
			}
			String[] lista = nombreLibro.split(";");
			Libro libro = new Libro();
			libro.setIsbn(lista[0]);
			libro.setTitulo(lista[1]);
			libro.setAutor(lista[2]);
			libro.setPrecio(new BigDecimal(lista[3]));
			Map<String, Libro> mapa = new HashMap<>();
			mapa.put(libro.getIsbn(), libro);
			libreria.setMapa(mapa);

		}
		return libreria;
	}

	public static void main(String[] args) throws SQLException, LibroException {
		// TODO Auto-generated method stub
		Libreria libreria = solicitarLibreria();
		Map<String, Libro> mapa = libreria.getMapa();
		for (Map.Entry<String, Libro> entry : mapa.entrySet()) {

			try {
				if (entry.getValue().getPrecio().compareTo(new BigDecimal(10)) < 0) {
					LibreriaService ls = new LibreriaService();
					ls.insertarLibroNuevo(entry.getValue());
				}
			} catch (SQLException e) {
				System.out.println("Error insertando Libro");
			}
		}
		System.out.println("TODO PERFECTO:");
		System.out.println(libreria.getPrecioMedio());
		System.out.println(libreria.getTasacionCompleta());
	}

}
