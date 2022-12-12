package be.pxl.h4.opdracht1;

public class Boek {
    private String isbn;
    private String titel;
    private int bladzijden;
    private Auteur auteur;

    public Boek() {
        this("000", "onbekend", 0, new Auteur("onbekend", "onbekend"));
    }

    public Boek(String isbn, String titel, int bladzijden, Auteur auteur) {
        setIsbn(isbn);
        setTitel(titel);
        setBladzijden(bladzijden);
        setAuteur(auteur);
    }

    public void toonBoekGegevens() {
        StringBuilder builder = new StringBuilder();

        builder.append("ISBN: ").append(isbn).append("\n");
        builder.append("Titel: ").append(titel).append("\n");
        builder.append("Bladzijden: ").append(bladzijden).append("\n");
        builder.append(auteur).append("\n"); // auteur.toString()

        System.out.println(builder.toString());
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public int getBladzijden() {
        return bladzijden;
    }

    public void setBladzijden(int bladzijden) {
        this.bladzijden = bladzijden;
    }

    public Auteur getAuteur() {
        return auteur;
    }

    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }

}
