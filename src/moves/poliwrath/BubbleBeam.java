package moves.poliwrath;

import ru.ifmo.se.pokemon.*;

public final class BubbleBeam extends SpecialMove {

    public BubbleBeam(double pow, double acc) {
        super(Type.WATER, pow, acc);

    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        if(Lab2.Program.chance(0.1)) {
            Effect e = new Effect().stat(Stat.SPEED, -1);

            p.addEffect(e);
        }

    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");

        return "does " + pieces[pieces.length-1];
    }
}
