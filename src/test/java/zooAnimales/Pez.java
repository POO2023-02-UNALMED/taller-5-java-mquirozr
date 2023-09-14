package zooAnimales;

import gestion.Zona;

public class Pez extends Animal {
    private static int salmones = 0;
    private static int bacalaos = 0;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez(String nombre, int edad, String habitat, String genero, Zona zona, String colorEscamas, int cantidadAletas) {
        super(nombre, edad, habitat, genero, zona);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        if (colorEscamas.equals("rojo")) {
            salmones++;
        } else if (colorEscamas.equals("gris")) {
            bacalaos++;
        }
    }

    public static int cantidadPeces() {
        return salmones + bacalaos;
    }

    public static Pez crearSalmon(String nombre, int edad, String habitat, String genero, Zona zona, String otrosValores) {
        return new Pez(nombre, edad, habitat, genero, zona, "rojo", 6);
    }

    public static Pez crearBacalao(String nombre, int edad, String habitat, String genero, Zona zona, String otrosValores) {
        return new Pez(nombre, edad, habitat, genero, zona, "gris", 6);
    }
}
