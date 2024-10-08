package TREN;

public class Main {
    public static void main(String[] args) {
        Tren n = new Tren();
        System.out.println("\n");
        n.agregarVagon(new Vagon(80000));
        n.agregarVagon(new Vagon(120000));
        n.agregarVagon(new Vagon(70000));
        n.agregarVagon(new Vagon(280000));
        n.agregarVagon(new Vagon(35000));
        System.out.println(n);
        n.getInfo();
    }
}