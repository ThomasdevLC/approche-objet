package fr.diginamic.recensement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class RecherchePopulationRegion extends MenuService{

	@Override
    public void traiter(Recensement recensement, Scanner scanner) throws IOException {
    	recensement.lireFichier();
    	ArrayList<Ville> villes = recensement.getVille();
    	
        System.out.print("Ecrire un nom de région: ");
       
        String nomRegion = scanner.next();
        boolean regionExiste = false;

    	int popRegion = 0;
    	
    	for (Ville ville : villes) {
            if(ville.getNomRegion().equalsIgnoreCase(nomRegion)) {
            	regionExiste = true;
            	popRegion += ville.getPopulationTotale();
            }
        }
    	
    	if (!regionExiste) {
            System.out.println("La région " + nomRegion + " n'existe pas.");}
            else {
            	System.out.println("Population la région " + nomRegion + ": "  + popRegion);
        }
    }
}
