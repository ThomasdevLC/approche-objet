package maps;

public class Pays {
    // Attributs
    private String nom;
    private int nombreHabitants;
    private String continent;
    
    // Constructeur
    public Pays(String nom, int nombreHabitants, String continent) {
        this.nom = nom;
        this.nombreHabitants = nombreHabitants;
        this.continent = continent;
    }
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNombreHabitants() {
        return nombreHabitants;
    }

    public void setNombreHabitants(int nombreHabitants) {
        this.nombreHabitants = nombreHabitants;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }
    
    // Méthode pour afficher les détails du pays
    public void afficherDetails() {
        System.out.println("Nom du pays : " + nom);
        System.out.println("Nombre d'habitants : " + nombreHabitants);
        System.out.println("Continent : " + continent);
    }
    
  
}
