package fr.diginamic.jdr;

public abstract class Creature {
    
    private int force;
    private int pointsDeVie;
    private String nom;

    public Creature(int force, int pointsDeVie, String nom) {
        this.force = force;
        this.pointsDeVie = pointsDeVie;
        this.nom = nom;
    }
    
    public abstract int genererForce();
    public abstract int genererPointsDeVie();
    
    public int getForce() {
        return force;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public String getNom() {
        return nom;
    }

	public void setForce(int force) {
		this.force = force;
	}

	public void setPointsDeVie(int pointsDeVie) {
		this.pointsDeVie = pointsDeVie;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
    
    
}
