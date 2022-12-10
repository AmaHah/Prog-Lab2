package Moves.SpecialMoves;

import ru.ifmo.se.pokemon.*;

public class MegaDrain extends SpecialMove {
    public MegaDrain() {
        super(Type.GRASS, 40, 100);
    }
    @Override
    protected void applySelfDamage(Pokemon att, double damage) {
        att.setMod(Stat.HP, -(int) Math.round(damage) / 2);
    }
    @Override
    protected String describe() {
        return "применяет MegaDrain";
    }
}
