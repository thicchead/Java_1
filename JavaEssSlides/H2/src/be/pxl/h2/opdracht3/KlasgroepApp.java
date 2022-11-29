package be.pxl.h2.opdracht3;

public class KlasgroepApp {
    public static void main(String[] args) {
        System.out.println(Klasgroep.MAX_STUDENTEN);

        Klasgroep klasgroep = new Klasgroep();
        Klasgroep klasgroep1 = new Klasgroep("1TINa", 50);

        Klasgroep[] klassen = {klasgroep, klasgroep1};

        for (Klasgroep klas : klassen) {
            System.out.println(klas.getKlasnaam() + " heeft " + klas.getAantalStudenten() + " studenten");
        }
    }
}
