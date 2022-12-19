package be.pxl.h5.opdracht8;

public class FigurenApp {
    public static void main(String[] args) {
        Cirkel cirkel = new Cirkel(10, 10, 15.09);

        System.out.println(cirkel.getOmtrek());
        System.out.println(cirkel.getOppervlakte());

        System.out.println(GrafischElement.getAantal());

//        System.out.println(cirkel); //toString wordt automatisch al opgeroepen bij objecten
        System.out.println(cirkel.toString());

        Cirkel cirkel1 = new Cirkel(10, 10, 15.09);

        System.out.println(cirkel.equals(cirkel1));


        GrafischElement[] vormen = new GrafischElement[5];
        vormen[0] = new Cirkel(10, 10, 10);
        vormen[1] = new Cirkel(0, 0, 4);
        vormen[2] = new Rechthoek(0, 0, 10, 5);
        vormen[3] = new Vierkant(0, 0, 15);
        vormen[4] = new Driehoek(0, 0, 4, 12, 8);

        for (GrafischElement vorm : vormen) {
            System.out.printf("Omtrek: %10.0f Oppervlakte: %10.0f %12s%n", vorm.getOmtrek(), vorm.getOppervlakte(), vorm.getClass().getSimpleName().toUpperCase());
        }
    }
}
