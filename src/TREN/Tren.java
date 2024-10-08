package TREN;
import java.util.ArrayList;

public class Tren {
    double CapacidadCarga;
    double Longitud;
    int NumElementos = 100;
    double Peso;
    int TamActual;
    private ArrayList<ElementoTren> elementos;

    public double getCapacidadCarga() {
        return CapacidadCarga;
    }

    public double getLongitud() {
        return Longitud;
    }

    public int getNumElementos() {
        return NumElementos;
    }

    public double getPeso() {
        return Peso;
    }

    public int getTamActual() {
        return TamActual;
    }

    public Tren(){
        elementos = new ArrayList<>();
        Locomotora locomotoraInicial = new Locomotora();
        elementos.add(locomotoraInicial);
        Peso = locomotoraInicial.getPeso();
        Longitud = locomotoraInicial.getLongitud();
        CapacidadCarga = locomotoraInicial.getCapacidadCarga();
        NumElementos = 1;
    }

    public void agregarVagon(Vagon vagon){
        while (CapacidadCarga < Peso + vagon.getPeso()) {
            agregarLocomotora();
        }
        elementos.add(vagon);
        actualizarAtributos(vagon);
    }

    public void agregarLocomotora(){
        if (NumElementos < 100){
            Locomotora nuevaLocomotora = new Locomotora();
            elementos.add(nuevaLocomotora);
            actualizarAtributos(nuevaLocomotora);
        }else{
            System.out.println("No se pueden agregar más elementos al tren.");
        }
    }

    private void actualizarAtributos(ElementoTren elemento) {
        Peso += elemento.getPeso();
        Longitud += elemento.getLongitud();
        if (elemento instanceof Locomotora) {
            CapacidadCarga += ((Locomotora) elemento).getCapacidadCarga();
        }
        NumElementos++;
    }

    public void getInfo(){
        System.out.println("--- Dimensiones ----");
        System.out.println("Número de elementos: " + NumElementos);
        System.out.println("Peso: " + Peso);
        System.out.println("Longitud: " + Longitud);
        System.out.println("Capacidad de carga: " + CapacidadCarga);
    }

    @Override
    public String toString() {
        StringBuilder representacion = new StringBuilder();
        for (ElementoTren elemento : elementos) {
            representacion.append(elemento.toString());
        }
        return representacion.toString();
    }
}



