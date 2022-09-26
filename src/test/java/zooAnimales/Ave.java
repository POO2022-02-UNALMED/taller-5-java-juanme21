package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal {
	private static ArrayList<Ave> listado = new ArrayList<Ave>();
	public int halcones;
	public int aguilas;
	private String colorPlumas;
	
	public Ave() {
		listado.add(this);
	}

	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
		listado.add(this);
	}

	public static int cantidadAves(){
		return listado.size();
	}
	
	@Override
	public String movimiento(){
		return "volar";
	}
	
	public void crearHalcon(String n, int e, String g){
		Ave nuevo = new Ave(n, e, "montanas", g, "cafe glorioso");
		halcones++;
	}
	
	public void crearAguila(String n, int e, String g){
		Ave nuevo = new Ave(n, e, "montanas", g, "blanco y amarillo");
		aguilas++;
	}

	public static ArrayList<Ave> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Ave> listado) {
		Ave.listado = listado;
	}

	public String getColorPlumas() {
		return colorPlumas;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
	
}
