package be.pxl.h1.opdracht10;

import java.util.Scanner;

public class BankAccountApp {
    public static void main(String[] args) {
        BankAccount rekening = new BankAccount();
        /*rekening.setCode("BE");
        rekening.setControlDigits(68);
        rekening.setNumber(539007547034L);
        System.out.println(rekening.getAccount());

        if (rekening.isValid()){
            System.out.println("this bank account number is valid");
        } else {
            System.out.println("this bank account number is not valid");
        }
        System.out.println(rekening.isValid());*/

        /*BankAccount rekening2 = new BankAccount();
        rekening2.setCode("BE");
        rekening2.setControlDigits(68);
        rekening2.setNumber(539007547038L);  // laatste cijfer 8 ipv 4 ==> not valid
        System.out.println(rekening2.getAccount());
        System.out.println(rekening2.isValid());*/

        Scanner input = new Scanner(System.in);

        System.out.print("Startbedrag: ");
        double startbedrag = input.nextDouble();
        rekening.setAmount(startbedrag);

        System.out.print("Wil je geld afhalen? ");
        String antwoord = input.next();

        while (rekening.getAmount() > 0 && antwoord.equals("J")){
            System.out.print("Hoeveel? ");
            double geldbedrag = input.nextDouble();

            rekening.withdraw(geldbedrag);

            System.out.print("Wil je geld afhalen? ");
            antwoord = input.next();
        }
        String eindbedrag = String.format("Resterend bedrag: €%.2f", rekening.getAmount());
        System.out.println(eindbedrag);

        input.close();
    }
}
