package moves.druddigon;

import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.PhysicalMove;

public final class DragonClaw extends PhysicalMove {

    public DragonClaw(double pow, double acc) {
        super(Type.DRAGON, pow, acc);

    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");

        return "does " + pieces[pieces.length-1];
    }
}
