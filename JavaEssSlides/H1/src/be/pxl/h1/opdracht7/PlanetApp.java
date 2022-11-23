package be.pxl.h1.opdracht7;

public class PlanetApp {
    public static void main(String[] args) {
        Planet planetOne = new Planet();
        Planet planetTwo = new Planet();

        planetOne.setName("Jupiter");
        planetTwo.setName("Uranus");

        planetOne.setDiameter(142984);
        planetTwo.setDiameter(51118);

        planetOne.setDistanceFromSun(778600000);
        planetTwo.setDistanceFromSun(2872500000L);

        if (planetOne.getDistanceFromSun() > planetTwo.getDistanceFromSun()) {
            System.out.println(planetTwo.getName() + " is closer by the Sun");
        } else {
            System.out.println(planetOne.getName() + " is closer by the Sun");
        }

        int astronomischeEenheid = 150000000;

        Planet mars = new Planet();
        mars.setDistanceFromSun(227900000);

        System.out.println("Mars staat op " + mars.getDistanceFromSun() / astronomischeEenheid + " AE van de zon");

        Planet neptunus = new Planet();
        neptunus.setDistanceFromSun(4495100000L);

        System.out.println("Neptunus staat op " + neptunus.getDistanceFromSun() / astronomischeEenheid + " AE van de zon");
    }
}
