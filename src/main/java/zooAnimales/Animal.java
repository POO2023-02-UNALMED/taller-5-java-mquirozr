package zooAnimales;

import java.util.ArrayList;
import java.util.List;

import gestion.Zona;
import zooAnimales.Animal;

public class Animal {
    private int totalAnimales = 0;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private List<Zona> zona = new ArrayList<>();

    public Animal(String nombre, int edad, String habitat, String genero, Zona zona) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        this.zona.add(zona);
        totalAnimales++;
    }
    
    public Animal() {
    }
    
    public int getTotalAnimales() {
        return totalAnimales;
    }
    
    public String totalPorTipo() {

        return "Mamiferos: " + Mamifero.cantidadMamiferos() +
               "\nAves: " + Ave.cantidadAves() +
               "\nReptiles: " + Reptil.cantidadReptiles() +
               "\nPeces: " + Pez.cantidadPeces() +
               "\nAnfibios: " + Anfibio.cantidadAnfibios();
    }

    public String toString() {
    	
    	String perfil = "Mi nombre es " + nombre +
                ", tengo una edad de " + edad +
                ", habito en " + habitat +
                " y mi genero es " + genero;
    	
    	String zonaPerfil = 
    			", la zona en la que me ubico es " + zona.get(0).getNombre() +
                ", en el " + zona.get(0).getZoo().getNombre();
    	
    	String perfilCompleto = (zona!=null)?perfil+zonaPerfil:perfil;
    	
    	return perfilCompleto;
 
    }
    
    //

    public String movimiento() {
        return "desplazarse";
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public List<Zona> getZona() {
		return zona;
	}

	public void setZona(List<Zona> zona) {
		this.zona = zona;
	}

	public void setTotalAnimales(int totalAnimales) {
		this.totalAnimales = totalAnimales;
	}  
    
}
