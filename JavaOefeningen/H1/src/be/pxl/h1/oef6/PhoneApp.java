package be.pxl.h1.oef6;

public class PhoneApp {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.setProvider("");

        for (int i = 1; i <= 21; i++) {
            int number = 12123409;
            number += i;
            phone.Call("0" + Integer.toString(number));
        }
        phone.Call("070245245");

        System.out.printf("Phone cost: €%.2f%n", phone.getCost());
        phone.reset();
        System.out.printf("Phone cost after reset: €%.2f%n", phone.getCost());

    }
}
