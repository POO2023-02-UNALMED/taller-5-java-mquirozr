package zooAnimales;

import gestion.Zona;

public class Mamifero extends Animal {
	private Mamifero[] listado;
    private static int caballos = 0;
    private static int leones = 0;
    private boolean pelaje;
    private int patas;
    

    public Mamifero(String nombre, int edad, String habitat, String genero, Zona zona, boolean pelaje, int patas, Mamifero[] listado) {
        super(nombre, edad, habitat, genero, zona);
        this.pelaje = pelaje;
        this.patas = patas;
        this.listado = listado;
        if (pelaje && patas == 4) {
            caballos++;
        } else if (pelaje && patas == 4) {
            leones++;
        }
    }

    public static int cantidadMamiferos() {
        return caballos + leones;
    }

    public static Mamifero crearCaballo(String nombre, int edad, String habitat, String genero, Zona zona, String otrosValores) {
        return new Mamifero(nombre, edad, habitat, genero, zona, true, 4, null);
    }

    public static Mamifero crearLeon(String nombre, int edad, String habitat, String genero, Zona zona, String otrosValores) {
        return new Mamifero(nombre, edad, habitat, genero, zona, true, 4, null);
    }
}

