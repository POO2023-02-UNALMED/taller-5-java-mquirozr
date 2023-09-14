package zooAnimales;

import gestion.Zona;

public class Anfibio extends Animal {
    private static int ranas = 0;
    private static int salamandras = 0;
    private String colorPiel;
    private boolean venenosa;

    public Anfibio(String nombre, int edad, String habitat, String genero, Zona zona, String colorPiel, boolean venenosa) {
        super(nombre, edad, habitat, genero, zona);
        this.colorPiel = colorPiel;
        this.venenosa = venenosa;
        if (venenosa && colorPiel.equals("rojo")) {
            ranas++;
        } else if (!venenosa && colorPiel.equals("negro y amarillo")) {
            salamandras++;
        }
    }

    public static int cantidadAnfibios() {
        return ranas + salamandras;
    }

    public static Anfibio crearRana(String nombre, int edad, String habitat, String genero, Zona zona, String otrosValores) {
        return new Anfibio(nombre, edad, habitat, genero, zona, "rojo", true);
    }

    public static Anfibio crearSalamandra(String nombre, int edad, String habitat, String genero, Zona zona, String otrosValores) {
        return new Anfibio(nombre, edad, habitat, genero, zona, "negro y amarillo", false);
    }
}