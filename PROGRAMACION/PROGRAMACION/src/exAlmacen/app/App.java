package exAlmacen.app;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Scanner;

import exAlmacen.modelo.Trastero;
import exAlmacen.servicios.TrasteroEstadoException;
import exAlmacen.servicios.TrasteroServiceException;
import exAlmacen.servicios.TrasterosService;

public class App {
		public static void main(String[] args) throws SQLException {
	        Scanner scanner = new Scanner(System.in);
	        TrasterosService trasteroService = new TrasterosService();
	        
	        try {
	            // 1. Solicitar código de trastero
	            String codigoTrastero = solicitarCodigoTrastero(scanner);
	            // 2. Crear trastero en BBDD
	            Trastero trastero = new Trastero(codigoTrastero, 10);
	            trasteroService.crearTrastero(trastero);
	            System.out.println("Trastero creado correctamente en la base de datos.");
	            // 3. Solicitar precio de alquiler
	            BigDecimal precioAlquiler = solicitarPrecioAlquiler(scanner);
	            // 4. Alquilar trastero y actualizar en BBDD
	            trastero.alquilar("12345678X", 30, precioAlquiler);
	            trasteroService.actualizarAlquiler(trastero);
	            System.out.println("Trastero alquilado correctamente.");
	        } catch (TrasteroEstadoException e) {
	            System.out.println("Error de estado del trastero: " + e.getMessage());
	        } catch (TrasteroServiceException e) {
	            System.out.println("Error en el servicio: " + e.getMessage());
	        } finally {
	            System.out.println("Gracias, que tengas un buen día");
	            scanner.close();
	        }
	    }

	    private static String solicitarCodigoTrastero(Scanner scanner) {
	        String codigo;
	        do {
	            System.out.println("Introduce el código del trastero (5-10 caracteres, empezando por A):");
	            codigo = scanner.nextLine().trim();
	            
	            if (codigo.length() < 5 || codigo.length() > 10) {
	                System.out.println("Error: El código debe tener entre 5 y 10 caracteres.");
	                continue;
	            }
	            
	            if (!codigo.startsWith("A")) {
	                System.out.println("Error: El código debe empezar por la letra A mayúscula.");
	                continue;
	            }
	            
	            break;
	        } while (true);
	        
	        return codigo;
	    }
	    private static BigDecimal solicitarPrecioAlquiler(Scanner scanner) {
	        BigDecimal precio;
	        do {
	            System.out.println("Introduce el precio de alquiler por metro/día (0 < precio < 100):");
	            String input = scanner.nextLine().trim();
	            
	            try {
	                precio = new BigDecimal(input);
	                
	                if (precio.compareTo(BigDecimal.ZERO) <= 0 || precio.compareTo(new BigDecimal("100")) >= 0) {
	                    System.out.println("Error: El precio debe ser mayor que 0 y menor que 100.");
	                    continue;
	                }
	                
	                break;
	            } catch (NumberFormatException e) {
	                System.out.println("Error: Debes introducir un número válido.");
	            }
	        } while (true);
	        
	        return precio;
	    }
	}


