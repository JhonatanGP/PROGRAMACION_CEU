package tema06.EjBasicos.Ej01casa.app;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

import tema06.EjBasicos.Ej01casa.modelo.Persona;
import tema06.EjBasicos.Ej01casa.services.PersonasService;
import tema06.EjBasicos.Ej05.servicios.DatosIncompletosException;

public class App2 {
	private static Scanner sc;
	private static PersonasService service;

	public static void main(String[] args) {
		try {
			service = new PersonasService();
			sc = new Scanner(System.in);
			Integer opcionElegida;

			do {

				opcionElegida = mostrarMenu();

				switch (opcionElegida) {

				case 1: {
					System.out.println("Indica el DNI  de la persona:");
					sc.nextLine();
					String dni = sc.nextLine();

					Persona persona = service.consultarPersona(dni);
					if (persona == null) {
						System.out.println("No existe persona con los datos solicitados");
					} else {
						System.out.println(persona);
					}
					break;
				}

				case 2: {

					System.out.println("Indica el filtro por el que buscar:");
					String filtro = "";
					sc.nextLine();
					filtro = sc.nextLine();

					List<Persona> personas = service.buscarPersonas(filtro);

					System.out.println("Resultados:");
					for (Persona person : personas) {
						System.out.println(person);
					}

					break;
				}

				case 3: {

					Persona p = solicitarDatosPersona();
					service.insertarPersona(p);
					break;
				}
				case 4: {
						Persona persona = solicitarDatosPersona();
						service.actualizarPersona(persona);
					break;
				}
				case 5: {
						System.out.println("Indica el DNI de la persona:");
						String dni = sc.nextLine();
						service.borrarPersona(dni);
					break;
				}

				case 0:
					System.err.println("Has salido del men");
					break;
				default:
					System.out.println("La opcin elegida no es correcta");
				}

			} while (!opcionElegida.equals("0"));

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
	}

	private static int mostrarMenu() {

		System.out.println("-----------------------------");
		System.out.println("Elige una de estas opciones: ");
		System.out.println("\t (1) Buscar persona por DNI");
		System.out.println("\t (2) Buscar personas por nombre/apellidos");
		System.out.println("\t (3) Insertar persona");
		System.out.println("\t (4) Actualizar persona");
		System.out.println("\t (5) Borrar persona");
		System.out.println("\t (0) Salir");
		System.out.println("-----------------------------");

		Integer opcion = sc.nextInt();

		return opcion;
	}

	private static Persona solicitarDatosPersona() {
		Persona p = new Persona();
		Boolean error = false;
		do {
			error = false;
			System.out.println("Indica el DNI de la persona:");
			sc.nextLine();
			p.setDni(sc.nextLine());

			System.out.println("Indica el NOMBRE de la persona:");
			p.setNombre(sc.nextLine());

			System.out.println("Indica el APELLIDO de la persona:");
			p.setApellidos(sc.nextLine());

			System.out.println("Indica la FECHA NACIMIENTO (dd/MM/yyyy) de la persona:");
			
			String fecha = sc.nextLine();

			DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			try {
				LocalDate fechaNacimiento = LocalDate.parse(fecha, format);
				p.setFecha_nac(fechaNacimiento);
			} catch (DateTimeParseException e) {
				System.out.println("La fecha indicada no es correta. Empieza de nuevo");
				error = true;
			}

			if (!error) {

				

			}
		} while (error);
		return p;
	}

}
