package zooAnimales;

import gestion.Zona;

public class Animal {
    private static int totalAnimales = 0;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona;

    public Animal(String nombre, int edad, String habitat, String genero, Zona zona) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        this.zona = zona;
        totalAnimales++;
    }

    public static String totalPorTipo() {
        int mamiferos = Mamifero.cantidadMamiferos();
        int aves = Ave.cantidadAves();
        int reptiles = Reptil.cantidadReptiles();
        int peces = Pez.cantidadPeces();
        int anfibios = Anfibio.cantidadAnfibios();

        return "Mamiferos: " + mamiferos +
               "\nAves: " + aves +
               "\nReptiles: " + reptiles +
               "\nPeces: " + peces +
               "\nAnfibios: " + anfibios;
    }

    public String toString() {
        if (zona != null) {
            return "Mi nombre es " + nombre +
                   ", tengo una edad de " + edad +
                   ", habito en " + habitat +
                   " y mi genero es " + genero +
                   ", la zona en la que me ubico es " + zona.getNombre() +
                   ", en el " + zona.getZoo().getNombre();
        } else {
            return "Mi nombre es " + nombre +
                   ", tengo una edad de " + edad +
                   ", habito en " + habitat +
                   " y mi genero es " + genero;
        }
    }

    public String movimiento() {
        return "desplazarse";
    }

    public static int getTotalAnimales() {
        return totalAnimales;
    }
}
