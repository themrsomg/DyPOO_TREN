package TREN;

public class Locomotora extends ElementoTren {
    double CapacidadCarga;

    public Locomotora(){
        super("Locomotora", 92600, 20.17);
        this.CapacidadCarga = 200000;
    }

    public double getCapacidadCarga(){
        return CapacidadCarga;
    }
}


