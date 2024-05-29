package listes;

public enum Continent {
	ASIE("Asie"),
    EUROPE("Europe"),
    AFRIQUE("Afrique"),
    AMERIQUE_DU_NORD("Amérique du Nord"),
    AMERIQUE_DU_SUD("Amérique du Sud"),
    OCEANIE("Océanie");

    private final String libelle;

    Continent(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() {
        return libelle;
    }
}
