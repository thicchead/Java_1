package be.pxl.h4.oef2;

public class Trainer {
    private Pokedex pokedex;
    private String naam;

    public Trainer(String naam) {
        this.naam = naam;
        pokedex = new Pokedex(10);
    }

    public void vangPokemon(Pokemon pokemon) {
        if (!pokedex.bevat(pokemon)) {
            System.out.println("Deze pokemon heb je al");
        } else {
            pokedex.voegToe(pokemon);
        }
    }

    public String toString() {
        return naam;
    }

    public Pokedex getPokedex() {
        return pokedex;
    }

    public String getNaam() {
        return naam;
    }
}
