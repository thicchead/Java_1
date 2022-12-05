package be.pxl.h3.opdracht1;

import java.util.Scanner;

public class Pow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x: ");
        int x = scanner.nextInt();

        System.out.println((int)Math.pow(x, 3));
    }
}
