package tema04.EjRepaso.Ej02;

public class Telefono {
	//01
	private Integer numero;
	private Boolean enLlamada;
	
	//02
	public Telefono(Integer numero) {
		super();
		this.numero = numero;
		this.enLlamada = false;
	}
	
	//03	
	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Boolean getEnLlamada() {
		return enLlamada;
	}

	public void setEnLlamada(Boolean enLlamada) {
		this.enLlamada = enLlamada;
	}
   //04 
	public Integer consultarNumero(Integer numero) {
		return this.numero= numero;
	}
	
	public void marcar(Integer numero) {
		
		System.out.println("Llamando a ..." + numero);
		if(this.numero.equals(numero)) { // Cuando es Integer(mayuscula) es un obj y se pone equals y no ==
			System.out.println("Comunicando");
		}else {
			System.out.println("En comunicación");
			this.enLlamada = true;
		}
	}
	
	public void colgar() {
		if(enLlamada == true) {
			System.out.println("Comunicación terminada");
			enLlamada = false;
		}else {
			//no hace nada
		}
		
	}
	
	

}
