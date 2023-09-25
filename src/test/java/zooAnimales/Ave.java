package zooAnimales;

import gestion.Zona;

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
