package be.pxl.h3.opdracht3;

import java.util.Random;

public class RandomApp {
    public static void main(String[] args) {
        Random random = new Random();

        int getal = random.nextInt();
        System.out.println(getal);

        for (int i = 0; i < 20; i++) {
            int get = random.nextInt(10) + 1;
            System.out.println((i + 1) + ": " + get);
        }

        for (int i = 0; i < 10; i++) {
            int g = random.nextInt(10) + 21;
            System.out.println((i + 1) + ": " + g);
        }

        System.out.println((char)random.nextInt(97, 123));
        // (char)26 + int 'a'
    }
}
