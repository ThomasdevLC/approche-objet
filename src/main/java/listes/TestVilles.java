package listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestVilles {

	public static void main(String[] args) {
		
        List<Ville> listeVilles = new ArrayList<>();
        
        listeVilles.add(new Ville("Narbonne", 53400, Continent.EUROPE));
        listeVilles.add(new Ville("Lyon", 484000, Continent.EUROPE));
        listeVilles.add(new Ville("Foix", 9700, Continent.EUROPE));
        listeVilles.add(new Ville("Pau", 77200, Continent.EUROPE));
        listeVilles.add(new Ville("Marseille", 850700, Continent.EUROPE));
        listeVilles.add(new Ville("Tarbes", 40600, Continent.EUROPE));

        Ville villeMax = listeVilles.get(0);
    	Ville villeMin = listeVilles.get(0); 

	    for (Ville ville : listeVilles) {
	    	if(ville.getHabitants() > villeMax.getHabitants()) {
	    		villeMax = ville;
	    	}
        }
    	System.out.println(villeMax.toString());
    	
    	
   	    for (Ville ville : listeVilles) {
   	    	if(ville.getHabitants() < villeMin.getHabitants()) {
   	    		villeMin = ville;
   	    	}
           }
       	System.out.println(villeMin.toString());
       	
       	Iterator<Ville> it = listeVilles.iterator();
       	while(it.hasNext()) {
       	    Ville item = it.next();
       	    if (item.equals(villeMin)) {
       	        it.remove(); 
       	    }     
       	}
       	
   	    for (Ville ville : listeVilles) {	
   	    	if(ville.getHabitants() > 100000) {
   	         ville.setNom(ville.getNom().toUpperCase());
	    	}
           }
    	System.out.println(listeVilles);
	}
}
