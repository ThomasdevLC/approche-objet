package fr.diginamic.formes;

public class Carre extends Forme {
    private double longueur;

    public Carre(double longueur) {
        this.longueur = longueur;
    }

    @Override
    public double calculerSurface() {
        return longueur * longueur;
    }

    @Override
    public double calculerPerimetre() {
        return 4 * longueur;
    }
}
