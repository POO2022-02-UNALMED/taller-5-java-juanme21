package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal {
	private ArrayList<Ave> listado = new ArrayList<Ave>();
	public int halcones;
	public int aguilas;
	private String colorPlumas;
	
	public Ave() {
		
	}

	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
	}

	public void cantidaAves(){
		
	}
	
	public void movimeinto(){
		
	}
	
	public void crearHalcon(){
		
	}
	
	public void crearAguila(){
		
	}
	
}
