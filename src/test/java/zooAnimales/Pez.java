package zooAnimales;

import gestion.Zona;

public class Pez extends Animal {
	public static int salmones = 0;
	public static int bacalaos = 0;
	private String colorEscamas;
	private int cantidadAletas;
	private Pez[] listado;

	public Pez(String nombre, int edad, String habitat, String genero, Zona zona, String colorEscamas,int cantidadAletas, Pez[] listado) {
		super(nombre, edad, habitat, genero, zona);
		this.setColorEscamas(colorEscamas);
		this.setCantidadAletas(cantidadAletas);
		this.setListado(listado);
	}

	public Pez() {
	}

	@Override
	public String movimiento() {
		return "nadar";
	}

	public static int cantidadPeces() {
		return salmones + bacalaos;
	}

	public Pez crearSalmon(String nombre, int edad, String habitat, String genero, Zona zona,
			String otrosValores) {
		salmones++;
		return new Pez(nombre, edad, "oceano", genero, zona, "rojo", 6, null);
	}

	public Pez crearBacalao(String nombre, int edad, String habitat, String genero, Zona zona,
			String otrosValores) {
		bacalaos++;
		return new Pez(nombre, edad, "oceano", genero, zona, "gris", 6, null);
	}
	
	//

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getCantidadAletas() {
		return cantidadAletas;
	}

	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}

	public Pez[] getListado() {
		return listado;
	}

	public void setListado(Pez[] listado) {
		this.listado = listado;
	}
}
