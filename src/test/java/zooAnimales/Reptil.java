package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal {
	private ArrayList<Reptil> listado = new ArrayList<Reptil>();
	public int iguanas;
	public int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil() {
		
	}

	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
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
