package moves.poliwrath;

import ru.ifmo.se.pokemon.*;

public final class Hypnosis extends StatusMove {

    public Hypnosis(double pow, double acc) {
        super(Type.PSYCHIC, pow, acc);

    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        // случайная длительность сна 1–3 хода
        int turns = 1 + (int) (Math.random() * 3); // 1, 2 или 3

        Effect sleep = new Effect().condition(Status.SLEEP).turns(turns);

        p.setCondition(sleep);
    }

    @Override
    protected String describe() {
        return "использует Hypnosis и усыпляет противника";
    }
}
