package be.pxl.h3.oef4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class ScoutsKalenderApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef het jaar in: ");
        int jaar = scanner.nextInt();

        System.out.print("Geef maandnummer in: ");
        int maand = scanner.nextInt();

        System.out.print("Geef een dag in: ");
        int dag = scanner.nextInt();

        int aantalActiviteiten = 0;
        ArrayList<Activiteit> alleActiviteiten = new ArrayList<>();

        while (dag != 0 && aantalActiviteiten < 10) {
            System.out.print("Geef de activiteit in: ");
            String activiteit = scanner.next();

            Activiteit act = new Activiteit(activiteit, LocalDate.of(jaar, maand, dag));

            alleActiviteiten.add(act);

            System.out.print("Geef een dag in: ");
            dag = scanner.nextInt();

            aantalActiviteiten++;
        }
        LocalDate test = LocalDate.of(jaar, maand, 1);

        System.out.println("*** Kalender voor " + test.getMonth() + " " + test.getYear() + " ***");

        for (Activiteit act : alleActiviteiten) {
            System.out.println(act.toString());
        }
    }
}
