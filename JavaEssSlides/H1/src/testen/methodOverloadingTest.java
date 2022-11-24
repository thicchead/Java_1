package testen;

public class methodOverloadingTest {
    private int gewicht;
    private double lengte;

    public double verdubbelen(int gewicht) {
        return gewicht * 2;
    }

    public double verdubbelen(double lengte) {
        return lengte * 2;
    }

    public int getGewicht() {
        return gewicht;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }

    public double getLengte() {
        return lengte;
    }

    public void setLengte(double lengte) {
        this.lengte = lengte;
    }
}
