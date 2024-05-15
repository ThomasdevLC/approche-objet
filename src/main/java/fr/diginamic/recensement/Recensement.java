package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Recensement {
    
	public List<Ville> lireFichier() throws IOException {
	    Path path = Paths.get("D:/diginamic/06_java/java-poo/TP autoformation J2/recensement.csv");

	    List<String> allLines = Files.readAllLines(path);
	    List<String> lines = allLines.subList(1, allLines.size());
	    
	    ArrayList<Ville> listeVilles = new ArrayList<>();
	    
	    for (String line : lines) {
	        String[] col = line.split(";");
	        String codeRegion = col[0];
	        String nomRegion = col[1];
	        String codeDepartement = col[2];
	        String codeCommune = col[5];
	        String nomCommune = col[6];
	        int populationTotale = Integer.parseInt(col[9].replaceAll("\\s", ""));

	        Ville ville = new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune, populationTotale);
	        listeVilles.add(ville);
	    }
	    
	    return listeVilles;
	}
}