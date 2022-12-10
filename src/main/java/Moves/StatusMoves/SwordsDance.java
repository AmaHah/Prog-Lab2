package Moves.StatusMoves;

import ru.ifmo.se.pokemon.*;

public class SwordsDance extends StatusMove {
    public SwordsDance() {
        super(Type.NORMAL, 0, 100);
    }
    @Override
    protected void applySelfEffects(Pokemon att) {
        att.setMod(Stat.ATTACK, 2);
    }
    @Override
    protected String describe() {
        return "применяет Swords Dance";
    }
}
