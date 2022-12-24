package be.pxl.h6.opdracht;

import java.util.Random;

public class DagApp {
    public static void main(String[] args) {
        for (Dag dag : Dag.values()) {
            System.out.println(dag);
            System.out.println(dag.ordinal());
            System.out.println(dag.isWeekend());
        }

        Random random = new Random();
        int randomGetal = random.nextInt(Dag.values().length);
        int rand2 = random.nextInt(Dag.values().length);

        Dag dag1 = Dag.values()[randomGetal];
        Dag dag2 = Dag.values()[rand2];

        System.out.println("Gelijk: " + dag2.equals(dag1));

        if (dag1.ordinal() > dag2.ordinal()) {
            System.out.println("Dag 2 komt eerder");
            System.out.println(dag1.ordinal() - dag2.ordinal());
        } else {
            System.out.println("Dag 1 komt eerder of ze zijn dezelfde dagen");
            System.out.println(dag2.ordinal() - dag1.ordinal());
        }
    }
}
