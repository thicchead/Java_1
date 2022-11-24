package be.pxl.h1.opdracht9;

// import java.util.Scanner;

public class ThermometerApp {
    public static void main(String[] args) {
        Thermometer temperature = new Thermometer();
        /* Scanner scanner = new Scanner(System.in);

        System.out.print("Temperatuur in Celsius: ");
        temperature.setTemperature(scanner.nextDouble());

        System.out.println("Temperatuur in Fahrenheit: " + temperature.getFahrenheit()); */

        System.out.printf("|%10S|%10S|%n", "Celsius", "Fahrenheit");

        for (double temp = -10; temp < 30; temp += 5) { // eerst geprobeerd met temperature.get en set, kan veel simpeler
            temperature.setTemperature(temp);
            System.out.printf("|%10.2f|%10.2f|%n", temperature.getTemperature(), temperature.getFahrenheit());
        }
    }
}
