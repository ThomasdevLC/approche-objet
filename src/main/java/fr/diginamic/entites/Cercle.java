package fr.diginamic.entites;

public class Cercle {
	
	  private double rayon;

	public Cercle(double rayon) {
		this.rayon = rayon;
	}
	
	  // Méthode pour retourner le périmètre du cercle
    public double perimetre() {
        return 2 * Math.PI * rayon;
    }

    // Méthode pour retourner la surface du cercle
    public double surface() {
        return Math.PI * rayon * rayon;
    }

	@Override
	public String toString() {
		return "Cercle [rayon=" + rayon + ", perimetre()=" + perimetre() + ", surface()=" + surface() + "]";
	} 

}
