package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal {
	private ArrayList<Mamifero> listado = new ArrayList<Mamifero()>;
	public int caballos;
	public int leones;
	private boolean pelaje;
	private int patas;
	
	
	public Mamifero() {
		
	}

	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero);
		this.pelaje = pelaje;
		this.patas = patas;
	}


	
	public void cantidadMamiferos() {
		
	}
	public void crearCaballo(){
		
	}

	public void crearLeon(){
		
	}
	
}
