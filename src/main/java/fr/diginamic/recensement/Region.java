package fr.diginamic.recensement;

public class Region {
	
	 private String nomRegion;
	 private int populationRegion;

	 
	 public Region(String nomRegion, int populationRegion) {
	        this.nomRegion = nomRegion;
	        this.populationRegion = populationRegion;
	    }


	public String getNomRegion() {
		return nomRegion;
	}


	public int getPopulationRegion() {
		return populationRegion;
	}


	public void setPopulationRegion(int populationRegion) {
		this.populationRegion = populationRegion;
	}



}
