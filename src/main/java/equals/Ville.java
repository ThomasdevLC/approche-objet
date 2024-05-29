package equals;

	import java.util.Objects;


	public class Ville {

		private String nom;
	    private int population;

	    /**
	     * @param nom
	     * @param population
	     */
	    public Ville(String nom, int population) {
	        this.nom = nom;
	        this.population = population;
	    }

	    
	    @Override
	    public boolean equals(Object obj) {
	     
	        // Vérification si l'objet passé en paramètre est une instance de la classe Ville
	        if (!(obj instanceof Ville)) {
	            return false;
	        }
	        // Cast  de l'objet passé en paramètre en un objet de type Ville
	        Ville autreVille = (Ville) obj;
	        
	        // Comparaison des attributs nom et population
	        // Objects.equals prend en compte le cas des attributs null
	        return Objects.equals(nom, autreVille.nom) &&  Objects.equals(population, autreVille.population);
	    }
	}



