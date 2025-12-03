package pokemons;

import moves.druddigon.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Druddigon extends Pokemon{

    public Druddigon(String name, int level) {
        super(name, level);

        super.setType(Type.DRAGON);
        super.setStats(77, 120, 90, 60, 90, 48);

        Rest rest = new Rest(0, 0);
        MetalClaw metalClaw = new MetalClaw(50, 95);
        DragonClaw dragonClaw = new DragonClaw(80, 100);
        CrushClaw crushClaw = new CrushClaw(75, 95);



        super.setMove(metalClaw, dragonClaw, crushClaw, rest);
    }
}
