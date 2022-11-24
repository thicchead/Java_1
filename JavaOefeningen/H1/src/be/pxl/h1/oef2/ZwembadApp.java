package be.pxl.h1.oef2;

import java.util.Scanner;

public class ZwembadApp {
    public static void main(String[] args) {
        Zwembad zwembad = new Zwembad();
        Scanner input = new Scanner(System.in);

        System.out.print("Geef de breedte van het zwembad: ");
        double breedte = input.nextDouble();
        zwembad.setBreedte(breedte);

        System.out.print("Geef de lengte van het zwembad: ");
        double lengte = input.nextDouble();
        zwembad.setLengte(lengte);

        System.out.print("Geef de diepte van het zwembad: ");
        double diepte = input.nextDouble();
        zwembad.setDiepte(diepte);

        System.out.printf("Liter water: %.0f%n", zwembad.getVolumeWater());
        System.out.printf("Liter ontsmettingsmiddel: %.0f%n", zwembad.getVolumeOntsmettingsmiddel());

        input.close();
    }
}
