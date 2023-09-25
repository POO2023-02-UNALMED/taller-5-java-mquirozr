package zooAnimales;

import gestion.Zona;

public class Reptil extends Animal {
	public static int iguanas = 0;
	public static int serpientes = 0;
    private String colorEscamas;
    private int largoCola;
    private Reptil[] listado; 

    public Reptil(String nombre, int edad, String habitat, String genero, Zona zona, String colorEscamas, int largoCola, Reptil[] listado) {
        super(nombre, edad, habitat, genero, zona);
        this.setColorEscamas(colorEscamas);
        this.setLargoCola(largoCola);
        this.setListado(listado);
    }
    
    public Reptil() {
    	
    }
    
    @Override
    public String movimiento() {
        return "reptar";
    }

    public static int cantidadReptiles() {
        return iguanas + serpientes;
    }

    public Reptil crearIguana(String nombre, int edad,  String genero, Zona zona, String otrosValores) {
    	iguanas++;
        return new Reptil(nombre, edad, "humedal", genero, zona, "verde", 3, null);
    }

    public Reptil crearSerpiente(String nombre, int edad, String genero, Zona zona, String otrosValores) {
    	serpientes++;
        return new Reptil(nombre, edad, "jungla", genero, zona, "blanco", 1, null);
    }

    //
    
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
