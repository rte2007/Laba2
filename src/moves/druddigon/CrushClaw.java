package moves.druddigon;

import ru.ifmo.se.pokemon.*;

public final class CrushClaw extends PhysicalMove {

    public CrushClaw(double pow, double acc) {
        super(Type.NORMAL, pow, acc);

    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        Effect e = new Effect().chance(0.5).stat(Stat.DEFENSE, -1);

        p.addEffect(e);
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");

        return "does " + pieces[pieces.length-1];
    }
}
