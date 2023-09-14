package zooAnimales;

import gestion.Zona;

public class Reptil extends Animal {
    private static int iguanas = 0;
    private static int serpientes = 0;
    private String colorEscamas;
    private int largoCola;
    private Reptil[] listado; 

    public Reptil(String nombre, int edad, String habitat, String genero, Zona zona, String colorEscamas, int largoCola, Reptil[] listado) {
        super(nombre, edad, habitat, genero, zona);
        this.setColorEscamas(colorEscamas);
        this.setLargoCola(largoCola);
        this.setListado(listado);
        if (colorEscamas.equals("verde")) {
            iguanas++;
        } else if (colorEscamas.equals("blanco")) {
            serpientes++;
        }
    }
    
    public Reptil() {
        super();
        if (colorEscamas.equals("verde")) {
            iguanas++;
        } else if (colorEscamas.equals("blanco")) {
            serpientes++;
        }
    }
    
    public String movimiento() {
        return "reptar";
    }


    public static int cantidadReptiles() {
        return iguanas + serpientes;
    }

    public static Reptil crearIguana(String nombre, int edad, String habitat, String genero, Zona zona, String otrosValores) {
        return new Reptil(nombre, edad, habitat, genero, zona, "verde", 3, null);
    }

    public static Reptil crearSerpiente(String nombre, int edad, String habitat, String genero, Zona zona, String otrosValores) {
        return new Reptil(nombre, edad, habitat, genero, zona, "blanco", 1, null);
    }

	public Reptil[] getListado() {
		return listado;
	}

	public void setListado(Reptil[] listado) {
		this.listado = listado;
	}

	public int getLargoCola() {
		return largoCola;
	}

	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
}
