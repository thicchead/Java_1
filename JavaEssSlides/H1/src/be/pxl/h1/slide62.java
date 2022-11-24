package be.pxl.h1;

import java.util.Scanner;

public class slide62 {
    public static void main(String[] args) {
        Scanner toetsenbord = new Scanner(System.in);

        System.out.print("Geef je leeftijd: ");
        int leeftijd = toetsenbord.nextInt();

        toetsenbord.nextLine();  // rariteit --> line pakt enter

        System.out.print("geef je naam: ");
        String naam = toetsenbord.nextLine();

        System.out.println("leeftijd is " + leeftijd);
        System.out.println("mijn naam is " + naam);

        System.out.println("geef je loon in ");
        double loon = toetsenbord.nextDouble();
        System.out.println("mijn loon is " + loon);
    }
}
