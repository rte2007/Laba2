package pokemons;

import moves.poliwrath.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Poliwag extends Pokemon{

    public Poliwag(String name, int level) {
        super(name, level);

        super.setType(Type.WATER);
        super.setStats(40, 50, 40, 40, 40, 90);

        IceBeam iceBeam = new IceBeam(90, 100);
        BubbleBeam bubbleBeam = new BubbleBeam(65, 100);

        super.setMove(iceBeam, bubbleBeam);
    }
}
