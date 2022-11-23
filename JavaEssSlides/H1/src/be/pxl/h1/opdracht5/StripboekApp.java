package be.pxl.h1.opdracht5;

public class StripboekApp {
    public static void main(String[] args) {
        Stripboek stripboek = new Stripboek();

        stripboek.setReeks("Kuifje");
        stripboek.setTitel("Kuifje in Parijs");
        stripboek.setAlbum(67);
        stripboek.setAuteur("Metehan Karakoruk");

        System.out.println(stripboek.getReeks() + ": " + stripboek.getTitel() + ", " + stripboek.getAlbum() + " (" + stripboek.getAuteur() + ")");
    }

}
