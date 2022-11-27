package testen;

import java.util.Scanner;

public class ArrayTesterApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Nr. " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
