package be.pxl.h1.opdracht9;

import java.util.Scanner;

public class ThermometerApp {
    public static void main(String[] args) {
        Thermometer temperature = new Thermometer();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature in Celsius: ");
        temperature.setTemperature(scanner.nextDouble());

        System.out.println(temperature.getFahrenheit());
    }
}
