package zooAnimales;

import gestion.Zona;

public class Reptil extends Animal {
    private static int iguanas = 0;
    private static int serpientes = 0;
    private String colorEscamas;
    private int largoCola;

    public Reptil(String nombre, int edad, String habitat, String genero, Zona zona, String colorEscamas, int largoCola) {
        super(nombre, edad, habitat, genero, zona);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        if (colorEscamas.equals("verde")) {
            iguanas++;
        } else if (colorEscamas.equals("blanco")) {
            serpientes++;
        }
    }

    public static int cantidadReptiles() {
        return iguanas + serpientes;
    }

    public static Reptil crearIguana(String nombre, int edad, String habitat, String genero, Zona zona, String otrosValores) {
        return new Reptil(nombre, edad, habitat, genero, zona, "verde", 3);
    }

    public static Reptil crearSerpiente(String nombre, int edad, String habitat, String genero, Zona zona, String otrosValores) {
        return new Reptil(nombre, edad, habitat, genero, zona, "blanco", 1);
    }
}
