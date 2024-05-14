package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OpenFoodfacts {

    public static void main(String[] args) throws IOException {
        String myPath = "D:/diginamic/06_java/java-poo/TP autoformation J2/open-food-facts.csv";

        Path path = Paths.get(myPath);
        System.out.println("File exists: " + Files.exists(path));
        System.out.println("Is regular file: " + Files.isRegularFile(path));
        System.out.println("Is readable : " + Files.isReadable(path));

        List<String> allLines = Files.readAllLines(path);
        List<String> lines = allLines.subList(1, allLines.size());

        Set<String> categories = new HashSet<>();
        Set<String> marques = new HashSet<>();

        for (String line : lines) {
            String[] col = line.split("\\|");
            String categorie = col[0].trim();
            if (!categories.contains(categorie)) {
            categories.add(categorie);}
            
            String marque = col[1].trim();
            if (!marques.contains(marque)) {
            	marques.add(marque);}
        }
        
        System.out.println(categories);
        System.out.println(marques);


        int categorieCount = categories.size();
        int marquesCount = categories.size();

        System.out.println("categories: " + categorieCount);
        System.out.println("marques: " + marquesCount);
    }
}
