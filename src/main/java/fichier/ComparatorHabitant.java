package fichier;
import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Ville> {
    @Override
    public int compare(Ville villeA, Ville villeB) {
        return Integer.compare(villeB.getPopulationTotale(), villeA.getPopulationTotale());
    }
}