package be.pxl.h1.opdracht2;

public class Auto {
    private String merk;
    private String kleur;
    private int kilometerstand;
    private int aantalDeuren;
    private boolean automaat;

    public int getPrijs() {
        int basisprijs = 20000;

        if (this.aantalDeuren == 5) {
            basisprijs += 2000;
        } else {
            basisprijs -= 500;
        }

        if (this.automaat) {
            basisprijs += 2000;
        } else {
            basisprijs *= 0.98;
        }

        return basisprijs;
    }

    public boolean isAutomaat() {
        return automaat;
    }

    public void setAutomaat(boolean automaat) {
        this.automaat = automaat;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getKleur() {
        return kleur;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }

    public int getKilometerstand() {
        return kilometerstand;
    }

    public void setKilometerstand(int kilometerstand) {
        this.kilometerstand = kilometerstand;
    }

    public int getAantalDeuren() {
        return aantalDeuren;
    }

    public void setAantalDeuren(int aantalDeuren) {
        this.aantalDeuren = aantalDeuren;
    }
}
