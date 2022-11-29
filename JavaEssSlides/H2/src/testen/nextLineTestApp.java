package testen;

import java.util.Scanner;

public class nextLineTestApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* System.out.print("How old are you? ");
        int age = scanner.nextInt();

        // probleem --> nextLine leest de enter als input
        // oplossing --> voor en na (als het niet de laatste is) nextLine, een lege ertussen zetten om de enter te lezen

        scanner.nextLine();

        System.out.print("What's your name? ");
        String name = scanner.nextLine();

        System.out.println("Hello! " + name + ", you're " + age + " years old, right?"); */

        System.out.print("What's your name? ");
        String name = scanner.nextLine();

        System.out.print("How old are you? ");
        int age = scanner.nextInt();

        System.out.println("Hello! " + name + ", you're " + age + " years old, right?");
    }
}
