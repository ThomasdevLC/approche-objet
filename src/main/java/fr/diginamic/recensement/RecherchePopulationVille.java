package fr.diginamic.recensement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class RecherchePopulationVille extends MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) throws IOException {
    	recensement.lireFichier();
    	ArrayList<Ville> villes = recensement.getVille();
    	
        System.out.print("Ecrire un nom de commune: ");
       
        String nomCommune = scanner.next();
        boolean villeExiste = false;
        
    	for (Ville ville : villes) {
            if(ville.getNomCommune().equalsIgnoreCase(nomCommune)) {
            	ville.getPopulationTotale();
            	villeExiste = true;
            	System.out.println("population de la ville " + nomCommune + ": "  + ville.getPopulationTotale());
            }
        }
    	
    	 if (!villeExiste) {
             System.out.println("La ville " + nomCommune + " n'existe pas.");
         }
    }
}
