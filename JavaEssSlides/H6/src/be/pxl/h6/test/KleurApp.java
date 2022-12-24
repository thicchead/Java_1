package be.pxl.h6.test;

public class KleurApp {
    public static void main(String[] args) {
        Kleur kleur = Kleur.ROOD;

        printKleur(kleur);

    }
    private static void printKleur(Kleur kleur) {
        System.out.println(kleur.name());
        System.out.println(kleur.ordinal());
        System.out.println(kleur);
        String text;
        if (kleur == Kleur.ZWART) {
            text = "zwarte tekst";
        } else {
            text = "niet zwart";
        }
        System.out.println(text);
    }
}
