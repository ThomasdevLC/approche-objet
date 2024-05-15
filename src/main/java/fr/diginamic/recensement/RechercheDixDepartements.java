package fr.diginamic.recensement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class RechercheDixDepartements extends MenuService  {
	
    public void traiter(Recensement recensement, Scanner scanner) throws IOException {
        ArrayList<Ville> villes = new ArrayList<>(recensement.lireFichier()); 

        HashMap<String, Departement> mapDepartements = new HashMap<>();

        for (Ville ville : villes) {
            String codeDepartement = ville.getCodeDepartement();
            int populationVille = ville.getPopulationTotale();

            if (mapDepartements.containsKey(codeDepartement)) {
            	Departement departement = mapDepartements.get(codeDepartement);
                int populationDepartement = departement.getPopulationDepartement();
                populationDepartement += populationVille;
                departement.setPopulationDepartement(populationDepartement);
  
            } else {
            	Departement departement = new Departement(codeDepartement, populationVille);
            	mapDepartements.put(codeDepartement, departement);
            }
        }

        ArrayList<Departement> departements = new ArrayList<>(mapDepartements.values());
        Collections.sort(departements, new ComparatorDepartements());
        System.out.println( "Les 10 départements les plus peuplées");

        for (int i = 0; i <= 9; i++) {
        	Departement departement = departements.get(i);
            System.out.println( (i+1)+" - département " + departement.getCodeDepartement() + " - Population: " + departement.getPopulationDepartement());
        }
        
    }
}
