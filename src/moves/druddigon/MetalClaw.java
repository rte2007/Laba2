package moves.druddigon;

import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;

public final class MetalClaw extends PhysicalMove {

    public MetalClaw(double pow, double acc) {
        super(Type.STEEL, pow, acc);

    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);

        Effect RaiseStrange = new Effect().chance(0.1).stat(Stat.ATTACK, 1);

        p.addEffect(RaiseStrange);



    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");

        return "does " + pieces[pieces.length-1];
    }
}
