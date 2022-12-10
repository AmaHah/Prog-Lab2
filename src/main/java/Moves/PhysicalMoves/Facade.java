package Moves.PhysicalMoves;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70, 100);
    }
    @Override
    protected double calcBaseDamage(Pokemon att, Pokemon def) {
        if (att.getCondition() == Status.BURN || att.getCondition() == Status.POISON || att.getCondition() == Status.PARALYZE) {
            return (0.4 * (double) (att.getLevel()) + 2.0) * this.power * 2 / 150.0;
        }
        else {
            return (0.4 * (double) att.getLevel() + 2.0) * this.power / 150.0;
        }
    }
    @Override
    protected String describe() {
        return "применяет Facade";
    }
}
