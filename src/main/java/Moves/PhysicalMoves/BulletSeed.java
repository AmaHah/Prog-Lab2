package Moves.PhysicalMoves;

import ru.ifmo.se.pokemon.*;

import java.util.Random;

public class BulletSeed extends PhysicalMove {
    public BulletSeed() {
        super(Type.GRASS, 25, 100);
        super.hits = 2 + new Random().nextInt(4);
    }
    @Override
    protected String describe() {
        return "применяет Bullet Seed";
    }
}
