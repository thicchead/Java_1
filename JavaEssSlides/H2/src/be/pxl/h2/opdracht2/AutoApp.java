package be.pxl.h2.opdracht2;

public class AutoApp {
    public static void main(String[] args) {
        Auto auto = new Auto("Audi", "Zwart", 3, -5000);
        System.out.println(auto.getKilometerstand());

        Auto copyAuto = new Auto(auto);
        System.out.println(copyAuto.getKilometerstand());
    }
}
