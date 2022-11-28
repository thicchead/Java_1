package be.pxl.h2.opdracht3;

public class Klasgroep {
    public static final int MAX_STUDENTEN = 40;
    private String klasgroep;
    private int aantalStudenten;

    public Klasgroep(String klasgroep, int aantalStudenten) {
        this.klasgroep = klasgroep;
        this.aantalStudenten = aantalStudenten;
        if (aantalStudenten > MAX_STUDENTEN) {
            this.aantalStudenten = MAX_STUDENTEN;
        }
    }

    public Klasgroep() {
        this("1TINx", 0);
    }

    public String getKlasgroep() {
        return klasgroep;
    }

    public void setKlasgroep(String klasgroep) {
        this.klasgroep = klasgroep;
    }

    public int getAantalStudenten() {
        return aantalStudenten;
    }

    public void setAantalStudenten(int aantalStudenten) {
        this.aantalStudenten = aantalStudenten;
    }
}
