package tema04.EjRepaso.Ej04;

import java.util.List;

public class Libreria {
	
	//01
	private String direccion;
	private Integer numero;
	private List <Libro> listaLibro;
	
	//02
	public Libreria(String direccion, Integer numero, List<Libro> listaLibro) {
		super();
		this.direccion = direccion;
		this.numero = numero;
		this.listaLibro = listaLibro;
	}
	//03
	public Libreria() {
		super();
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public List<Libro> getListaLibro() {
		return listaLibro;
	}

	public void setListaLibro(List<Libro> listaLibro) {
		this.listaLibro = listaLibro;
	}
	
	//04
//obtenerLibroMasAntiguo() que devuelve el libro que sea más antiguo de todos los registrados
	public Libro obtenerLibroMasAntiguo() {
		//Si la lista está vacía
		if(this.listaLibro.isEmpty()) {
			return null;
		}
			Libro libroAnt = listaLibro.get(0);  
			
			//falta terminar
			return libroAnt;
	}

// obtenerPesoTotalDeLibros() que devuelve la suma del peso de todos los libros (los libros digitales tienen peso 0) 
	
	

}
