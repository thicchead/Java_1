package be.pxl.h6.test;

public class KleurApp {
    public static void main(String[] args) {
        Kleur kleur = Kleur.ZWART;

        System.out.println(kleur);
        System.out.println(kleur.name());

        for (Kleur kleuren : Kleur.values()) {
            System.out.println(kleuren);
        }
    }
}
