package entites;
import entites.Personne;

public class TestPersonne {

    public static void main(String[] args) {
        // Création de la première personne
        Personne personne1 = new Personne();
        personne1.nom = "Doe";
        personne1.prenom = "John";
        AdressePostale adresse1 = new AdressePostale();
        adresse1.numeroRue = 123;
        adresse1.libelleRue = "Rue de la Paix";
        adresse1.codePostal = 75001;
        adresse1.ville = "Paris";
        personne1.adresse = adresse1;

        // Création de la deuxième personne
        Personne personne2 = new Personne();
        personne2.nom = "Smith";
        personne2.prenom = "Jane";
        AdressePostale adresse2 = new AdressePostale();
        adresse2.numeroRue = 456;
        adresse2.libelleRue = "Avenue des Champs-Élysées";
        adresse2.codePostal = 75008;
        adresse2.ville = "Paris";
        personne2.adresse = adresse2;

        // Affichage des informations des personnes
        System.out.println("Personne 1 : " + personne1.nom + " " + personne1.prenom);
        System.out.println("Adresse : " + personne1.adresse.numeroRue + " " + personne1.adresse.libelleRue + ", " +
                personne1.adresse.codePostal + " " + personne1.adresse.ville);

        System.out.println("\nPersonne 2 : " + personne2.nom + " " + personne2.prenom);
        System.out.println("Adresse : " + personne2.adresse.numeroRue + " " + personne2.adresse.libelleRue + ", " +
                personne2.adresse.codePostal + " " + personne2.adresse.ville);
    }
}
