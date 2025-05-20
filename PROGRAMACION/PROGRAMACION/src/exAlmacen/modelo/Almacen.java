package exAlmacen.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import exAlmacen.servicios.TrasteroEstadoException;

public class Almacen {
	private String direccion;
	private List<Trastero> listaTrastero;

	public Almacen(String direccion) {
		super();
		this.direccion = direccion;
		this.listaTrastero = new ArrayList<>();
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public List<Trastero> getListaTrastero() {
		return listaTrastero;
	}
	public void setListaTrastero(List<Trastero> listaTrastero) {
		this.listaTrastero = listaTrastero;
	}
	// C)
	public Integer actualizarTrasterosFinAlquiler() {
		Integer cont = 0;
		LocalDate hoy = LocalDate.now();

		Iterator<Trastero> it = this.listaTrastero.iterator();
		while (it.hasNext()) {
			Trastero trastero = it.next();
			if (trastero.isAlquilado() && trastero.getF_fin().isBefore(hoy)) {
				trastero.setAlquilado(false);
				trastero.getListaBulto().clear(); // Borra todos los bultos de la lista
				cont++;
			}
		}
		return cont;
	}
	// D)
	public Map<String, Integer> getMapaClientes() {
		Map<String, Integer> mapaCliente = new HashMap<>();
		for (Trastero trastero : listaTrastero) {
			if (trastero.isAlquilado()) {
				if (mapaCliente.containsKey(trastero.getDni())) {
					mapaCliente.put(trastero.getDni(), mapaCliente.get(trastero.getDni() + 1));
				} else {
					mapaCliente.put(trastero.getDni(), 1);
				}
			}
		}

		return mapaCliente;
	}
	// E)
	public Trastero getTrasteroLibre(Integer metros) throws TrasteroEstadoException {
		for (Trastero trastero : listaTrastero) {
			if (!trastero.isAlquilado()  && trastero.getMetro() >= metros) {
				return trastero;
			}
		}
		throw new TrasteroEstadoException("No hay trasteros libres");
	}
	//F)
	public Trastero getTrasteroMayorBulto() throws TrasteroEstadoException {
		if(listaTrastero.isEmpty()) {
			throw new TrasteroEstadoException("No hay trasteros libres");
		}
		Trastero trastBulto = null;
		BigDecimal mayPeso = BigDecimal.ZERO;
		
		for (Trastero trastero : listaTrastero) {
			if(!trastero.getListaBulto().isEmpty()) {//si no esta vacio busca 
				for (Bulto bulto : trastero.getListaBulto()) {
					if(bulto.getPeso().compareTo(mayPeso)>0) { //si getPeso es may q maypeso
						mayPeso = bulto.getPeso(); //Guardo el peso
					}
				}
			}
			if(trastBulto == null) {
				throw new TrasteroEstadoException("No hay trasteros libres");
			}
		}		
		return trastBulto;
	}

}



















