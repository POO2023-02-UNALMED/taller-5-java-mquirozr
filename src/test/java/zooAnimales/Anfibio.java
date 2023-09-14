package zooAnimales;

import gestion.Zona;

public class Anfibio extends Animal {
    private static int ranas = 0;
    private static int salamandras = 0;
    private String colorPiel;
    private boolean venenosa;
    private Anfibio[] listado;

    public Anfibio(String nombre, int edad, String habitat, String genero, Zona zona, String colorPiel, boolean venenosa, Anfibio[] listado) {
        super(nombre, edad, habitat, genero, zona);
        this.setColorPiel(colorPiel);
        this.setVenenosa(venenosa);
        this.setListado(listado);
        if (venenosa && colorPiel.equals("rojo")) {
            ranas++;
        } else if (!venenosa && colorPiel.equals("negro y amarillo")) {
            salamandras++;
        }
    }
    
    public Anfibio() {
        super();
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
        return new Anfibio(nombre, edad, habitat, genero, zona, "rojo", true, null);
    }

    public static Anfibio crearSalamandra(String nombre, int edad, String habitat, String genero, Zona zona, String otrosValores) {
        return new Anfibio(nombre, edad, habitat, genero, zona, "negro y amarillo", false, null);
    }

	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	public boolean isVenenosa() {
		return venenosa;
	}

	public void setVenenosa(boolean venenosa) {
		this.venenosa = venenosa;
	}

	public Anfibio[] getListado() {
		return listado;
	}

	public void setListado(Anfibio[] listado) {
		this.listado = listado;
	}
	
	public String movimiento() {
	    return "saltar";
	}

}
