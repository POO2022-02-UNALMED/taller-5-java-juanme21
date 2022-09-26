package gestion;

import java.util.ArrayList;


public class Zoologico {
	
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zona = new ArrayList<Zona>();

	

	public Zoologico() {
		super();
	}

	public Zoologico(String nombre, String ubicacion) {
		super();
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}

	public void agregarZonas(Zona z) {
		zona.add(z);
	}
	
	public int cantidadTotalAnimales() {
		int total = 0;
		for (int i = 0; i < zona.size(); i++)
	        total += zona.get(i).cantidadAnimales();
		return total;
	}

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

	public ArrayList<Zona> getZona() {
		return zona;
	}

	public void setZona(ArrayList<Zona> zonas) {
		this.zona = zonas;
	}
	
	
}
