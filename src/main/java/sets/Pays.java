package sets;

public class Pays {

	private String nom;
    private int nbHabitants;
    private double pibParHabitant;
    
    public Pays(String nom, int nbHabitants, double pibParHabitant) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
        this.pibParHabitant = pibParHabitant;
    }
    
    public String getNom() {
        return nom;
    }
    
    public int getNbHabitants() {
        return nbHabitants;
    }
    
    public double getPibParHabitant() {
        return pibParHabitant;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }  
    
    public double pibTotal() {
        return nbHabitants * pibParHabitant;
    }

	@Override
	public String toString() {
		return "Pays nom = " + nom + ", nbHabitants = " + nbHabitants + ", pibParHabitant = " + pibParHabitant; 
	}
    
    
}
