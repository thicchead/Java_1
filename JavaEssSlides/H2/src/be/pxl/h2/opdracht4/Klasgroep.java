package be.pxl.h2.opdracht4;

public class Klasgroep {
    public static final int MAX_STUDENTEN = 40;
    private String klasnaam;
    private int aantalStudenten;
    private static int aantalKlassen;
    private static int totaalStudenten;

    public Klasgroep() {
        this("1TINx", 0);
    }

    public Klasgroep(String klasnaam, int aantalStudenten) {
        setKlasnaam(klasnaam);
        setAantalStudenten(aantalStudenten);
        aantalKlassen++;
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
        totaalStudenten -= this.aantalStudenten;
        if (aantalStudenten > MAX_STUDENTEN) {
            aantalStudenten = MAX_STUDENTEN;
        }
        totaalStudenten += aantalStudenten;
        this.aantalStudenten = aantalStudenten;
    }

    public static int getAantalKlassen() {
        return aantalKlassen;
    }

    public static int getTotaalStudenten() {
        return totaalStudenten;
    }

    public static double berekenGemiddelde() {
        return (double) totaalStudenten / aantalKlassen;
    }
}
