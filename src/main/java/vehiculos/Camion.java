package vehiculos;

public class Camion extends Vehiculo {
    private int ejes;
    private static int cantidadCamion = 0;

    public int getEjes() {
        return this.ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante,int ejes){
        super(placa,nombre,precio,peso,fabricante);
        this.puertas = 2;
        this.velocidadMaxima = 80;
        this.traccion = "4X2";
        this.ejes = ejes;
        cantidadCamion++;
    }

    public static int cantidadCamion(){
        return cantidadCamion;
    }
}
