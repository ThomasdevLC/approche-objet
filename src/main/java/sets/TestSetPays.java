package sets;

import java.util.HashSet;
import java.util.Iterator;

public class TestSetPays {

    public static void main(String[] args) {
    	
    	HashSet<Pays> paysSet = new HashSet<>();
        
        paysSet.add(new Pays("USA", 331002651, 65297));
        paysSet.add(new Pays("France", 65273511, 45283));
        paysSet.add(new Pays("Allemagne", 83783942, 54887));
        paysSet.add(new Pays("UK", 67886011, 42943));
        paysSet.add(new Pays("Italie", 60461826, 35220));
        paysSet.add(new Pays("Japon", 126476461, 40249));
        paysSet.add(new Pays("Chine", 1439323776, 10742));
        paysSet.add(new Pays("Russie", 145934462, 11207));
        paysSet.add(new Pays("Inde", 1380004385, 2104));
        
        double pibParHabitantMax = 0.0;
        String nomPibHabitMax = ""; 
        
        double pibTotalMax = 0.0;
        String paysPibMax = ""; 
        
        double pibTotalMin = Double.MAX_VALUE;
        String paysPibMin = ""; 

        Iterator<Pays> iter = paysSet.iterator();
        while (iter.hasNext()) {
        	Pays pays = iter.next();
            if (pays.getPibParHabitant() > pibParHabitantMax) { 
            	pibParHabitantMax = pays.getPibParHabitant();
            	nomPibHabitMax = pays.getNom();
            }
            if (pays.pibTotal() > pibTotalMax) { 
            	pibTotalMax = pays.pibTotal();
            	paysPibMax = pays.getNom();
            }
            
            if (pays.pibTotal() < pibTotalMin) { 
            	pibTotalMin = pays.pibTotal();
            	paysPibMin = pays.getNom();
            	pays.setNom(pays.getNom().toUpperCase());
            	//iter.remove();
            }  
        }
        
        System.out.println("Pays avec le PIB/habitant le plus important  : " + nomPibHabitMax + " " + pibParHabitantMax );
        System.out.println("Pays avec le PIB le plus important  : " + paysPibMax + " " + pibTotalMax );
        System.out.println("Pays avec le PIB le plus faible  : " + paysPibMin  );
        
        System.out.println("---------LISTE PAYS -------------"  );
        for (Pays pays : paysSet) {
        System.out.println(pays.toString());	 
        }

    }
}
