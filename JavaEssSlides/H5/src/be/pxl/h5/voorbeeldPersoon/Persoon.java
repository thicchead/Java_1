package be.pxl.h5.voorbeeldPersoon;

public class Persoon {
    private String naam;
    private String voornaam;
    private static int aantal;

    public Persoon() {}

    public Persoon(String naam, String  voornaam) {
        setNaam(naam);
        setVoornaam(voornaam);
        aantal++;
    }

    public void print() {
        System.out.printf("Persoon: %s %s%n", voornaam, naam);
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

    public static int getAantal() {
        return aantal;
    }
}
