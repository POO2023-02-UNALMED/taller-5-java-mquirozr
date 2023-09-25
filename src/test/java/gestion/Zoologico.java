package gestion;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private List<Zona> zonas = new ArrayList<>();

	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}

	public Zoologico() {
	}
	
	public int cantidadTotalAnimales() {
		int totalAnimales = 0;
		for (Zona zona : zonas) {
			totalAnimales += zona.cantidadAnimales();
		}
		return totalAnimales;
	}
	
	public void agregarZonas(Zona zona) {
		zonas.add(zona);
	}


	//
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getUbicacion() {
		return ubicacion;
	}
	
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	public List<Zona> getZona() {
		return zonas;
	}
	
	public void setZona(List<Zona> zonas) {
		this.zonas=zonas;
	}
	



}