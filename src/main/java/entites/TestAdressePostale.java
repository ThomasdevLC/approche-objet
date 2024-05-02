package entites;

// Import de la classe AdressePostale
import entites.AdressePostale;

public class TestAdressePostale {

    public static void main(String[] args) {
        // Création d'une instance de AdressePostale
        AdressePostale adresse1 = new AdressePostale();

        // Initialisation des attributs
        adresse1.numeroRue = 123;
        adresse1.libelleRue = "Rue de la Paix";
        adresse1.codePostal = 75001;
        adresse1.ville = "Paris";
        
        
        
        // Création d'une instance de AdressePostale2
        AdressePostale adresse2 = new AdressePostale();

        // Initialisation des attributs 
        adresse2.numeroRue = 12;
        adresse2.libelleRue = "Rue de test";
        adresse2.codePostal = 34000;
        adresse2.ville = "Montpellier";
        
        
        
        System.out.println("Adresse : " + adresse1.numeroRue + " " + adresse1.libelleRue + ", " +
        		adresse1.codePostal + " " + adresse1.ville);

        System.out.println("Adresse : " + adresse2.numeroRue + " " + adresse2.libelleRue + ", " +
        		adresse2.codePostal + " " + adresse2.ville);
    }
}
