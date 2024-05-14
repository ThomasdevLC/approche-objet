package fr.diginamic.recensement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class RechercheDixVillesDepartement extends MenuService {
	
	@Override
    public void traiter(Recensement recensement, Scanner scanner) throws IOException {
    	recensement.lireFichier();
    	ArrayList<Ville> villes = recensement.getVille();
    	
        List<Ville> listeVilles = new ArrayList<>();

    	
        System.out.print("Ecrire un code de département: ");
       
        String codeDep = scanner.next();
        boolean departementExiste = false;

    	for (Ville ville : villes) {
            if(ville.getCodeDepartement().equals(codeDep)) {
            	departementExiste = true;
            	listeVilles.add(ville);          
            	}
        }
    	
        Collections.sort(listeVilles, new ComparatorVilles());
       
    	if (!departementExiste) {
            System.out.println("Le département " + codeDep + " n'existe pas.");}
        else {
        System.out.println("10 Villes les plus peuplées du département : " + codeDep);
    	 for (int i = 0; i <= 9; i++) {
    		 Ville ville = listeVilles.get(i);
         	System.out.println((i+1)+ " - "+ ville.getNomCommune() + " - Population : " + ville.getPopulationTotale());}

    	 }
    }
}
