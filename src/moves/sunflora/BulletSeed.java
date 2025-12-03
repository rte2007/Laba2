package moves.sunflora;

import ru.ifmo.se.pokemon.*;

public final class BulletSeed extends PhysicalMove {
    public BulletSeed(double pow, double acc) {
        super(Type.GRASS, pow, acc);
    }

    @Override
    protected void applyOppDamage(Pokemon opp, double damage) {

        // Каноническое распределение:
        // 2 удара — 3/8
        // 3 удара — 3/8
        // 4 удара — 1/8
        // 5 удара — 1/8
        int r = (int)(Math.random() * 8);
        int hits;

        if (r < 3) {          // 0,1,2 → 3/8
            hits = 2;
        } else if (r < 6) {   // 3,4,5 → 3/8
            hits = 3;
        } else if (r == 6) {  // 6 → 1/8
            hits = 4;
        } else {              // 7 → 1/8
            hits = 5;
        }

        // Каждый удар — отдельная атака
        for (int i = 0; i < hits; i++) {
            if (opp.getHP() <= 0) break;

            // вызываем базовый урон за 1 удар:
            super.applyOppDamage(opp, damage);
        }
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");

        return "does " + pieces[pieces.length - 1] + " " + hits + " times!";
    }
}
