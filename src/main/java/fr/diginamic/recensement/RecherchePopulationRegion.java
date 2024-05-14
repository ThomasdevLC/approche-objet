package fr.diginamic.recensement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class RecherchePopulationRegion extends MenuService{

	@Override
    public void traiter(Recensement recensement, Scanner scanner) throws IOException {
    	recensement.lireFichier();
    	ArrayList<Ville> villes = recensement.getVille();
    	
    	System.out.println("Hauts-de-France - Code : 32\r\n"
    			+ "Île-de-France - Code : 11\r\n"
    			+ "Grand Est - Code : 44\r\n"
    			+ "Normandie - Code : 28\r\n"
    			+ "Bretagne - Code : 53\r\n"
    			+ "Pays de la Loire - Code : 52\r\n"
    			+ "Centre-Val de Loire - Code : 24\r\n"
    			+ "Bourgogne-Franche-Comté - Code : 27\r\n"
    			+ "Nouvelle-Aquitaine - Code : 75\r\n"
    			+ "Auvergne-Rhône-Alpes - Code : 84\r\n"
    			+ "Occitanie - Code : 76\r\n"
    			+ "Provence-Alpes-Côte d'Azur - Code : 93\r\n"
    			+ "Corse - Code : 94");
    	System.out.println();
        System.out.print("Ecrire un code de région: ");
       
        String codeRegion = scanner.next();
        boolean regionExiste = false;

    	int popRegion = 0;
    	String nomRegion = "";
    	
    	for (Ville ville : villes) {
            if(ville.getCodeRegion().equalsIgnoreCase(codeRegion)) {
            	regionExiste = true;
            	popRegion += ville.getPopulationTotale();
            	nomRegion = ville.getNomRegion();
            }
        }
    	
    	if (!regionExiste) {
            System.out.println("La région " + codeRegion + " n'existe pas.");}
            else {
            	System.out.println("Population la région " + nomRegion + ": "  + popRegion);
        }
    }
}
