package Pokemons;

import Moves.PhysicalMoves.BulletSeed;

public class Roselia extends Budew{
    public Roselia(String name, int level) {
        super(name, level);
        super.setStats(50, 60, 45, 100, 80, 65);
        super.addMove(new BulletSeed());
    }
}
