package be.pxl.h5.voorbeeldPersoon;

public class Lector extends Persoon{
    private String persooneelsnummer;
    private double aanstellingsPercentage;
    private double salaris;
    private static int aantal;

    public Lector() {
        this("onbekend", "onbekend", "20009999", 100, 2000);
    }

    public Lector(String naam, String voornaam, double aanstellingsPercentage, double salaris) {
        this(naam, voornaam, "20009999", aanstellingsPercentage, salaris);
    }

    public Lector(String naam, String voornaam, String persooneelsnummer, double aanstellingsPercentage, double salaris) {
        super(naam, voornaam);
        setPersooneelsnummer(persooneelsnummer);
        setAanstellingsPercentage(aanstellingsPercentage);
        setSalaris(salaris);
        aantal++;
    }

    public void print() {
        super.print();
        System.out.printf("Personeelsnummer: %s%n", persooneelsnummer);
        System.out.printf("Aanstellingspercentage: %.2f%%%n", aanstellingsPercentage);
        System.out.printf("Salaris: €%.2f%n", salaris);
    }

    public String getPersooneelsnummer() {
        return persooneelsnummer;
    }

    public void setPersooneelsnummer(String persooneelsnummer) {
        this.persooneelsnummer = persooneelsnummer;
    }

    public double getAanstellingsPercentage() {
        return aanstellingsPercentage;
    }

    public void setAanstellingsPercentage(double aanstellingsPercentage) {
        if (this.aanstellingsPercentage - aanstellingsPercentage != 0) {
            this.salaris *= (aanstellingsPercentage / this.aanstellingsPercentage);
        }

        if (aanstellingsPercentage < 0) {
            this.aanstellingsPercentage = 0;
        } else if (aanstellingsPercentage > 100) {
            this.aanstellingsPercentage = 100;
        } else {
            this.aanstellingsPercentage = aanstellingsPercentage;
        }
    }

    public double getSalaris() {
        return salaris;
    }

    public void setSalaris(double salaris) {
        this.salaris = salaris;
    }

    public static int getAantal() {
        return aantal;
    }
}
