package be.pxl.h1.oef6;

public class PhoneApp {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.setProvider("Floximus");

        for (int i = 0; i <= 20; i++) {
            /* int number = 12123410;
            number += i;
            phone.call("0" + Integer.toString(number)); */
            phone.call("0121234" + i);
        }

        phone.call("070245245");

        System.out.printf("Phone cost: €%.2f%n", phone.getCost());
        phone.reset();
        System.out.printf("Phone cost after reset: €%.2f%n", phone.getCost());
    }
}