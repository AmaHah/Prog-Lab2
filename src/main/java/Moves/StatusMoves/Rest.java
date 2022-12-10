package Moves.StatusMoves;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC, 0, 1);
    }
    @Override
    protected void applySelfEffects(Pokemon att) {
        Effect e = new Effect().condition(Status.SLEEP).turns(2);
        att.addEffect(e);
        att.setMod(Stat.HP, -(int) (att.getStat(Stat.HP) - att.getHP()));
    }
    @Override
    protected String describe() {
        return "применяет Rest";
    }
}
