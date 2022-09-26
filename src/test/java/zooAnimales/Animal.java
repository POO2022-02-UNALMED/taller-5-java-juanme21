package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Animal {
	
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private ArrayList<Zona> zona = new ArrayList<Zona>();
	
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
	}


	public Animal() {
		super();
	}


	public void movimiento() {
		
	}
	public void totalPorTipo(){
		
	}
	public String toString() {
		
	}
}
