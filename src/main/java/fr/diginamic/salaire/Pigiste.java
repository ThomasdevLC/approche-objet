package fr.diginamic.salaire;

public class Pigiste extends Intervenant {
	
    int nbreJours;
    double salaireJournalier;


	public Pigiste(String nom, String prenom, int nbreJours, double salaireJournalier) {
        super(nom, prenom);    
        this.nbreJours =  nbreJours;
        this.salaireJournalier =  salaireJournalier; 
    }
	
	 @Override
	    public double getSalaire() {
	        return nbreJours * salaireJournalier;
	    }
	 
	   @Override
	    public String getStatus() {
	        return "pigiste";
	    }

	   @Override
	    public String toString() {
	        return super.toString();
	    }
	   
	    @Override
	    public String afficherDonnees() {
	        return toString() +  " a un salaire  de " + getSalaire() + " euros." + " Il est : " + getStatus();
	    }
}