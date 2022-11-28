package be.pxl.h2.opdracht1;

public class Auto {
    private String merk;
    public String kleur;
    private int kilometerstand;  // enkel getter
    private int aantalDeuren;

    public Auto(String merk, String kleur, int aantalDeuren) {
        // kan ook met this.merk = merk (gelijk de setter)
        setMerk(merk);
        setKleur(kleur);
        setAantalDeuren(aantalDeuren);
    }

    public Auto() {}

    public Auto(String merk, String kleur, int aantalDeuren, int kilometerstand) {
        setMerk(merk);
        setKleur(kleur);
        setAantalDeuren(aantalDeuren);
        this.kilometerstand = kilometerstand;
    }

    public Auto(Auto origineleAuto) {
        setMerk(origineleAuto.merk);
        setKleur(origineleAuto.kleur);
        setAantalDeuren(origineleAuto.aantalDeuren);
        this.kilometerstand = origineleAuto.kilometerstand;
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

    public int getAantalDeuren() {
        return aantalDeuren;
    }

    public void setAantalDeuren(int aantalDeuren) {
        if (aantalDeuren < 0) {
            this.aantalDeuren = - aantalDeuren;
        } else {
            this.aantalDeuren = aantalDeuren;
        }
    }

    public int getPrijs(){
        int prijs = 20000;
        if (aantalDeuren == 3){
            prijs -= 1000;
        }
        return prijs;
    }

    public void rijden(int kilometer){
        this.kilometerstand += kilometer;
    }

    public void rijden (int[] kms){
        for (int x : kms){
            kilometerstand += x;
        }
    }

    public void rijden(int tijd, int snelheid){
        kilometerstand += snelheid * tijd;
    }
}
