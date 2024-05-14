package fr.diginamic.recensement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RechercheDixVillesFrance extends MenuService  {

	@Override
    public void traiter(Recensement recensement, Scanner scanner) throws IOException {
    	recensement.lireFichier();
    	ArrayList<Ville> villes = recensement.getVille();
    	
        Collections.sort(villes, new ComparatorVilles());
        System.out.println("10 Villes les plus peuplées de France :" );

    	 for (int i = 0; i <= 9; i++) {
    		 Ville ville = villes.get(i);
         	System.out.println((i+1)+ " - "+ ville.getNomCommune() + " - Population : " + ville.getPopulationTotale());
    	 }
    }
}