package tema04.EjBasicos01.Ej43;

public class App {

	public static void main(String[] args) {
		// 1. Crea 4 actores: 
		Actores Actor1 = new Actores("Blas Blau", 1983, "Española");
		Actores Actor2 = new Actores("Laura Pozo", 1981, "Italia");
		Actores Actor3 = new Actores("Marcel Cade", 2001, "Suiza");
		Actores Actor4 = new Actores("Violeta Volo", 1999, "Rusia");
		
		// 2. Crea 1 directora: 
		Directores Director1 = new Directores("Sara Marea", 1994, "Portugal");
		
		// 3. Crea 2 guionistas: 
		Guionistas G1 = new Guionistas("Marco Smith", 1988, "Reino Unido");
		Guionistas G2 = new Guionistas("Cheng Shu", 1977, "China");

		/*4. Crea una película que se estrena en 2027 dirigida por Sara y con Marco como guionista. Actuarán Blas y Laura.
		     Su título es “Do you know Joe Blas?”. */
		Pelicula P1 = new Pelicula(2027, "Do you know Joe Blas?", G1, Director1);
		P1.getActores().add(Actor1);
		P1.getActores().add(Actor2);
		
		//5. Crea otra película con el mismo año de estreno y directora. El guionista es chino, y participan todos los actores.  título es “Muerte en la sombra”
		
		//6. Imprime la lista de actores de la primera película
		
		//7. Imprime el sueldo del guionista de la primera película y su nacionalidad
		
		//8. Borra al actor suizo de la segunda película y añádelo a la primera
		
		//9. Imprime los actores de las dos películas 
		

	}

}
