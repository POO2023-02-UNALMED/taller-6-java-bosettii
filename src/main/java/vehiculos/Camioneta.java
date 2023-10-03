package vehiculos;

public class Camioneta extends Vehiculo {
    private boolean volco;
    private static int cantidadCamioneta = 0;

    public boolean isVolco() {
        return this.volco;
    }

    public void setVolco(boolean volco) {
        this.volco = volco;
    }


    public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante,boolean volco){
        super(placa,puertas,nombre,precio,peso,fabricante);
        this.traccion = "4X4";
        this.velocidadMaxima = 90;
        this.volco = volco;
        cantidadCamioneta++;
    }

    public static int cantidadCamioneta(){
        return cantidadCamioneta;
    }

}
