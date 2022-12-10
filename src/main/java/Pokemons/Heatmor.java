package Pokemons;

import Moves.SpecialMoves.Inferno;
import Moves.StatusMoves.Amnesia;
import Moves.StatusMoves.Confide;
import Moves.StatusMoves.WillOWisp;
import ru.ifmo.se.pokemon.*;

public class Heatmor extends Pokemon{
    public Heatmor(String name, int level) {
        super(name, level);
        this.setStats(85, 97, 66, 105, 66, 65);
        this.setType(Type.FIRE);
        this.setMove(new Inferno(), new Amnesia(), new Confide(), new WillOWisp());
    }

}