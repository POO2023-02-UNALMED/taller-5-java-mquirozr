package zooAnimales;

import java.util.ArrayList;

	public class Ave extends Animal {
	private static ArrayList<Ave> listado = new ArrayList<Ave>();
	public static int halcones = 0;
	public static int aguilas = 0;
	private String colorPlumas;

	public Ave() {
		super();
		listado.add(this);
	}

	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
		listado.add(this);
	}

	public static Ave crearHalcon(String nombre, int edad, String genero) {
		Ave halcon = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
		Ave.halcones++;
		return halcon;
	}
	
	public static Ave crearAguila(String nombre, int edad, String genero) {
		Ave aguila = new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
		Ave.aguilas++;
		return aguila;
	}
	
	@Override
	public String movimiento() {
		return "volar";
	}

	public static int cantidadAves() {
		return listado.size();
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
/*package zooAnimales;

import gestion.Zona;
import zooAnimales.Animal;

public class Ave extends Animal {
	public static int halcones = 0;
	public static int aguilas = 0;
	private String colorPlumas;
	private Ave[] listado;

	public Ave(String nombre, int edad, String habitat, String genero, Zona zona, String colorPlumas, Ave[] listado) {
		super(nombre, edad, habitat, genero, zona);
		this.setColorPlumas(colorPlumas);
		this.setListado(listado);
	}
	
	public Ave(){}
	
	
	@Override
	public String movimiento() {
		return "volar";
	}

	public static int cantidadAves() {
		return halcones + aguilas;
	}

	public Ave crearHalcon(String nombre, int edad, String genero, Zona zona, String otrosValores) {
		halcones++;
		return new Ave(nombre, edad, "montanas", genero, zona, "cafe glorioso", null);
	}

	public Ave crearAguila(String nombre, int edad, String genero, Zona zona, String otrosValores) {
		aguilas++;
		return new Ave(nombre, edad, "montanas", genero, zona, "blanco y amarillo", null);
	}

	//
	
	public String getColorPlumas() {
		return colorPlumas;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}

	public Ave[] getListado() {
		return listado;
	}

	public void setListado(Ave[] listado) {
		this.listado = listado;
	}
}
*/