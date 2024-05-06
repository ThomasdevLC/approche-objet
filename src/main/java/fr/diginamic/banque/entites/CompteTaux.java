package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
	
	private double taux;

	public CompteTaux(int numeroCompte, int soldeCompte, double taux ) {
		super(numeroCompte, soldeCompte);
		
		this.taux= taux;
	}

	public double getTaux() {
		return taux;
	}

	
	@Override
    public String toString() {
        return super.toString() + ", tauxRémunération = " + taux;
    }
	
}
