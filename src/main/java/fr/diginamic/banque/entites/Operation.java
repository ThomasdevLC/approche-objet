package fr.diginamic.banque.entites;

public abstract class Operation {

    private String date;
    private int montant;

    public Operation(String date, int montant) {
        this.date = date;
        this.montant = montant;
    }

    
    public abstract String getType();

    @Override
    public String toString() {
        return "Operation [date=" + date + ", montant=" + montant + "]" + getType();
    }


	public String getDate() {
		return date;
	}


	public int getMontant() {
		return montant;
	}

}
