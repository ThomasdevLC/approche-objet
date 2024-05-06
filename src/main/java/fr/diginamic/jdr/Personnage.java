package fr.diginamic.jdr;

import java.util.Random;

public class Personnage {
    private int force;
    private int pointsDeVie;
    private int score;

    public Personnage() {
        this.force = randomForce(); 
        this.pointsDeVie = randomPointsDeVie(); 
        this.score = 0;
    }

    private int randomForce() {
        Random rand = new Random();
        int force = rand.nextInt(7) + 12;
        return force;
    }

    private int randomPointsDeVie() {
        Random rand = new Random();
        int pointsDeVie = rand.nextInt(31) + 20; 
        return pointsDeVie;
    }

    public int getForce() {
        return force;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public int getScore() {
        return score;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

