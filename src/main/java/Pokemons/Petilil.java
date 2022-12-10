package Pokemons;

import Moves.SpecialMoves.DreamEater;
import Moves.SpecialMoves.MegaDrain;
import Moves.StatusMoves.Growth;
import ru.ifmo.se.pokemon.*;

public class Petilil extends Pokemon {
    public Petilil(String name, int level) {
        super(name, level);
        this.setStats(45, 35, 50, 70, 50, 30);
        this.setType(Type.GRASS);
        this.setMove(new MegaDrain(), new DreamEater(), new Growth());
    }
}
