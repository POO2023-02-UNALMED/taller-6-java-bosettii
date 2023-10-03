package vehiculos;

public class Vehiculo {

    public static int CantidadVehiculos = 0;

    private String placa;
    protected int puertas;
    protected int velocidadMaxima;
    private String nombre;
    private int precio;
    private int peso;
    protected String traccion;
    private Fabricante fabricante;

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getPuertas() {
        return this.puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getVelocidadMaxima() {
        return this.velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return this.precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPeso() {
        return this.peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getTraccion() {
        return this.traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public Fabricante getFabricante() {
        return this.fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public static void setCantidadVehiculos(int a){
        CantidadVehiculos = a;
    }

    public static int getCantidadVehiculos(){
        return CantidadVehiculos;
    }



    public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
        this.placa = placa;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.traccion = traccion;
        this.fabricante = fabricante;
        CantidadVehiculos++;
        fabricante.setCantidadvehiculos(fabricante.getCantidadvehiculos()+1);


        if(fabricante.getCantidadvehiculos()>Fabricante.fabricaMayorVentas().getCantidadvehiculos() || Fabricante.fabricaMayorVentas() == null)
            Fabricante.setFabricante(fabricante);


    }


    public Vehiculo(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante) {
        this.placa = placa;
        this.puertas = puertas;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.fabricante = fabricante;
        CantidadVehiculos++;
        fabricante.setCantidadvehiculos(fabricante.getCantidadvehiculos()+1);

        if(fabricante.getCantidadvehiculos()>Fabricante.fabricaMayorVentas().getCantidadvehiculos() || Fabricante.fabricaMayorVentas() == null)
            Fabricante.setFabricante(fabricante);

    }


    public Vehiculo(String placa, String nombre, int precio, int peso, Fabricante fabricante) {
        this.placa = placa;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.fabricante = fabricante;
        CantidadVehiculos++;
        fabricante.setCantidadvehiculos(fabricante.getCantidadvehiculos()+1);
        if(fabricante.getCantidadvehiculos()>Fabricante.fabricaMayorVentas().getCantidadvehiculos() || Fabricante.fabricaMayorVentas() == null)
            Fabricante.setFabricante(fabricante);
    }


    public String vehiculosPorTipo(){
        return ("Automoviles: " + Automovil.cantidadAutomovil() + "\nCamionetas: " + Camioneta.cantidadCamioneta() + "\nCamiones: " + Camion.cantidadCamion());
    }

    public static void main(String[] args){
        Pais p = new Pais("Colombia");
	
	    Fabricante f = new Fabricante("Renault", p);

        Vehiculo ve = new Automovil("AA", "Carro", 100, 20, f, 4);
    
        System.out.println(ve.getPuertas());
    }
}
