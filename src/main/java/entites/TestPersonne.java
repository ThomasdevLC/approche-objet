package entites;

public class TestPersonne {

    public static void main(String[] args) {
        // Création d'une instance de Personne avec une adresse 
        AdressePostale adresse1 = new AdressePostale(123, "Rue de la Paix", 75001, "Paris");
        Personne personne1 = new Personne("Doe", "John", adresse1);

        // Affichage 
        System.out.println("Nom: " + personne1.nom);
        System.out.println("Prénom: " + personne1.prenom);
        System.out.println("Adresse: " + personne1.adresse.numeroRue + " " + personne1.adresse.libelleRue + ", " +
                personne1.adresse.codePostal + " " + personne1.adresse.ville);
        System.out.println("---------------"); 

        // Création d'une  instance de Personne avec  autre adresse
        AdressePostale adresse2 = new AdressePostale(12, "Rue de test", 34000, "Montpellier");
        Personne personne2 = new Personne("Smith", "Alice", adresse2);
        
        


        // Affichage 
        System.out.println("Nom: " + personne2.nom);
        System.out.println("Prénom: " + personne2.prenom);
        System.out.println("Adresse: " + personne2.adresse.numeroRue + " " + personne2.adresse.libelleRue + ", " +
                personne2.adresse.codePostal + " " + personne2.adresse.ville);
        System.out.println("---------------"); 
    
        
        Personne personne3 = new Personne("Third", "Bob", new AdressePostale(25, "Rue de Truc", 35000, "Rennes"));
        personne3.getNames();
        personne3.changeName("Newthird");
        personne3.changeFirstName("Phil");
        personne3.changeAdress( new AdressePostale (5, "Rue du change", 35500, "Rennes"));

        System.out.println(personne3.afficherNom());
        System.out.println(personne3.afficherPrenom());
        System.out.println(personne3.afficherAdresse());
        


    }
}
