package fr.diginamic.testenumeration;

public class TestEnumeration {

    public static void main(String[] args) {

        Saison[] saisons = Saison.values();
        for (Saison saison : saisons) {
            System.out.println(saison);
        }

        Saison saison = Saison.valueOf("ETE");
        System.out.println(saison.getNomSaison());

        Saison saisonRecherchée = Saison.rechercheParLibelle("Hiver");
        System.out.println("Saison trouvée : " + saisonRecherchée);
    }
}
