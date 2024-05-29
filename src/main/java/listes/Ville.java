package listes;

public class Ville {
	
	private String nom  ;
	private int habitants ;
	private Continent continent ;

	
	
	public Ville(String nom, int habitants, Continent continent) {
		this.nom = nom;
		this.habitants = habitants;
		this.continent = continent;
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


	/**
	 * @return the continent
	 */
	public Continent getContinent() {
		return continent;
	}


	/**
	 * @param continent the continent to set
	 */
	public void setContinent(Continent continent) {
		this.continent = continent;
	}


	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", habitants=" + habitants + ", continent=" + continent + "]";
	}

}
