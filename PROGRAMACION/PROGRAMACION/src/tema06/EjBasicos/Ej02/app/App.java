package tema06.EjBasicos.Ej02.app;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import tema06.EjBasicos.Ej02.modelo.Persona;
import tema06.EjBasicos.Ej02.servicios.PersonasService;

public class App {

	public static void main(String[] args) {
		PersonasService service = new PersonasService();
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Indica el DNI de la persona");
			String vDNI = sc.nextLine();
			Persona p = service.consultarPersona(vDNI);
			
			if (p == null) {
				System.out.println("No existe persona con los datos introducidos");
			} else {
				System.out.println(p);
			}
			// Filtro para buscar por nombre o apellidos
				System.out.println("Indica nombre o apellidos a buscar:");
				String filtro = "";
				do {
					filtro = sc.nextLine();
				} while (filtro.isEmpty());

				List<Persona> lista = service.buscarPersona(filtro);
				if(lista.isEmpty())
						System.out.println("No hay ninguna persona con ese filtro");
				for (Persona persona : lista) {
							System.out.println(persona);
						}

		} catch (SQLException e) {
			System.out.println("Exception en main: " + e.getMessage());
		}finally {
			sc.close();
		}

	}

}