package be.pxl.h3.oef2;

public class Munt {
    private String naam;
    private double koers;
    public static final int AFRONDING = 3;
    private static int aantal;

    public Munt() {
        this("euro", 1);
    }

    public Munt(String naam, double koers) {
        setNaam(naam);
        setKoers(koers);
    }

    public String getNaam() {
        return naam.toUpperCase();
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public double getKoers() {
        return koers;
    }

    public void setKoers(double koers) {
        this.koers = koers;
    }

    public static int getAantal() {
        return aantal;
    }
    public static int getAfronding() {
        return AFRONDING;
    }
}
