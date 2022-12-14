package be.pxl.h4.oef2;

public class Pokedex {
    private Pokemon[] pokemon;

    public Pokedex(int grootte) {
        pokemon = new Pokemon[grootte];
    }

    public boolean bevat(Pokemon newPokemon) {
        boolean plaats = false;
        for (Pokemon value : pokemon) {
            if (value == newPokemon) {
                plaats = true;
                break;
            }
        }
        return plaats;
    }

    public void voegToe(Pokemon poke) {
        for (int i = 0; i < pokemon.length; i++) {
            if (pokemon[i] == null) {
                pokemon[i] = poke;
                break;
            }
        }
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (Pokemon poke : pokemon) {
            if (poke != null) {
                builder.append("- ").append(poke).append("\n");
            }
        }
        return builder.toString();
    }

    public Pokemon[] getPokemon() {
        return pokemon;
    }
}
