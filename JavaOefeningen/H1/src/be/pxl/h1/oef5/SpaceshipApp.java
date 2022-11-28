package be.pxl.h1.oef5;

public class SpaceshipApp {
    public static void main(String[] args) {
        Spaceship shipOne = new Spaceship();
        shipOne.setName("Milennium Falcon");

        Spaceship shipTwo = new Spaceship();
        shipTwo.setName("Star Destroyer");

        shipOne.fire(shipTwo);
        shipTwo.fire(shipOne);

        shipOne.setShieldOn();

        shipTwo.fire(shipOne);
        shipOne.fire(shipTwo);
        shipOne.fire(shipTwo);
        shipOne.fire(shipTwo);
        shipOne.fire(shipTwo);

        System.out.println(shipOne.getName() + " is destroyed? " + shipOne.isDestroyed());
        System.out.println(shipTwo.getName() + " is destroyed? " + shipTwo.isDestroyed());
    }
}
