package be.pxl.h3.oef3;

public class Gondelbaan {
    private String naam;
    private String land;
    private double hoogteDalstation;
    private double hoogteBergstation;
    private double lengte;
    private double snelheid;
    private int passagiersPerGondel;
    private static int aantalGondels;

    public Gondelbaan(String naam, String land, double lengte, double snelheid) {
        setNaam(naam);
        setLand(land);
        setLengte(lengte);
        setSnelheid(snelheid);
        aantalGondels++;
    }

    public Gondelbaan(String naam, String land) {
        this(naam, land, 2, 6);
    }

    public double getDuur() {
        return (getHoogteDalstation() - getHoogteBergstation()) / snelheid;
    }

    public int getVervoersCapaciteit() {
        return (int)((60 * getAantalGondels() * passagiersPerGondel) / getDuur());
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        String[] landen = {"\"Frankrijk\", \"Oostenrijk\", \"Zwitserland\", \"Italië\""};
        for (String x : landen) {
            if (!x.equals(land)) {
                this.land = "Onbekend";
            } else {
                this.land = land;
            }
        }
    }

    public void setHoogte(double h1, double h2) {
        double hoogsteWaarde = h1;
        double laagsteWaarde = h2;
        if (h2 > h1) {
            hoogsteWaarde = h2;
            laagsteWaarde = h1;
        }
        this.hoogteBergstation = hoogsteWaarde;
        this.hoogteDalstation = laagsteWaarde;
    }

    public double getHoogteVerschil() {
        return getHoogteBergstation() - getHoogteDalstation();
    }

    public double getHoogteDalstation() {
        return hoogteDalstation;
    }

    public double getHoogteBergstation() {
        return hoogteBergstation;
    }

    public double getLengte() {
        return lengte;
    }

    public void setLengte(double lengte) {
        this.lengte = lengte;
    }

    public double getSnelheid() {
        return snelheid;
    }

    public void setSnelheid(double snelheid) {
        if (snelheid < 3) {
            this.snelheid = 3;
        } else if (snelheid > 8) {
            this.snelheid = 8;
        } else {
            this.snelheid = snelheid;
        }
    }

    public int getPassagiersPerGondel() {
        return passagiersPerGondel;
    }

    public void setPassagiersPerGondel(int passagiersPerGondel) {
        this.passagiersPerGondel = passagiersPerGondel;
    }



    public static int getAantalGondels() {
        return aantalGondels;
    }
}
