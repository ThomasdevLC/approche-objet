package maps;
import java.util.ArrayList;
import java.util.HashMap;

public class ComptagePaysParContinent {
    
    public static void main(String[] args) {

    		ArrayList<Pays> listePays = new ArrayList<>();
            
            listePays.add(new Pays("France", 65000000, "Europe"));
            listePays.add(new Pays("Allemagne", 80000000, "Europe"));
            listePays.add(new Pays("Belgique", 10000000, "Europe"));
            listePays.add(new Pays("Russie", 150000000, "Asie"));
            listePays.add(new Pays("Chine", 1400000000, "Asie"));
            listePays.add(new Pays("Indonésie", 220000000, "Océanie"));
            listePays.add(new Pays("Australie", 20000000, "Océanie"));
            
    		HashMap<String, Integer> mapPays = new HashMap<>(); 
    		
            for (Pays pays : listePays) {
            	if(mapPays.containsKey(pays.getContinent())) {
            		   int count = mapPays.get(pays.getContinent());
            		   mapPays.put(pays.getContinent(), count + 1);
            	}
            	else {  mapPays.put( pays.getContinent(), 1);
}
            }
            
            for (String continent : mapPays.keySet()) {
        		System.out.println(continent + " " + mapPays.get(continent)) ;
        		}
    	}
}