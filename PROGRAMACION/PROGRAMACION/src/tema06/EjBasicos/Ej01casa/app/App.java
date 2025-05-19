package tema06.EjBasicos.Ej01casa.app;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

import tema06.EjBasicos.Ej01casa.modelo.Persona;
import tema06.EjBasicos.Ej01casa.services.PersonasService;
import tema06.EjBasicos.Ej04.servicios.DatosIncompletosException;

public class App {

	public static void main(String[] args) {
		PersonasService service = new PersonasService();
		Scanner sc = new Scanner(System.in);
		int num;

		try {
			while (true) {
				System.out.println(
						"Elige una de estas opciones: \n\t(1) Buscar persona por DNI \n\t(2) Buscar persona por "
								+ "nombre/apellidos \n\t(3) Insertar persona \n\t(0) Salir");
				num = sc.nextInt();
				if (num == 1 || num == 2 || num == 3 || num == 0) {

				} else {
					System.out.println("Número incorrecto.");
				}
				if (num == 1) {
					sc.nextLine();
					System.out.println("Indica el DNI de la persona:");
					String vDNI = sc.nextLine();
					Persona p = service.consultarPersona(vDNI);

					if (p == null) {
						System.out.println("No existe persona con los datos introducidos.");
					} else {
						System.out.println(p);
					}
				}
				if (num == 2) {
					System.out.println("Indica nombre o apellidos a buscar:");
					String filtro = "";
					do {
						filtro = sc.nextLine();
					} while (filtro.isEmpty());

					List<Persona> lista = service.buscarPersonas(filtro);
					if (lista.isEmpty())
						System.out.println("No hay ninguna persona con ese filtro.");
					for (Persona persona : lista) {
						System.out.println(persona);
					}
				}
				if (num == 3) {
					Boolean error = false;
					System.out.println("Insertar.");
					Persona agregar = new Persona();
					
					do {
						System.out.println("Escribe un DNI: ");
						sc.nextLine();

						String dni = sc.nextLine();
						System.out.println("Escribe un Nombre:");
						String nombre = sc.nextLine();
						System.out.println("Escribe un Apellidos:");
						String apellido = sc.nextLine();
						System.out.println("Escribe una Fecha de Nacimiento:");
						String fecha = sc.nextLine();
						agregar.setApellidos(apellido);
						agregar.setDni(dni);
						agregar.setNombre(nombre);
						DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
						try {
							LocalDate fecha1 = LocalDate.parse(fecha, format);
							agregar.setFecha_nac(fecha1);
						} catch (DateTimeParseException e) {
							System.out.println("La fecha indicada no es la correcta");
							error = true;
						}if (!error) {
							
							try {
								agregar.validar();
							}catch(DatosIncompletosException e) {
								System.out.println("Datos incompletos.");
								error =  true;
							}
						}
						
						
					}while (error);
					service.insertarPersona(agregar);
					System.out.println("Insertado correctamente.");
					break;
					
					
					
				}
				if (num == 0) {
					break;
				}
			}
		} catch (SQLException e) {
			
			System.out.println("Exception en main: " + e.getMessage());
		} finally {
			sc.close();
		}

	}
	}