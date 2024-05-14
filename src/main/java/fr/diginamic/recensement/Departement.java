package fr.diginamic.recensement;

public class Departement {
	
	 private String codeDepartement;
	 private int populationDepartement;

	 
	 public Departement(String codeDepartement, int populationDepartement) {
	        this.codeDepartement = codeDepartement;
	        this.populationDepartement = populationDepartement;
	    }


	public String getCodeDepartement() {
		return codeDepartement;
	}


	public int getPopulationDepartement() {
		return populationDepartement;
	}


	public void setPopulationDepartement(int populationDepartement) {
		this.populationDepartement = populationDepartement;
	}
}
