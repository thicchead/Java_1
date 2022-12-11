package be.pxl.h3.oef1;

import java.util.Random;

public class randomTest {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            System.out.println(1.57 + (2.10 - 1.57) * random.nextDouble());
        }
        System.out.println("*****");
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextDouble(2.10 - 1.57 + 1) + 1.57);
        }
    }
}
