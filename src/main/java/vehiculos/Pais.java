package vehiculos;

public class Pais {
    private String nombre;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public static Pais paisMasVendedor(){
        return Fabricante.fabricaMayorVentas().getPais();
        
    } 

}
