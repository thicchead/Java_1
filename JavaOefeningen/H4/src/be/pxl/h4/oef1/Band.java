package be.pxl.h4.oef1;

import java.util.Random;

public class Band {
    private String naam;
    Muzikant[] leden;

    public Band(String naam, Muzikant[] nieuweLeden) {
        this.naam = naam;
        leden = nieuweLeden;
    }

    public void speel(int lengte) {
        System.out.println(naam + " in concert!");

        Random random = new Random();
        int randomLid;

        for (int i = 0; i < lengte; i++) {
            randomLid = random.nextInt(leden.length);
            leden[randomLid].speel();
        }
    }

    public String toString() {
        StringBuilder string = new StringBuilder("PXL-Digital \n");

        for (Muzikant lid : leden) {
            string.append(lid.toString()).append("\n");
        }
        return string.toString();
    }
}
