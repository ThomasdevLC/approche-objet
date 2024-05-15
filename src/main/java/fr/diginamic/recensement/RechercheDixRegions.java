package fr.diginamic.recensement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class RechercheDixRegions extends MenuService {

    public void traiter(Recensement recensement, Scanner scanner) throws IOException {
        ArrayList<Ville> villes = new ArrayList<>(recensement.lireFichier()); 
        
        HashMap<String, Region> mapRegions = new HashMap<>();

        for (Ville ville : villes) {
            String nomRegion = ville.getNomRegion();
            int populationVille = ville.getPopulationTotale();

            if (mapRegions.containsKey(nomRegion)) {
                Region region = mapRegions.get(nomRegion);
                int populationRegion = region.getPopulationRegion();
                 populationRegion += populationVille;
                 region.setPopulationRegion(populationRegion);
  
            } else {
                Region region = new Region(nomRegion, populationVille);
                mapRegions.put(nomRegion, region);
            }
        }

        ArrayList<Region> regions = new ArrayList<>(mapRegions.values());
        Collections.sort(regions, new ComparatorRegions());
        System.out.println( "Les 10 régions les plus peuplées");

        for (int i = 0; i <= 9; i++) {
            Region region = regions.get(i);
            System.out.println( (i+1)+" - " + region.getNomRegion() + " - Population: " + region.getPopulationRegion());
        }
    }
}
