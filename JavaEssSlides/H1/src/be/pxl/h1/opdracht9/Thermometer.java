package be.pxl.h1.opdracht9;

public class Thermometer {
    private double temperature;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    public double getFahrenheit() {
        return 9.0 / 5 * this.temperature + 32;
    }
}
