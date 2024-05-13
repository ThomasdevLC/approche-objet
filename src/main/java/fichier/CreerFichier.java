package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {

		public static void main(String[] args) throws IOException {
	    	
	    	String myPath = "D:/diginamic/06_java/java-poo/TP/recensement.csv";
	    	
	        Path path = Paths.get(myPath);
	        System.out.println("File exists: " + Files.exists(path));
	        System.out.println("Is regular file: " + Files.isRegularFile(path));
	        System.out.println("Is readable : " + Files.isReadable(path));
	        
	        List<String> liste = new ArrayList<>();
	        
	        List<String> lines = Files.readAllLines(path);
	        
	        for (int i = 1; i < 101; i++) {
	            liste.add(lines.get(i));
	        }
	        
	        String newPath = "D:/diginamic/06_java/java-poo/TP/nouveau_recensement.csv";
	        Path pathDest = Paths.get(newPath);
	        Files.write(pathDest,liste);

		}
}