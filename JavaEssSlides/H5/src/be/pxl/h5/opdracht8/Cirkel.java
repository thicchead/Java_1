package be.pxl.h5.opdracht8;

import java.util.Objects;

public class Cirkel extends GrafischElement{
    private double straal;

    public Cirkel(int x, int y, double straal) {
        super(x, y);
        setStraal(straal);
    }

    public double getStraal() {
        return straal;
    }

    public void setStraal(double straal) {
        this.straal = straal;
    }

    public double getOppervlakte() {
        return Math.round(Math.PI * Math.pow(straal, 2) * 100) / 100.0;
    }

    public double getOmtrek() {
        return Math.round(Math.PI * (straal * 2) * 100) / 100.0;
    }

    @Override
    public String toString() {
        return String.format("Cirkel met straal %.2f op positie (%d, %d)", straal, getX(), getY());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cirkel cirkel = (Cirkel) o;
        return getStraal() == cirkel.getStraal() &&
                getX() == cirkel.getX() && getY() == cirkel.getY();
    }

    @Override
    public int hashCode() {
        return Objects.hash(straal);
    }
}
