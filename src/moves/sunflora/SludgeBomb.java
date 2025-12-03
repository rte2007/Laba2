package moves.sunflora;

import ru.ifmo.se.pokemon.*;

public final class SludgeBomb extends SpecialMove {
    public SludgeBomb(double pow, double acc) {
        super(Type.POISON, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        if(Lab2.Program.chance(0.3)) {
            switch (p.getTypes().toString()) {
                case "[POISON]", "[STEEL]" -> {
                }
                default -> Effect.poison(p);
            }
        }
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");

        return "does " + pieces[pieces.length-1];
    }


}
