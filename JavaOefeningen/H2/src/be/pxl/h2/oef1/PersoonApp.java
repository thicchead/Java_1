package be.pxl.h2.oef1;

public class PersoonApp {
    public static void main(String[] args) {
        /*Persoon persoon = new Persoon();
        persoon.setVoornaam("Metehan");
        persoon.voegVoornamenToe("Test");
        persoon.setNaam("Karakoruk");

        persoon.setLengte(1.78);
        persoon.setGewicht(87);

        persoon.setGeboortejaar(2003);

        System.out.println(persoon.geefOmschrijving());
        System.out.println(persoon.toString());
        System.out.println(persoon.getLeeftijd());

        persoon.groei();
        System.out.println(persoon.getLengte());
        persoon.groei(10);
        System.out.println(persoon.getLengte());*/
        Persoon persoon = new Persoon("Karakoruk", "Metehan");
        persoon.setLengte(1.78);
        persoon.setGewicht(87);
        persoon.setGeboortejaar(2003);

        System.out.println(persoon.toString());

        Persoon persoon1 = new Persoon();
        System.out.println(persoon1.toString());

        Persoon copyPerson = new Persoon(persoon);
        System.out.println(copyPerson.toString());
    }
}
