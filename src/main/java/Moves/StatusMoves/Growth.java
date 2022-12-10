package Moves.StatusMoves;

import ru.ifmo.se.pokemon.*;

public class Growth extends StatusMove {
    public Growth() {
        super(Type.NORMAL, 0, 100);
    }
    @Override
    protected void applySelfEffects(Pokemon att) {
        att.setMod(Stat.ATTACK, 1);
        att.setMod(Stat.SPECIAL_ATTACK, 1);
    }
    @Override
    protected String describe() {
        return "применяет Growth";
    }
}