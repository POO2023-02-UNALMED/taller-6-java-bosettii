package vehiculos;

public class Fabricante {
    private String nombre;
    private Pais pais;
    private int cantidadvehiculos;
    private static Fabricante fmayor;

    public static void setFabricante(Fabricante fabricante) {
		fmayor = fabricante;
	}

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return this.pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public int getCantidadvehiculos() {
        return this.cantidadvehiculos;
    }

    public void setCantidadvehiculos(int cantidadvehiculos) {
        this.cantidadvehiculos = cantidadvehiculos;
    }


    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
        this.cantidadvehiculos = 0;
        if(fmayor == null)
            fmayor = this;

    }


    public static Fabricante fabricaMayorVentas(){
        return fmayor;
    }

}
