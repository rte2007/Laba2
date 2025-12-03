package pokemons;


import moves.sunflora.BulletSeed;
import moves.sunflora.DoubleTeam;
import moves.sunflora.SludgeBomb;
import moves.sunflora.SwordsDance;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Sunkern extends Pokemon{

    public Sunkern(String name, int level) {
        super(name, level);

        super.setType(Type.GRASS);
        super.setStats(30, 30, 30, 30, 30, 30);

        SludgeBomb sludgeBomb = new SludgeBomb(90, 100);
        SwordsDance swordsDance = new SwordsDance(0, 0);
        DoubleTeam doubleTeam = new DoubleTeam(0, 0);

        super.setMove(sludgeBomb, swordsDance, doubleTeam);
    }
}
