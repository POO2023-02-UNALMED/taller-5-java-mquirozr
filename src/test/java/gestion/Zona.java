package gestion;

import java.util.ArrayList;
import java.util.List;

import zooAnimales.Animal;

public class Zona {
    private String nombre;
    private Zoologico zoo;
    private List<Animal> animales = new ArrayList<>();

    public Zona(String nombre, Zoologico zoo) {
        this.nombre = nombre;
        this.setZoo(zoo);
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarAnimales(Animal animal) {
        animales.add(animal);
    }

    public int cantidadAnimales() {
        return animales.size();
    }

	public Zoologico getZoo() {
		return zoo;
	}

	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}
}