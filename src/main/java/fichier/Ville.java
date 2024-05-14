package fichier;

public class Ville implements Comparable<Ville> {
    private String nom;
    private String codeDepartement;
    private String nomRegion;
    private int populationTotale;

    public Ville(String nom, String codeDepartement, String nomRegion, int populationTotale) {
        this.nom = nom;
        this.codeDepartement = codeDepartement;
        this.nomRegion = nomRegion;
        this.populationTotale = populationTotale;
    }

  //public int compareTo(Ville autre) {
//  if (populationTotale > autre.getPopulationTotale()) {
//      return -1;
//  } else if (populationTotale < autre.getPopulationTotale()) {
//      return 1;
//  }
//  
//  return 0;
//}
    
    public int compareTo(Ville autre) {
        return nom.compareTo(autre.getNom());
    }

    
	@Override
	public String toString() {
		return  nom + ";"  + codeDepartement + ";" + nomRegion + ";" + populationTotale;
	}

	public int getPopulationTotale() {
		return populationTotale;
	}

	public String getNom() {
		return nom;
	}

}
