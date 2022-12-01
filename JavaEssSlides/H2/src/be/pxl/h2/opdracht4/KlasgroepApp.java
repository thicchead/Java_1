package be.pxl.h2.opdracht4;

public class KlasgroepApp {
    public static void main(String[] args) {
        Klasgroep klasgroep = new Klasgroep();
        Klasgroep klasgroep1 = new Klasgroep("1TINa", 50);
        Klasgroep klasgroep2 = new Klasgroep("1TINb", 20);

        System.out.println(klasgroep1.getAantalStudenten());

        System.out.println(Klasgroep.getAantalKlassen());
        System.out.println(Klasgroep.getTotaalStudenten());

        klasgroep1.setAantalStudenten(10);
        System.out.println(Klasgroep.getTotaalStudenten());

        Klasgroep[] klassen = {klasgroep, klasgroep1, klasgroep2};

        for (Klasgroep klas : klassen) {
            System.out.println(klas.getKlasnaam() + " " + klas.getAantalStudenten());
        }

        System.out.printf("Gemiddelde: %.1f", Klasgroep.berekenGemiddelde());

    }
}
