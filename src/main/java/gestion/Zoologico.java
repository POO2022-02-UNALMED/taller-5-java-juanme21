package gestion;

import java.util.ArrayList;


public class Zoologico {
	
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas = new ArrayList<Zona>();

	

	public Zoologico() {
		super();
	}

	public Zoologico(String nombre, String ubicacion) {
		super();
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}

	public void agregarZonas(Zona z) {
		zonas.add(z);
	}
	
	public int cantidadTotalAnimales() {
		int total = 0;
		for (int i = 0; i < zonas.size(); i++)
	        total += zonas.get(i).cantidadAnimales();
		return total;
	}
}
