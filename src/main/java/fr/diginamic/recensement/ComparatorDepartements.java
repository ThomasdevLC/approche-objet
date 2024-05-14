package fr.diginamic.recensement;
import java.util.Comparator;

	public class ComparatorDepartements implements Comparator<Departement> {
	    @Override
	    public int compare(Departement DepartementA, Departement DepartementB) {
	        return Integer.compare(DepartementB.getPopulationDepartement(), DepartementA.getPopulationDepartement());
	    }
}

