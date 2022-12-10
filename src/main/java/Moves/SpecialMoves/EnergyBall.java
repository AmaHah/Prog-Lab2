package Moves.SpecialMoves;

import ru.ifmo.se.pokemon.*;

public class EnergyBall extends SpecialMove {
    public EnergyBall() {
        super(Type.GRASS, 90, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon def) {
        Effect e = new Effect().chance(0.1).turns(0).stat(Stat.SPECIAL_DEFENSE, -1);
        def.addEffect(e);
    }
    @Override
    protected String describe() {
        return "применяет Energy Ball";
    }
}
