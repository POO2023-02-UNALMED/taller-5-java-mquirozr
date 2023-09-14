package zooAnimales;

import gestion.Zona;

public class Ave extends Animal {
    private static int halcones = 0;
    private static int aguilas = 0;
    private String colorPlumas;

    public Ave(String nombre, int edad, String habitat, String genero, Zona zona, String colorPlumas) {
        super(nombre, edad, habitat, genero, zona);
        this.setColorPlumas(colorPlumas);
        if (colorPlumas.equals("cafe glorioso")) {
            halcones++;
        } else if (colorPlumas.equals("blanco y amarillo")) {
            aguilas++;
        }
    }

    public static int cantidadAves() {
        return halcones + aguilas;
    }

    public static Ave crearHalcon(String nombre, int edad, String habitat, String genero, Zona zona, String otrosValores) {
        return new Ave(nombre, edad, habitat, genero, zona, "cafe glorioso");
    }

    public static Ave crearAguila(String nombre, int edad, String habitat, String genero, Zona zona, String otrosValores) {
        return new Ave(nombre, edad, habitat, genero, zona, "blanco y amarillo");
    }

	public String getColorPlumas() {
		return colorPlumas;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
}

