package exAlmacen.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import exAlmacen.servicios.TrasteroEstadoException;

public class Trastero {
	private String codigo;
	private Integer metro;
	private Boolean alquilado;
	private BigDecimal precio;
	private String dni;
	private LocalDate f_fin;
	private LocalDate f_ini;
	private Integer diasAlquiler;
	private List<Bulto> listaBulto;
	
	public Trastero(String codigo, Integer metro) {
		super();
		this.codigo = codigo;
		this.metro = metro;
		this.alquilado = false;
		this.listaBulto = new ArrayList<>();
	}

	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Integer getMetro() {
		return metro;
	}
	public void setMetro(Integer metro) {
		this.metro = metro;
	}
	public Boolean isAlquilado() {
		return alquilado;
	}
	public void setAlquilado(Boolean alquilado) {
		this.alquilado = alquilado;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public LocalDate getF_fin() {
		return f_fin;
	}

	public void setF_fin(LocalDate f_fin) {
		this.f_fin = f_fin;
	}

	public LocalDate getF_ini() {
		return f_ini;
	}

	public void setF_ini(LocalDate f_ini) {
		this.f_ini = f_ini;
	}

	public Integer getDiasAlquiler() {
		return diasAlquiler;
	}

	public void setDiasAlquiler(Integer diasAlquiler) {
		this.diasAlquiler = diasAlquiler;
	}

	public List<Bulto> getListaBulto() {
		return listaBulto;
	}

	public void setListaBulto(List<Bulto> listaBulto) {
		this.listaBulto = listaBulto;
	}
		
	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trastero other = (Trastero) obj;
		return Objects.equals(codigo, other.codigo);
	}
	//Funcionalidades avanzadas
	//a)
	public void alquilar(String dni,Integer diasAlq,BigDecimal precio)throws TrasteroEstadoException{
		if(alquilado == true) {
			throw new TrasteroEstadoException("Trastero ya alquilado.");
		}else {
			alquilado = true;
			this.dni = dni;
			this.diasAlquiler = diasAlq;
			this.precio = precio;
			this.f_ini = LocalDate.now();
			this.f_fin = this.f_ini.plusDays(diasAlq);
		}
	}
	//b)
	public BigDecimal getImporteAlquiler() throws TrasteroEstadoException {
		if (alquilado == false) {
			throw new TrasteroEstadoException("Trastero no alquilado.");
		}
		BigDecimal base = this.precio.multiply(new BigDecimal(this.metro))
				.multiply(new BigDecimal(this.diasAlquiler));
		BigDecimal sobrecoste = BigDecimal.ZERO;
		
        for (Bulto bulto : listaBulto) {
        	sobrecoste = sobrecoste.add(bulto.getSobrecosteDiario());
		}
        sobrecoste.multiply(new BigDecimal(this.diasAlquiler));
		return  base.add(sobrecoste).setScale(2,RoundingMode.HALF_UP);
		
	}
}
