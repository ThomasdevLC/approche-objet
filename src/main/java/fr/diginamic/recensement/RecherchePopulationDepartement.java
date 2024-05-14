package fr.diginamic.recensement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class RecherchePopulationDepartement extends MenuService {
	@Override
    public void traiter(Recensement recensement, Scanner scanner) throws IOException {
    	recensement.lireFichier();
    	ArrayList<Ville> villes = recensement.getVille();
    	
        System.out.print("Ecrire un code de département: ");
       
        String codeDep = scanner.next();

    	int popDepartement = 0;
        boolean departementExiste = false;

    	
    	for (Ville ville : villes) {
            if(ville.getCodeDepartement().equals(codeDep)) {
            	departementExiste = true;
            	popDepartement += ville.getPopulationTotale();
            }
        }
    	
    	if (!departementExiste) {
            System.out.println("Le département " + codeDep + " n'existe pas.");}
            else {
            	System.out.println("pouplation du département " + codeDep + ": "  + popDepartement);
        }
    }
}
