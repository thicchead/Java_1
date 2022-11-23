package be.pxl.h1.opdracht2;

public class AutoApp {
    public static void main(String[] args) {
        System.out.println("Dit programma maakt een auto");

        Auto mijnAuto = new Auto();

        mijnAuto.setMerk("Rolls Royce");
        mijnAuto.setKleur("zwart");
        mijnAuto.setKilometerstand(0);
        mijnAuto.setAantalDeuren(5);
        mijnAuto.setAutomaat(false);

        System.out.println(mijnAuto.getMerk() + ", " + mijnAuto.getKleur());
        System.out.println(mijnAuto.getKilometerstand() + ", " + mijnAuto.getAantalDeuren());
        System.out.println(mijnAuto.getPrijs());
    }
}
