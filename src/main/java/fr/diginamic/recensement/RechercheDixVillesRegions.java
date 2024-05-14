package fr.diginamic.recensement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RechercheDixVillesRegions extends MenuService {

	@Override
    public void traiter(Recensement recensement, Scanner scanner) throws IOException {
    	recensement.lireFichier();
    	ArrayList<Ville> villes = recensement.getVille();
    	
        List<Ville> listeVilles = new ArrayList<>();
    	
        System.out.print("Ecrire un code de région: ");
       
        String codeRegion = scanner.next();
        String nomRegion = "";
        boolean regionExiste = false;

    	for (Ville ville : villes) {
            if(ville.getCodeRegion().equals(codeRegion) ) {
            	regionExiste = true;
            	listeVilles.add(ville);          
            	}
        }
    	
    	 if (!listeVilles.isEmpty()) { 
    	  nomRegion = listeVilles.get(0).getNomRegion();
          Collections.sort(listeVilles, new ComparatorVilles());}
      
    	if (!regionExiste) {
            System.out.println("La région " + codeRegion + " n'existe pas.");}
        else {
        System.out.println("10 Villes les plus peuplées de la Région : " + nomRegion);
       
    	 for (int i = 0; i <= 9; i++) {
    		 Ville ville = listeVilles.get(i);
         	System.out.println((i+1)+ " - "+ ville.getNomCommune() + " - Population : " + ville.getPopulationTotale());}
    	 }
    }
}
