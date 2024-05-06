package fr.diginamic.operations;


public class CalculMoyenne {
    
	  private double[] tableau;
	  private int index;

	  public CalculMoyenne() {
	        tableau = new double[10]; 
	        index = 0; 
	    }

	  public void ajout(double valeur) {
	        if (index == tableau.length) {
	            double[] nouveauTableau = new double[tableau.length * 2]; 
	            for (int i = 0; i < index; i++) {
	                nouveauTableau[i] = tableau[i];
	            }
	            tableau = nouveauTableau;
	        }
	        tableau[index] = valeur; 
	        index++; 
	    }
	    
	  public double calcul() {
	        double somme = 0.0;
	        for (int i = 0; i < index; i++) {
	            somme += tableau[i];
	        }
	        return somme / index; 
	    }
}
