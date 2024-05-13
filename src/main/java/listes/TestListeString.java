package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestListeString {

	public static void main(String[] args) {
		  ArrayList<String> liste = new ArrayList<>();
		    Collections.addAll(liste, "Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes");
		    
		   String villeMax = liste.get(0);	    
		    for (String ville : liste) {
		    	if(ville.length() > villeMax.length()) {
		    		villeMax = ville;
		    	}
	        }
	    	System.out.println(villeMax);
	    	
	    	
	    	int index = 0;
	    	for (String ville : liste) {
	    	    liste.set(index, ville.toUpperCase());
	    	    index++;
	    	}
	    	
	    	Iterator<String> iter = liste.iterator();
	    	while (iter.hasNext()) {
	    	    String ville = iter.next();
	    	    if (ville.startsWith("N")) {
	    	    	iter.remove();
	    	    }
	    	}
	    	System.out.println(liste);

	}		    
}
