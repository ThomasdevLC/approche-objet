package equals;
import java.util.ArrayList;
import java.util.List;

public class VilleContainsTest {

	    public static void main(String[] args) {
	        // Création des objets Ville
	        Ville ville1 = new Ville("Paris", 1000000);
	        Ville ville2 = new Ville("Marseille", 800000);
	        Ville ville3 = new Ville("Lyon", 500000);

	        // Création d'une liste de villes
	        List<Ville> listeVilles = new ArrayList<>();
	        listeVilles.add(ville1);
	        listeVilles.add(ville2);
	        listeVilles.add(ville3);

	        // Test de la méthode contains avec une ville existante dans la liste
	        Ville villeTest1 = new Ville("Paris", 1000000);
	        System.out.println("La liste contient villeTest1 : " + listeVilles.contains(villeTest1));

	        // Test de la méthode contains avec une ville inexistante dans la liste
	        Ville villeTest2 = new Ville("Toulouse", 900000);
	        System.out.println("La liste contient villeTest2 : " + listeVilles.contains(villeTest2));
	    }
	}



