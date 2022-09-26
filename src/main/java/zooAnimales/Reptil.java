package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal {
	private static ArrayList<Reptil> listado = new ArrayList<Reptil>();
	public int iguanas;
	public int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil() {
		listado.add(this);
	}

	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		listado.add(this);
	}

	
	public static int cantidadReptiles(){
		return listado.size();
	}
	
	@Override
	public String movimiento(){
		return "reptar";
	}
	
	public void crearIguana(String n, int e, String g){
		Reptil nuevo = new Reptil(n, e, "humedal", g, "verde", 3);
		iguanas++;
	}
	
	public void crearSerpiente(String n, int e, String g){
		Reptil nuevo = new Reptil(n, e, "jungla", g, "blanco", 1);
		serpientes++;
	}

	public static ArrayList<Reptil> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Reptil> listado) {
		Reptil.listado = listado;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getLargoCola() {
		return largoCola;
	}

	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	

}
