package moves.druddigon;

import ru.ifmo.se.pokemon.*;

import static ru.ifmo.se.pokemon.Stat.HP;

public final class Rest extends StatusMove {

    public Rest(double pow, double acc) {
        super(Type.PSYCHIC, pow, acc);

    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);

        p.setMod(Stat.HP, (int)(p.getHP() - p.getStat(Stat.HP))); // full heal (now - max)

        Effect e = new Effect().condition(Status.SLEEP).turns(2);     // сон строго на 2 хода
        p.addEffect(e);

    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");

        return "does " + pieces[pieces.length-1];
    }
}
