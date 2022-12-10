package Moves.SpecialMoves;

import ru.ifmo.se.pokemon.*;

public class DreamEater extends SpecialMove {
    private boolean damageDealt = false;
    public DreamEater() {
        super(Type.PSYCHIC, 100, 100);
    }
    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        if (def.getCondition() == Status.SLEEP) {
            def.setMod(Stat.HP, (int) Math.round(damage));
            damageDealt = true;
        }
    }
    @Override
    protected void applySelfDamage(Pokemon att, double damage) {
        if (damageDealt) {
            att.setMod(Stat.HP, -(int) Math.round(damage) / 2);
            damageDealt = false;
        }
    }
    @Override
    protected String describe() {
        return "применяет Dream Eater";
    }
}
