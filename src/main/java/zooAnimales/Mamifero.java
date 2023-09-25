package zooAnimales;

import gestion.Zona;
import zooAnimales.Animal;

public class Mamifero extends Animal {
	private Mamifero[] listado;
	public static int caballos = 0;
	public static int leones = 0;
	private boolean pelaje;
	private int patas;

	public Mamifero(String nombre, int edad, String habitat, String genero, Zona zona, boolean pelaje, int patas,
			Mamifero[] listado) {
		super(nombre, edad, habitat, genero, zona);
		this.setPelaje(pelaje);
		this.setPatas(patas);
		this.setListado(listado);

	}

	public Mamifero() {
	}

	public static int cantidadMamiferos() {
		return caballos + leones;
	}

	public Mamifero crearCaballo(String nombre, int edad, String genero, Zona zona, String otrosValores) {
		caballos++;
		return new Mamifero(nombre, edad, "pradera", genero, zona, true, 4, null);
	}

	public Mamifero crearLeon(String nombre, int edad, String genero, Zona zona, String otrosValores) {
		leones++;
		return new Mamifero(nombre, edad, "selva", genero, zona, true, 4, null);
	}
	
	//

	public Mamifero[] getListado() {
		return listado;
	}

	public void setListado(Mamifero[] listado) {
		this.listado = listado;
	}

	public boolean getPelaje() {
		return pelaje;
	}

	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}
}
