package fr.diginamic.jdr;

import java.util.Random;

public class Loup extends Creature {

    public Loup() {
        super(0, 0, "Loup");
        genererForce();
        genererPointsDeVie();
    }

    @Override
    public int genererForce() {
        Random rand = new Random();
        int force = rand.nextInt(6) + 3;
        setForce(force);
        return force;
    }

    @Override
    public int genererPointsDeVie() {
        Random rand = new Random();
        int pointsDeVie = rand.nextInt(6) + 5;
        setPointsDeVie(pointsDeVie);
        return pointsDeVie;
    }
}

