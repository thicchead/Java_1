package be.pxl.h3.oef1;

import java.time.LocalDate;

public class Persoon {
    // tot opdracht 4: public ==> daarna private
    private String voornaam;
    private String naam;
    private double lengte;
    private double gewicht;
    private LocalDate geboortejaar;
    // geen constructor --> oproepen met functies (.now(), .of(), ...)
    // static methodes --> oproepen met LocalDate, niet met een variabele

    private static final double MAX_LENGTE = 2.4;

    // opdracht8
    public Persoon() {
        this("onbekend", "onbekend"); // opdracht 9
    }

    public Persoon(String n, String vn) { // opdracht 8  BASISCONSTRUCTOR
        setNaam(n);
        setVoornaam(vn);
    }

    public Persoon(Persoon p) { // opdracht 8
        this(p.naam, p.voornaam);
        setLengte(p.lengte);
        setGewicht(p.gewicht);
        setGeboortejaar(p.geboortejaar);
    }

    // opdracht4
    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public void setGeboortejaar(LocalDate geboortejaar) {
        this.geboortejaar = geboortejaar;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder("Deze persoon is "); // staat er al in
        int jaar;

        if (this.geboortejaar == null) {
            jaar = 0;
        } else {
            jaar = this.geboortejaar.getYear();
        }

        string.append(voornaam.toUpperCase());
        string.append(" ");
        string.append(naam.toUpperCase());
        string.append(String.format("%n"));
        string.append(String.format("%-15s : %.2f%n", "gewicht", this.gewicht));
        string.append(String.format("%-15s : %.2f%n", "lengte", this.lengte));
        string.append(String.format("%-15s : %d%n", "geboortejaar", jaar));

        return string.toString();
    }

    public double berekenBmi() {
        return (double) Math.round((this.gewicht / (this.lengte * this.lengte)) * 10 ) / 10;
    }

    public String geefOmschrijving() {
        double bmi = berekenBmi();
        String omschrijving;
        if (bmi < 18){
            omschrijving = "ondergewicht";
        } else if (bmi < 25){  // >= 18
            omschrijving = "normaal";
        } else if (bmi < 30){
            omschrijving = "overgewicht";
        } else if (bmi < 40){
            omschrijving = "obesitas";
        } else {
            omschrijving = "morbide obesitas";
        }
        return omschrijving;
    }

    public void voegVoornamenToe(String[] voornamen) {
        StringBuilder alleVoornamen = new StringBuilder();
        alleVoornamen.append(this.voornaam);

        for (String vn : voornamen) {
            alleVoornamen.append(vn);
            alleVoornamen.append(" ");
        }
        this.voornaam = alleVoornamen.toString();
    }

    // opdracht5
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

    public LocalDate getGeboortejaar() {
        return geboortejaar;
    }

    public int getLeeftijd() {
        return LocalDate.now().getYear() - geboortejaar.getYear();
    }

    // opdracht 6
    public void setLengte(double lengte) {
        if (lengte <= MAX_LENGTE) { // opdracht6
            this.lengte = lengte;
        } else {
            this.lengte = MAX_LENGTE;
        }
        //this.lengte = Math.min(lengte, MAX_LENGTE);
    }

    // opdracht7
    public void groei() {
        groei(1);
        //setLengte(lengte + 0.01);
    }

    public void groei(int cm) {
        setLengte(this.lengte + cm / 100.0);
    }

    public String geefNaamAfgekort() {
        StringBuilder afgekorteNaam = new StringBuilder();
        afgekorteNaam.append(Character.toUpperCase(voornaam.charAt(0))).append(". ");
        afgekorteNaam.append(Character.toUpperCase(naam.charAt(0))).append(naam.substring(1).toLowerCase());

        return afgekorteNaam.toString();
    }

    public String encrypteerNaam(int getal) {
        String heleNaam = geefNaamAfgekort();
        StringBuilder encrypteerdeNaam = new StringBuilder();

        for (int i = 0; i < heleNaam.length(); i++) {
            encrypteerdeNaam.append( (char) (heleNaam.charAt(i) + getal));
        }
        // ipv casten, toCharArray gebruiken
        // for char c : heleNaam.toCharArray()
        
        return encrypteerdeNaam.toString();
    }
}