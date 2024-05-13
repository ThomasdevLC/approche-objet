package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {

    public static void main(String[] args) throws IOException {
    	
    	String myPath = "D:/diginamic/06_java/java-poo/TP/recensement.csv";
    	
        Path path = Paths.get(myPath);
        System.out.println("File exists: " + Files.exists(path));
        System.out.println("Is regular file: " + Files.isRegularFile(path));
        System.out.println("Is readable : " + Files.isReadable(path));
        
        List<String> allLines = Files.readAllLines(path);
        List<String> lines = allLines.subList(1, allLines.size());
        
        List<Ville> listeVilles = new ArrayList<>();

        for (String line : lines) {
            String[] col = line.split(";");
            String nom = col[6];
            String departement = col[2];
            String region = col[1];
            int population = Integer.parseInt(col[9].replaceAll("\\s", ""));
            if (population >= 25000) {
                Ville ville = new Ville(nom, departement, region, population);
                listeVilles.add(ville);
                
                System.out.println(ville);
            }
        };
    
        List<String> villeStrings = new ArrayList<>();
        villeStrings.add(0, "nom" + ";" + "departement" + ";" + "region" + ";" + "population");
        
        for (Ville ville : listeVilles) {
            villeStrings.add(ville.toString());
        }
        
        String newPath = "D:/diginamic/06_java/java-poo/TP/final_recensement.csv";
        Path pathDest = Paths.get(newPath);
        Files.write(pathDest, villeStrings, StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
    }       
}
