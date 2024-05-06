package fr.diginamic.jdr;

import java.util.Random;

public class Gobelin extends Creature {

    public Gobelin() {
        super(0, 0, "Gobelin");
        genererForce();
        genererPointsDeVie();
    }

    @Override
    public int genererForce() {
        Random rand = new Random();
        int force = rand.nextInt(6) + 5;
        setForce(force);
        return force;
    }

    @Override
    public int genererPointsDeVie() {
        Random rand = new Random();
        int pointsDeVie = rand.nextInt(6) + 10;
        setPointsDeVie(pointsDeVie);
        return pointsDeVie;
    }
}