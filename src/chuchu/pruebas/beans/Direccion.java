package chuchu.pruebas.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Direccion {

	private String calle;
	private int nro;
	private int piso;
	private String depto;
	private String pais;
	
	public Direccion() {}
	
	public Direccion(String calle, int nro, int piso, String depto, String pais) {
		this.calle = calle;
		this.nro = nro;
		this.depto = depto;
		this.piso = piso;
		this.pais = pais;
	}
	
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getNro() {
		return nro;
	}
	public void setNro(int nro) {
		this.nro = nro;
	}
	public int getPiso() {
		return piso;
	}
	public void setPiso(int piso) {
		this.piso = piso;
	}
	public String getDepto() {
		return depto;
	}
	public void setDepto(String depto) {
		this.depto = depto;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
}
