package zooAnimales;

import gestion.Zona;

public class Anfibio extends Animal {
    private static int ranas = 0;
    public static int salamandras = 0;
    public String colorPiel;
    private boolean venenoso;
    private Anfibio[] listado;

    public Anfibio(String nombre, int edad, String habitat, String genero, Zona zona, String colorPiel, boolean venenosa, Anfibio[] listado) {
        super(nombre, edad, habitat, genero, zona);
        this.setColorPiel(colorPiel);
        this.setVenenoso(venenosa);
        this.setListado(listado);
    }
    
    public Anfibio() {
    }


    public static int cantidadAnfibios() {
        return ranas + salamandras;
    }
    
    @Override
    public String movimiento() {
	    return "saltar";
	}

    public Anfibio crearRana(String nombre, int edad, String genero, Zona zona, String otrosValores) {
    	ranas++;
        return new Anfibio(nombre, edad, "selva", genero, zona, "rojo", true, null);
    }

    public Anfibio crearSalamandra(String nombre, int edad, String genero, Zona zona, String otrosValores) {
    	salamandras++;
        return new Anfibio(nombre, edad, "selva", genero, zona, "negro y amarillo", false, null);
    }

    //
    
	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	public boolean getVenenoso() {
		return venenoso;
	}

	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}

	public Anfibio[] getListado() {
		return listado;
	}

	public void setListado(Anfibio[] listado) {
		this.listado = listado;
	}
	
	

}
