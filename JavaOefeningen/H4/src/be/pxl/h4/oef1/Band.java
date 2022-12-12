package be.pxl.h4.oef1;

import java.util.ArrayList;
import java.util.Random;

public class Band {
    private String naam;
    ArrayList<Muzikant> leden = new ArrayList<>();

    public Band() {}

    public Band(String naam, Muzikant[] nieuweLeden) {
        this.naam = naam;
        for (Muzikant lid : nieuweLeden) {
            leden.add(lid);
        }
    }

    public void speel(int lengte) {
        System.out.println(naam + " in concert!");

        Random random = new Random();
        int randomLid = random.nextInt(leden.size());

        for (int i = 0; i < lengte; i++) {
            leden.get(randomLid).speel();
            randomLid = random.nextInt(leden.size());
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
