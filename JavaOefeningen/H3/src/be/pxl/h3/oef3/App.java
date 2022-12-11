package be.pxl.h3.oef3;

public class App {
    public static void main(String[] args) {
        Gondelbaan gondelbaan = new Gondelbaan("a", "Italië", 4, 10);
        gondelbaan.setHoogte(1000, 100);

        System.out.println(gondelbaan.getHoogteVerschil());
        System.out.println(gondelbaan.getSnelheid());
        System.out.println(gondelbaan.getLand());
        System.out.println(gondelbaan.getDuur());
    }
}
