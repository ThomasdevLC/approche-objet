package fr.diginamic.recensement;
import java.util.Comparator;

public class ComparatorVilles  implements Comparator<Ville> {
	    @Override
	    public int compare(Ville VilleA, Ville VilleB) {
	        return Integer.compare(VilleB.getPopulationTotale(), VilleA.getPopulationTotale());
	    }
}
