package exRestaurante.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Restaurante {
	private String nombre;
	private Integer aforo;
	private Map<String, Reserva> mapReserva;
	private Map<Integer, Comanda> mapComanda;

	public Restaurante() {
		super();
		this.mapReserva = new HashMap<>();
		this.mapComanda = new HashMap<>();
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getAforo() {
		return aforo;
	}
	public void setAforo(Integer aforo) {
		this.aforo = aforo;
	}
	public Map<String, Reserva> getMapReserva() {
		return mapReserva;
	}
	public void setMapReserva(Map<String, Reserva> mapReserva) {
		this.mapReserva = mapReserva;
	}
	public Map<Integer, Comanda> getMapComanda() {
		return mapComanda;
	}
	public void setMapComanda(Map<Integer, Comanda> mapComanda) {
		this.mapComanda = mapComanda;
	}
	// Funcionalidades avanzadas
	//d)
	public Integer getDisponibilidad(LocalDate f) {
		int total = 0;
		
		for (Map.Entry<String, Reserva> entry : mapReserva.entrySet()) {
			String key = entry.getKey();
			Reserva val = entry.getValue();
			if (entry.getValue().getFecha().equals(f)) {
				total = total + entry.getValue().getN_personas();
			}
		}
		return aforo - total;
	}
	//e)
	public void actualizarReservas() {
		LocalDate fecha = LocalDate.now();
		Iterator<Map.Entry<String, Reserva>> borrar = mapReserva.entrySet().iterator();

		while (borrar.hasNext()) {
			if (borrar.next().getValue().getFecha().isBefore(fecha)	&& 
					borrar.next().getValue().getConfirmada() == false) {
				borrar.remove();
			}
		}
	}
	//f)
	public void addReserva(String nombre,LocalDate fecha,Integer num_pers)throws ReservasException{
		if (mapReserva.containsKey(nombre)) {
			throw new ReservasException("Ya existe una reserva para " + nombre + ".");
		}
		if (getDisponibilidad(fecha) < num_pers) {
			throw new ReservasException("No hay suficiente disponibilidad para esa fecha. "
					+ "Plazas disponibles: " +
					getDisponibilidad(fecha) + ".");
		}else {
			Reserva r = new Reserva(fecha, num_pers);
			mapReserva.put(nombre, r);
		}
	}
	//g)
	public void confirmarReserva(String nombre) throws ReservasException {
		for (Map.Entry<String, Reserva> entry : mapReserva.entrySet()) {
			String key = entry.getKey();
			Reserva val = entry.getValue();
			if(key.equalsIgnoreCase(nombre)) {
				System.out.println("Reserva Confirmada.");
			} else {
				throw new ReservasException("No hay reservas a ese nombre.");
			}
		}
	}
	//h)
	public Reserva getTopReserva(Integer minPer) throws ReservasException {
		Reserva rTop = null;
		for (Map.Entry<String, Reserva> entry : mapReserva.entrySet()){//Para buscar si es proxima y cumple req
			String key = entry.getKey();
			Reserva val = entry.getValue();
			
			if(val.isProxima() && val.getN_personas() <= minPer) {
				if(rTop == null || val.getN_personas() > rTop.getN_personas()) {
					rTop = val;
				}
			}
		}
		//si no hay ninguna reserva = null
		if(rTop == null) {
			throw new ReservasException("No hay reservas próximas con al menos " +minPer + " personas");
		}
		return rTop;
	}
	//i)
	public List<Integer> buscarArticulo(String desc){
		Set<Integer> conj = new HashSet<>();
//	                   Nº mesa, Comanda(LIsta de art:[COCA_COLA,HAMBU])      	
		for (Map.Entry<Integer, Comanda> entry : mapComanda.entrySet()) { //For para recorrer las mesas
			Integer key = entry.getKey();
			Comanda val = entry.getValue();
			for (Articulo ar : val.getLista()) { //for para revisar la lista de artículos pedidos.
				if(ar.getDescripcion().equalsIgnoreCase(desc)) { //Se compara si la descrip del artículo coincide con la que se está buscando.
				//Si se encuentra un artículo que coincide: Se agrega el número de la mesa al Set.
					conj.add(key);
					break;
				}
			}
		}
		return new ArrayList<>(conj);
	}	
}
