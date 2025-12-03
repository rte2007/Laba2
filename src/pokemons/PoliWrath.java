package pokemons;

import moves.poliwrath.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class PoliWrath extends Pokemon{

    public PoliWrath(String name, int level) {
        super(name, level);

        super.setType(Type.WATER,Type.FIGHTING);
        super.setStats(90, 95, 95, 70, 90, 70);

        IceBeam iceBeam = new IceBeam(90, 100);
        BubbleBeam bubbleBeam = new BubbleBeam(65, 100);
        HydroPump hydroPump = new HydroPump(110, 80);
        Hypnosis hypnosis = new Hypnosis(0, 60);

        super.setMove(iceBeam, bubbleBeam, hydroPump, hypnosis);
    }
}
