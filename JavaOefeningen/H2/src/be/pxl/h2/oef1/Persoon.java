package be.pxl.h2.oef1;

public class Persoon {
    public static final double MAX_LENGTE = 2.40;
    private String voornaam;
    private String naam;
    private double lengte;
    private double gewicht;
    private int geboortejaar;

    public Persoon() {
        this("onbekend", "onbekend");
    }

    public Persoon(String naam, String voornaam) {
        setNaam(naam);
        setVoornaam(voornaam);
    }

    public Persoon(Persoon originelePersoon) {
        this(originelePersoon.naam, originelePersoon.voornaam);
        setLengte(originelePersoon.lengte);
        setGewicht(originelePersoon.gewicht);
        setGeboortejaar(originelePersoon.geboortejaar);
    }

    public String toString() {
        String eindString = "";
        eindString += "Deze persoon is " + voornaam + " " + naam + "\n";
        eindString += String.format("%-15s: %.2f%n", "gewicht", gewicht);
        eindString += String.format("%-15s: %.2f%n", "lengte", lengte);
        eindString += String.format("%-15s: %d", "geboortejaar", geboortejaar);

        return eindString;
    }

    public double berekenBmi() {
        return gewicht / (lengte* lengte);
    }

    public String geefOmschrijving() {
        double bmi = berekenBmi();
        if (bmi < 18) {
            return "Ondergewicht";
        } else if (bmi < 25) {
            return "Normaal";
        } else if (bmi < 30) {
            return "Overgewicht";
        } else if (bmi < 40) {
            return "Obesitas";
        } else {
            return "Morbide obesitas";
        }
    }

    public void voegVoornamenToe(String voornaam) {
        this.voornaam += " " + voornaam;
    }

    public void groei() {
        setLengte(this.lengte += 0.01);
    }

    public void groei(int aantalCm) {
        setLengte(this.lengte += aantalCm / 100.0);
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setLengte(double lengte) {
        if (lengte > MAX_LENGTE) {
            this.lengte = MAX_LENGTE;
        } else {
            this.lengte = lengte;
        }
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public void setGeboortejaar(int geboortejaar) {
        this.geboortejaar = geboortejaar;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public String getNaam() {
        return naam;
    }

    public double getLengte() {
        return lengte;
    }

    public double getGewicht() {
        return gewicht;
    }

    public int getGeboortejaar() {
        return geboortejaar;
    }

    public int getLeeftijd() {
        return 2022 - geboortejaar;
    }
}
