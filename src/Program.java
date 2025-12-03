package Lab2;

import pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Program {

    //https://pokemondb.net/pokedex/druddigon
    //https://pokemondb.net/pokedex/sunkern
    //https://pokemondb.net/pokedex/sunflora
    //https://pokemondb.net/pokedex/poliwag
    //https://pokemondb.net/pokedex/poliwhirl
    //https://pokemondb.net/pokedex/poliwrath

    public static void main(String[] args) {

        Battle b = new Battle();
        Sunflora p1 = new Sunflora("Mikasa Ackerman", 1);
        Druddigon p2 = new Druddigon("Levi Ackerman", 1);
        Sunkern p3 = new Sunkern("Eren Yeager", 1);
        PoliWrath p4 = new PoliWrath("Reiner Braun", 1);
        Poliwag p5 = new Poliwag("Zik Eger", 1);
        Poliwhirl p6  = new Poliwhirl("Pieck Finger", 1);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);

        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);

        b.go();

    }

    public static boolean chance(double d) {
        return d > Math.random();
    }
}
