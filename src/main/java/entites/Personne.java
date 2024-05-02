package entites;

public class Personne {
    String nom;
    String prenom;
    AdressePostale adresse; 
    
    // Constructeur avec 3 paramètres
    public Personne( String nom, String prenom, AdressePostale adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }
    
    public void getNames() {
        System.out.println(nom.toUpperCase() + " " + prenom);
    }
    
    public void changeName( String newName) {
       this.nom = newName ;
    }
    
    public void changeFirstName( String newFirstName) {
       this.prenom = newFirstName;
    }
    
    public void changeAdress( AdressePostale  newAdress) {
        this.adresse =   newAdress;
    }
    
    
    public String afficherNom() {
        return "afffichage Nom : " + nom;
    }
    
    public String afficherPrenom() {
        return "afffichage Prenom : " + prenom;
    }
    
    public String afficherAdresse() {
        return "afffichage adresse : " + adresse.numeroRue+ " " + adresse.libelleRue+ " " + adresse.codePostal+ " " + adresse.ville;
    }

}
