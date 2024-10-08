package TREN;

public class Vagon extends ElementoTren {
    double carga;

    public Vagon(double carga){
        super("Vagon", 25400 + carga, 18.28);
        this.carga = carga;
    }
    @Override
    public double getPeso() {
        return 25400 + carga;
    }
}
