package be.pxl.h3.opdracht2;

import java.util.Scanner;

public class VolumeBerekenen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 1;
        System.out.print("Straal pizza: ");
        double z = scanner.nextDouble();
        double oppervlakte = Math.PI * Math.pow(z, 2) * a;
        oppervlakte = Math.round(oppervlakte * 100);

        System.out.println(oppervlakte / 100.0);
    }
}
