package be.pxl.h4.opdracht1;

public class Auteur {
    private String naam;
    private String voornaam;

    public Auteur() {}

    public Auteur(String naam, String voornaam) {
        setNaam(naam);
        setVoornaam(voornaam);
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String toString() {
        return "Auteur: " + voornaam + " " + naam;
    }
}
