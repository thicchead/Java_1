package be.pxl.h3.oef3;

public class Gondelbaan {
    private String naam;
    private String land;
    private int hoogteDalstation;
    private int hoogteBergstation;
    private double lengte;
    private int snelheid;
    private int passagiersPerGondel;
    private static int aantalGondels;

    public Gondelbaan(String naam, String land, double lengte, int snelheid) {
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
        return (lengte * 1000 / snelheid) / 60;
    }

    public int getVervoersCapaciteit() {
        return (int)((60 * getAantalGondels() * passagiersPerGondel) / getDuur());

    }

    public String toString() {
        return String.format("%s [%dm]", getNaam(), Math.round(getHoogteVerschil()));
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        naam = naam.toLowerCase();

        String[] naamApart = naam.split(" ");
        StringBuilder juisteNaam = new StringBuilder();

        for (String x : naamApart) {
            juisteNaam.append(Character.toUpperCase(x.charAt(0))).append(x.substring(1)).append(" ");
        }
        this.naam = juisteNaam.toString().trim();
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        String[] landen = {"Frankrijk", "Oostenrijk", "Zwitserland", "Italië"};

        for (String s : landen) {
            if (land.equals(s)) {
                this.land = land;
                break;
            } else {
                this.land = "Onbekend";
            }
        }
    }

    public void setHoogte(int h1, int h2) {
        this.hoogteBergstation = Math.max(h1, h2);
        this.hoogteDalstation = Math.min(h1, h2);
    }

    public int getHoogteVerschil() {
        return getHoogteBergstation() - getHoogteDalstation();
    }

    public int getHoogteDalstation() {
        return hoogteDalstation;
    }

    public int getHoogteBergstation() {
        return hoogteBergstation;
    }

    public double getLengte() {
        return lengte;
    }

    public void setLengte(double lengte) {
        this.lengte = lengte;
    }

    public int getSnelheid() {
        return snelheid;
    }

    public void setSnelheid(int snelheid) {
        if (snelheid < 3) {
            this.snelheid = 3;
        } else if (snelheid < 8) {
            this.snelheid = snelheid;
        } else {
            this.snelheid = 8;
        }
    }

    public int getPassagiersPerGondel() {
        return passagiersPerGondel;
    }

    public void setPassagiersPerGondel(int passagiersPerGondel) {
        this.passagiersPerGondel = passagiersPerGondel;
    }

    public static void setAantalGondels(int aantalGondels) {
        Gondelbaan.aantalGondels = aantalGondels;
    }

    public static int getAantalGondels() {
        return aantalGondels;
    }
}
