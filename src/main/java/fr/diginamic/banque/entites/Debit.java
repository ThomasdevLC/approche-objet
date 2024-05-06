package fr.diginamic.banque.entites;

public class Debit extends Operation {

	public Debit(String date, int montant) {
		super(date, montant);
		// TODO Auto-generated constructor stub
	}
	
	
	public double calculTotal(double total) {
		return total-getMontant();
	}	
		

	  @Override
	    public String getType() {
	        return "DEBIT";
	    }

	@Override
	public String toString() {
		return "Debit [getType()=" + getType() + "]";
	}
	
}
