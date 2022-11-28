package be.pxl.h1.oef3;

import java.util.Scanner;

public class VoetballerApp {
    public static void main(String[] args) {
        Voetballer voetballer = new Voetballer(); // kan ook pas in de while
        Scanner scanner = new Scanner(System.in);

        System.out.print("Naam: ");
        String naam = scanner.next();

        while (! naam.equals("stop")) {
            voetballer.setNaam(naam);

            System.out.print("Leeftijd: ");
            int leeftijd = scanner.nextInt();
            voetballer.setLeeftijd(leeftijd);

            System.out.print("Positie: ");
            String type = scanner.next();
            voetballer.setType(type);

            System.out.print("Beoordeling: ");
            int beoordeling = scanner.nextInt();
            voetballer.setBeoordelingscijfer(beoordeling);

            System.out.print("Doelpunten: ");
            int doelpunten = scanner.nextInt();
            voetballer.setAantalDoelpunten(doelpunten);

            System.out.printf("Prijs: €%.2f%n", voetballer.berekenPrijs());

            System.out.print("Naam: ");
            naam = scanner.next();
        }
    }
}
// tssen twee nextlines, een nextline extra tussenvoegen