package be.pxl.h4.oef2;

public class Pokedex {
    private Pokemon[] pokemon;

    public Pokedex(int grootte) {
        pokemon = new Pokemon[grootte];
    }

    public boolean bevat(Pokemon poke) {
        boolean isAanwezig = true;
        for (Pokemon p : pokemon) {
            isAanwezig = p.getNaam().equals(poke.getNaam());
        }
        return isAanwezig;
    }

    public void voegToe(Pokemon poke) {
        for (Pokemon allP : pokemon) {
            if (allP == null) {
                allP = poke;
                break;
            }
        }
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (Pokemon poke : pokemon) {
            builder.append("- ").append(poke.toString());
        }
        return builder.toString();
    }

    public Pokemon[] getPokemon() {
        return pokemon;
    }
}
