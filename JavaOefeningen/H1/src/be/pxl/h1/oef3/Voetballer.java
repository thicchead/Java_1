package be.pxl.h1.oef3;

public class Voetballer {
    private String naam;
    private int leeftijd;
    private int beoordelingscijfer;
    private String type;
    private int aantalDoelpunten;

    public double berekenPrijs() {
        double basisprijs;

        if (type.equals("aanvaller")) {
            basisprijs = 30000;
        } else if (type.equals("middenvelder")) {
            basisprijs = 28000;
        } else if (type.equals("verdediger")) {
            basisprijs = 29000;
        } else {
            basisprijs = 25000;
        }

        if (leeftijd < 25) {
            basisprijs *= 1.10;
        } else if (leeftijd > 30) {
            basisprijs *= 0.95;
        }

        if (type.equals("aanvaller")) {
            if (aantalDoelpunten <= 5) {
                basisprijs += 10000 * aantalDoelpunten;
            } else {
                basisprijs += 50000 + (aantalDoelpunten - 5) * 20000;
            }
        } else {
            basisprijs += beoordelingscijfer * 10000;

            if (type.equals("doelman")) {
                if (aantalDoelpunten > 20) {
                    basisprijs -= 9000;
                }
            }
        }

        return basisprijs;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    public int getBeoordelingscijfer() {
        return beoordelingscijfer;
    }

    public void setBeoordelingscijfer(int beoordelingscijfer) {
        this.beoordelingscijfer = beoordelingscijfer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAantalDoelpunten() {
        return aantalDoelpunten;
    }

    public void setAantalDoelpunten(int aantalDoelpunten) {
        this.aantalDoelpunten = aantalDoelpunten;
    }
}
