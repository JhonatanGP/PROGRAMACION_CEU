package exRestaurante.app;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import exRestaurante.modelo.ReservasException;
import exRestaurante.modelo.Restaurante;
import exRestaurante.servicios.ReservasService;

public class App {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
	//1 CREO RESTAURANTE
		Restaurante a = new Restaurante();
		a.setNombre("Blas");
		a.setAforo(100);
	//2 SOLITAR FECHA DE RESERVA
        LocalDate fechaReserva = solicitarFecha(sc);
    // 3-5. Solicitar y procesar reservas
        boolean continuar = true;
        while (continuar) {
            try {
                System.out.println("\nIntroduce los datos de la reserva (nombre, número de personas):");
                String input = sc.nextLine();
                String[] datos = input.split(",");
                
                if (datos.length != 2) {
                    System.out.println("Error: Debes introducir exactamente 2 valores separados por coma.");
                    continue;
                }                
                String nombre = datos[0].trim();
                int personas;
                
                try {
                    personas = Integer.parseInt(datos[1].trim());
                    if (personas <= 0) {
                        System.out.println("Error: El número de personas debe ser mayor que 0.");
                        continue;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Error: El número de personas debe ser un valor numérico válido.");
                    continue;
                }                
                // Añadir reserva
                a.addReserva(nombre, fechaReserva, personas);
                System.out.println("Reserva añadida correctamente para "+nombre+" (" +personas+" personas).");
                
                // Preguntar si desea añadir otra reserva
                System.out.println("\n¿Deseas añadir otra reserva para la misma fecha? (S/N)");
                String respuesta = sc.nextLine().trim().toUpperCase();
                continuar = respuesta.equals("S");
               
            } catch (ReservasException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        
        // 6. Guardar reservas en BBDD
        try {
            ReservasService servicio = new ReservasService();
            servicio.insertarReservas(a);
            System.out.println("\nTodas las reservas se han guardado correctamente en la base de datos.");
        } catch (ReservasException e) {
            System.out.println("\nError al guardar las reservas: " + e.getMessage());
        }
        
        sc.close();
    }
		
	private static LocalDate solicitarFecha(Scanner scanner) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fecha = null;
        
        while (fecha == null) {
            System.out.println("Introduce la fecha de reserva (formato dd/MM/yyyy):");
            String input = scanner.nextLine();
            
            try {
                fecha = LocalDate.parse(input, formatter);
                if (fecha.isBefore(LocalDate.now())) {
                    System.out.println("Error: La fecha no puede ser anterior al día actual.");
                    fecha = null;
                }
            } catch (DateTimeParseException e) {
                System.out.println("Error: Formato de fecha incorrecto. Usa el formato dd/MM/yyyy.");
            }
        }
        return fecha;
    }
}
