package moves.poliwrath;

import ru.ifmo.se.pokemon.*;

public final class IceBeam extends SpecialMove {

    public IceBeam(double pow, double acc) {
        super(Type.ICE, pow, acc);

    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        if(Lab2.Program.chance(0.1)) {
            Effect.freeze(p);
        }

    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");

        return "does " + pieces[pieces.length-1];
    }
}
