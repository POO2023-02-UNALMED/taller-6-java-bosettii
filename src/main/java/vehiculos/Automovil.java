package vehiculos;

public class Automovil extends Vehiculo {
    private int puestos;
    private static int cantidadAutomovil = 0;

    public int getPuestos() {
        return this.puestos;
    }

    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }

    
    public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante,int puestos){
        super(placa,nombre,precio,peso,fabricante);
        this.puertas = 4;
        this.velocidadMaxima = 100;
        this.traccion = "FWD";
        this.puestos = puestos;
        cantidadAutomovil++;
    }

    public static int cantidadAutomovil(){
        return cantidadAutomovil;
    }

    
}
