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
        System.out.println(persoon.getLengte());
        Persoon persoon = new Persoon("Karakoruk", "Metehan");
        persoon.setLengte(1.50);
        persoon.setGewicht(50);
        persoon.setGeboortejaar(2003);

        System.out.println(persoon.toString());

        Persoon persoon1 = new Persoon();
        System.out.println(persoon1);

        Persoon copyPerson = new Persoon(persoon);
        System.out.println(copyPerson);*/
        // opdracht 2
        Persoon p1 = new Persoon();
        System.out.println(p1.getLengte());
        //opdracht 3
//         p1.naam = "Mystery";
//         p1.voornaam = "Michael";
//         p1.lengte = 1.78;
//         p1.gewicht = 56.3;
//         p1.geboortejaar = 1990;
//         System.out.println("naam : " + p1.naam);
//        System.out.println("geboortejaar: " + p1.geboortejaar);
        // opdracht4
        p1.setNaam("Mystery");
        p1.setVoornaam("Michael");
        p1.setGeboortejaar(1984);
        p1.setGewicht(59);
        p1.setLengte(1.85);

        System.out.println(p1.toString());
        System.out.println(p1.berekenBmi());

        System.out.println(p1.geefOmschrijving());

        String[] voornamen = {"George", "Jimmy", "xxx", "jan"};
        p1.voegVoornamenToe(voornamen);

        System.out.println(p1.toString());

        // opdracht5
        System.out.println("de voornamen van p1 zijn " + p1.getVoornaam());
        System.out.println("de leeftijd van p1 is " + p1.getLeeftijd());

        // opdracht6
        p1.setLengte(2.41);
        System.out.println("de lengte van p1 is nu " + p1.getLengte());

        // opdracht7
        p1.groei();
        System.out.println("de lengte van p1 na groei() is nu " + p1.getLengte());
        p1.setLengte(1.70);
        p1.groei();
        p1.groei(5);
        System.out.println("de lengte van p1 na 2 keer groei is nu " + p1.getLengte());

        // opdracht8
        Persoon p2 = new Persoon("Maes", "Jef");
        Persoon p3 = new Persoon();
        Persoon p4 = new Persoon(p2);

        // opdracht9
        System.out.println(p3.toString());
    }
}
