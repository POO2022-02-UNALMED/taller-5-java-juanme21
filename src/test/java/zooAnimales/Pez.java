package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal {

	private ArrayList<Reptil> listado = new ArrayList<Reptil>();
	public int salmones;
	public int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez() {
		
	}
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
	}

	public void cantidadReptiles(){
		
	}
	
	public void movimeinto(){
		
	}
	
	public void crearIguana(){
		
	}
	
	public void crearSerpiente(){
		
	}
}
