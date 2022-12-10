package Moves.StatusMoves;

import ru.ifmo.se.pokemon.*;

public class Amnesia extends StatusMove{
    public Amnesia() {
        super(Type.PSYCHIC, 100, 100);
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        p.addEffect(new Effect().stat(Stat.SPECIAL_DEFENSE, 2));
    }

    @Override
    protected String describe() {
        return "применяет Amnesia";
    }
}
