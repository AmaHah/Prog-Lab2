package Moves.SpecialMoves;

import ru.ifmo.se.pokemon.*;

public class Inferno extends SpecialMove {
    public Inferno() {
        super(Type.FIRE, 100, 50);
    }

    @Override
    protected void applyOppEffects(Pokemon def) {
        Effect.burn(def);
    }
    @Override
    protected String describe() {
        return "применяет Inferno";
    }
}
