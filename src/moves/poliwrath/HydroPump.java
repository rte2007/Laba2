package moves.poliwrath;

import ru.ifmo.se.pokemon.*;

public final class HydroPump extends SpecialMove {

    public HydroPump(double pow, double acc) {
        super(Type.WATER, pow, acc);

    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");

        return "does " + pieces[pieces.length-1];
    }
}
