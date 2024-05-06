package fr.diginamic.jdr;

import java.util.Random;

public class Troll extends Creature {

    public Troll() {
        super(0, 0, "Troll"); 
        genererForce();
        genererPointsDeVie();
    }

    @Override
    public int genererForce() {
        Random rand = new Random();
        int force = rand.nextInt(6) + 10; 
        setForce(force); 
        return force;
    }

    @Override
    public int genererPointsDeVie() {
        Random rand = new Random();
        int pointsDeVie = rand.nextInt(11) + 20; 
        setPointsDeVie(pointsDeVie);
        return pointsDeVie;
    }
}
