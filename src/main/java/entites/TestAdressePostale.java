package entites;

public class TestAdressePostale {

    public static void main(String[] args) {
        // Création d'une instance de AdressePostale en utilisant le constructeur
        AdressePostale adresse1 = new AdressePostale(123, "Rue de la Paix", 75001, "Paris");

         System.out.println(adresse1.getNumeroRue()); 

        // Création d'une autre instance de AdressePostale en utilisant le constructeur
        AdressePostale adresse2 = new AdressePostale(12, "Rue de test", 34000, "Montpellier");

        // Affichage des adresses
        System.out.println("Adresse : " + adresse1.numeroRue + " " + adresse1.libelleRue + ", " +
                adresse1.codePostal + " " + adresse1.ville);

        System.out.println("Adresse : " + adresse2.numeroRue + " " + adresse2.libelleRue + ", " +
                adresse2.codePostal + " " + adresse2.ville);
        
        
    }
}
