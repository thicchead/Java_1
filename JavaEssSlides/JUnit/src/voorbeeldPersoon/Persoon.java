package voorbeeldPersoon;

public class Persoon {
    private String naam;
    private String voornaam;

    public Persoon(String naam, String voornaam) {
        this.naam = naam;
        this.voornaam = voornaam;
    }
    // versie 1: 3 testen rood
    /* public String getVolledigeNaam() {
        return null;
    } */

    // versie 2: 2 testen groen , 1 test rood
    /* public String getVolledigeNaam() {
        StringBuilder volledigeNaam = new StringBuilder(voornaam);
        if (naam == null) {
        volledigeNaam.append(" ?");
        } else {
            volledigeNaam.append(" ").append(naam);
        }
        return volledigeNaam.toString();
    } */

    // versie 3: alle testen groen
    public String getVolledigeNaam() {
        StringBuilder volledigeNaam = new StringBuilder();
        if (voornaam == null) {
            volledigeNaam.append("?");
        } else {
            volledigeNaam.append(voornaam);
        }
        if (naam == null) {
            volledigeNaam.append(" ?");
        } else {
            volledigeNaam.append(" ").append(naam);
        }
        return volledigeNaam.toString();
    }


}
