package Moves.StatusMoves;

import ru.ifmo.se.pokemon.*;

public class WillOWisp extends StatusMove {
    public WillOWisp() {
        super(Type.FIRE, 0, 85);
    }
    @Override
    protected void applyOppEffects(Pokemon def) {
        Effect.burn(def);
    }
    @Override
    protected String describe() {
        return "применяет Will-O-Wisp";
    }
}
