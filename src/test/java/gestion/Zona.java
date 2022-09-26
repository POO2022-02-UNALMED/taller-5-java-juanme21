package gestion;

import java.util.ArrayList;
import zooAnimales.Animal;
import zooAnimales.Reptil;

public class Zona {
	private String nombre;
	private Zoologico[] zoo;
	private ArrayList<Animal> animales = new ArrayList<Animal>();


	
	public Zona(String nombre, Zoologico zool) {
		super();
		this.nombre = nombre;
		this.zoo = new Zoologico[1];
		this.zoo[0] = zool;
	}
	
	public void agregarAnimales(Animal a) {
		animales.add(a);
	}
	
	public int cantidadAnimales() {
		return animales.size();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Zoologico[] getZoo() {
		return zoo;
	}

	public void setZoo(Zoologico[] zoo) {
		this.zoo = zoo;
	}

	public ArrayList<Animal> getAnimales() {
		return animales;
	}

	public void setAnimales(ArrayList<Animal> animales) {
		this.animales = animales;
	}
	
	
}
