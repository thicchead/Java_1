package be.pxl.h4.opdracht1;

public class BoekApp {
    public static void main(String[] args) {
        Boek defaultBoek = new Boek();
        defaultBoek.toonBoekGegevens();

        defaultBoek.setIsbn("jj123");
        defaultBoek.setTitel("java is leuk");
        defaultBoek.setBladzijden(555);
        defaultBoek.setAuteur(new Auteur("jansen", "jan"));

        System.out.println();

        System.out.println("naam:" + defaultBoek.getAuteur().getNaam());

        System.out.println();

        System.out.println("volledige naam (cfr klasse Auteur): " + defaultBoek.getAuteur().toString());

        System.out.println();

        defaultBoek.toonBoekGegevens();
    }
}
