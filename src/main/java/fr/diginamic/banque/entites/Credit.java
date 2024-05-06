package fr.diginamic.banque.entites;

public class Credit extends Operation {

	public Credit (String date, int montant) {
		super(date, montant);
		// TODO Auto-generated constructor stub
		
	}

public double calculTotal(double total) {
	return total+getMontant();
}	
	
	  @Override
	    public String getType() {
	        return "CREDIT";
	    }

	@Override
	public String toString() {
		return "Credit [getType()=" + getType() + "]";
	}
	
}
