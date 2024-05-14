package fr.diginamic.recensement;

import java.io.IOException;
import java.util.Scanner;

public class ApplicationRecensement {

    public static void main(String[] args) throws IOException {
        Recensement recensement = new Recensement();
        Scanner scanner = new Scanner(System.in);
        afficherMenu();

        int choix = 0;
        while (choix != 9) {
            choix = scanner.nextInt();
            switch (choix) {
                case 1:
                    new RecherchePopulationVille().traiter(recensement, scanner);
                    break;
                case 2:
                    new RecherchePopulationDepartement().traiter(recensement, scanner);
                    break;
                case 3:
                    new RecherchePopulationRegion().traiter(recensement, scanner);
                    break;
                case 4:
                    new RechercheDixRegions().traiter(recensement, scanner);
                    break;
                case 5:
                    new RechercheDixDepartements().traiter(recensement, scanner);
                    break;
                case 6:
                    new RechercheDixVillesDepartement().traiter(recensement, scanner);
                    break;
                case 7:
                    new RechercheDixVillesRegions().traiter(recensement, scanner);
                    break;
                case 8:
                    new RechercheDixVillesFrance().traiter(recensement, scanner);
                    break;
                case 9:
                    System.out.println("Sortie du programme.");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez choisir un nombre de 1 à 9.");
            }
        }
        scanner.close();
    }

    public static void afficherMenu() {
        System.out.println("MENU");
        System.out.println("1. Recherche de population par ville");
        System.out.println("2. Recherche de population par département");
        System.out.println("3. Recherche de population par région");
        System.out.println("4. Les 10 régions les plus peuplées");
        System.out.println("5. Les 10 départements les plus peuplés");
        System.out.println("6. Les 10 villes les plus peuplées d'un département");
        System.out.println("7. Les 10 villes les plus peuplées d'une région");
        System.out.println("8. Les 10 villes les plus peuplées de France");
        System.out.println("9. Sortir du programme");
        System.out.print("Choisissez une option (1-9) : ");
    }
}

