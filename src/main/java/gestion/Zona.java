package gestion;

import java.util.ArrayList;
import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private List<Animal> animales;

	public Zona(String nombre, Zoologico zoo) {
		this.nombre = nombre;
		this.setZoo(zoo);
		this.animales = new ArrayList<Animal>();
	}

	public Zona() {

	}

	public void agregarAnimales(Animal animal) {
		animales.add(animal);
	}

	public int cantidadAnimales() {
		return animales.size();
	}

	//

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Zoologico getZoo() {
		return zoo;
	}

	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}

	public List<Animal> getAnimales() {
		return animales;
	}

	public void getAnimales(List<Animal> animales) {
		this.animales = animales;
	}

}