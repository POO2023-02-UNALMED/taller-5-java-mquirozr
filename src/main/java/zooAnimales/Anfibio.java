package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal {
	private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
	public static int ranas = 0;
	public static int salamandras = 0;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio() {
		super();
		listado.add(this);
	}
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		super(nombre, edad, habitat, genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		listado.add(this);
	}
	
	public static int cantidadAnfibios() {
		return listado.size();
	}
	
	@Override
	public String movimiento() {
		return "saltar";
	}
	
	public static Anfibio crearRana(String nombre, int edad, String genero) {
		Anfibio rana = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
		Anfibio.ranas++;
		return rana;
	}
	
	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		Anfibio salamandra = new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
		Anfibio.salamandras++;
		return salamandra;
	}
	
	public static ArrayList<Anfibio> getListado() {
		return listado;
	}
	public static void setListado(ArrayList<Anfibio> listado) {
		Anfibio.listado = listado;
	}
	public String getColorPiel() {
		return colorPiel;
	}
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	public boolean isVenenoso() {
		return venenoso;
	}
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
}
/*package zooAnimales;

import gestion.Zona;
import zooAnimales.Animal;

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
	
	

}*/
