package pokemons;

import moves.poliwrath.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Poliwhirl extends Pokemon{

    public Poliwhirl(String name, int level) {
        super(name, level);

        super.setType(Type.WATER);
        super.setStats(65, 65, 65, 50, 50, 90);

        IceBeam iceBeam = new IceBeam(90, 100);
        BubbleBeam bubbleBeam = new BubbleBeam(65, 100);
        HydroPump hydroPump = new HydroPump(110, 80);

        super.setMove(iceBeam, bubbleBeam, hydroPump);
    }
}
