package be.pxl.h2.opdracht1;

public class AutoApp {
    public static void main(String[] args) {
        Auto auto0 = new Auto("Audi", "zwart", 5);
        System.out.println(auto0.getMerk());

        Auto auto1 = new Auto("Mercedes", "wit", 5, 5000);
        System.out.println(auto1.getMerk());

        Auto auto2 = new Auto(auto1);
        System.out.println(auto2.getMerk() + " " + auto2.getKleur());
    }

}
