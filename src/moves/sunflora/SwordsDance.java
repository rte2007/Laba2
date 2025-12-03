package moves.sunflora;

import ru.ifmo.se.pokemon.*;

public final class SwordsDance extends StatusMove {
    public SwordsDance(double pow, double acc) {
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);

        Effect e = new Effect().stat(Stat.ATTACK, 2);
        p.addEffect(e);

    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");

        return "does " + pieces[pieces.length - 1];
    }
}
