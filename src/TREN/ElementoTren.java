package TREN;

public class ElementoTren {
    String tipo;
    double Longitud;
    double Peso;

    public ElementoTren(String tipo, double longitud, double peso){
        this.tipo = tipo;
        this.Peso = peso;
        this.Longitud = longitud;
    }

    @Override
    public String toString() {
        return "|<" + tipo + ">|¬";
    }

    //public String toString(){return "|" + getTipo() + "|¬";}

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getLongitud() {
        return Longitud;
    }

    public void setLongitud(double longitud) {
        Longitud = longitud;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double peso) {
        Peso = peso;
    }
}
