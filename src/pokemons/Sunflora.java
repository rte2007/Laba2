package pokemons;


import moves.sunflora.BulletSeed;
import moves.sunflora.DoubleTeam;
import moves.sunflora.SludgeBomb;
import moves.sunflora.SwordsDance;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Sunflora extends Pokemon{

    public Sunflora(String name, int level) {
        super(name, level);

        super.setType(Type.GRASS);
        super.setStats(75, 75, 55, 105, 85, 30);

        SludgeBomb sludgeBomb = new SludgeBomb(90, 100);
        SwordsDance swordsDance = new SwordsDance(0, 0);
        DoubleTeam doubleTeam = new DoubleTeam(0, 0);
        BulletSeed bulletSeed = new BulletSeed(25, 100);

        super.setMove(sludgeBomb, swordsDance, doubleTeam, bulletSeed);
    }
}
