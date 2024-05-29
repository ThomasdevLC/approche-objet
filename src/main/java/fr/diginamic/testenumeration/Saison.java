package fr.diginamic.testenumeration;

public enum Saison {
    PRINTEMPS("Printemps", 1),
    ETE("Eté", 2),
    AUTOMNE("Automne", 3),
    HIVER("Hiver", 4);

    private final String libelle;
    private final int num;

    Saison(String libelle, int num) {
        this.libelle = libelle;
        this.num = num;
    }

    public String getNomSaison() {
        return libelle;
    }

    public int getNumSaison() {
        return num;
    }

    public static Saison rechercheParLibelle(String libelle) {
        for (Saison saison : Saison.values()) {
            if (saison.getNomSaison().equals(libelle)) {
                return saison;
            }
        }
        return null; 
    }
}
