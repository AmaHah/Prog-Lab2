package Pokemons;

import Moves.StatusMoves.SwordsDance;

public class Lilligant extends Petilil{
    public Lilligant(String name, int level) {
        super(name, level);
        super.setStats(70, 65, 70, 110, 75, 90);
        super.addMove(new SwordsDance());
    }
}
