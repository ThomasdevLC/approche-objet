package listes;

public class Ville {
	
	private String nom  ;
	private int habitants ;
	
	
	public Ville(String nom, int habitants) {
		this.nom = nom;
		this.habitants = habitants;
	}


	public String getNom() {
		return nom;
	}


	public int getHabitants() {
		return habitants;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public void setHabitants(int habitants) {
		this.habitants = habitants;
	}


	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", habitants=" + habitants + "]";
	}
	
	

}
