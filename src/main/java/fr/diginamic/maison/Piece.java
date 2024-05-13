package fr.diginamic.maison;

public abstract class Piece {
	
	private int etage;
	private double superficie;
	
	public Piece(int etage, double superficie) {
		this.etage = etage;
		this.superficie = superficie;
	}
	
    public abstract String getType();
	
	public boolean etageValide() {
	        return (this.etage == 0 || this.etage == 1);
	}

	public boolean superficieValide() {
	        return (this.superficie >= 0);
	}

	public boolean donneesPieceValides() {
	        return etageValide() && superficieValide();
	}

	public int getEtage() {
		return etage;
	}

	public double getSuperficie() {
		return superficie;
	}

	@Override
	public String toString() {
		return "Piece : "  + getType() + " étage = "+ etage + ", superficie = " + superficie;
	}

}
