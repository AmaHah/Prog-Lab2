package Pokemons;

import Moves.StatusMoves.Rest;

public class Roserade extends Roselia{
    public Roserade(String name, int level){
        super(name, level);
        super.setStats(60, 70, 65, 125, 105, 90);
        super.addMove(new Rest());
    }
}
