package be.pxl.h2.opdracht3;

public class Klasgroep {
    public static final int MAX_STUDENTEN = 40;
    private String klasnaam;
    private int aantalStudenten;

    public Klasgroep() {
        this("1TINx", 0);
    }

    public Klasgroep(String klasnaam, int aantalStudenten) {
        setKlasnaam(klasnaam);
        setAantalStudenten(aantalStudenten);
    }

    public String getKlasnaam() {
        return klasnaam;
    }

    public void setKlasnaam(String klasnaam) {
        this.klasnaam = klasnaam;
    }

    public int getAantalStudenten() {
        return aantalStudenten;
    }

    public void setAantalStudenten(int aantalStudenten) {
        this.aantalStudenten = aantalStudenten;
        if (aantalStudenten > MAX_STUDENTEN) {
            this.aantalStudenten = MAX_STUDENTEN;
        }
    }
}
