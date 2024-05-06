package fr.diginamic.jdr;
import java.util.Random;
import java.util.Scanner;

public class Parties {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Creature creature = creatureAleatoire();
        Personnage personnage = new Personnage();
        
        System.out.println("Joueur versus " + creature.getNom());
        System.out.println("Points de vie du joueur : " + personnage.getPointsDeVie());
        System.out.println("Points de vie du : " + creature.getNom() + " : " + creature.getPointsDeVie());
        
        System.out.println("Appuyez sur une touche pour lancer la partie.");
        scanner.nextLine();
        
        while (creature.getPointsDeVie() > 0 && personnage.getPointsDeVie() > 0) {
            int creatureAttaque = creature.getForce() + (new Random().nextInt(10) + 1);
            int joueurAttaque = personnage.getForce() + (new Random().nextInt(10) + 1);
            
            System.out.println("Force de l'attaque de " + creature.getNom() + " : " + creatureAttaque);
            System.out.println("Force de l'attaque du joueur : " + joueurAttaque);
            
            int degats;
            if (creatureAttaque > joueurAttaque) {
                degats = creatureAttaque - joueurAttaque;
                System.out.println(creature.getNom() + " a gagné ce tour !");
                personnage.setPointsDeVie(personnage.getPointsDeVie() - degats); 
            } else if (creatureAttaque < joueurAttaque) {
                degats = joueurAttaque - creatureAttaque;
                System.out.println("Le joueur a gagné ce tour !");
                creature.setPointsDeVie(creature.getPointsDeVie() - degats); 
            } else {
                degats = 0;
                System.out.println("Égalité !");
            }
            
            System.out.println("Points de vie du joueur : " + personnage.getPointsDeVie());
            System.out.println("Points de vie du : "+ creature.getNom() + " : " + creature.getPointsDeVie());
            
            System.out.println("Que voulez-vous faire ?");
            System.out.println("1 - Continuer la partie");
            System.out.println("2 - Arrêter la partie");
            int choix = scanner.nextInt();
            if (choix != 1) {
                break;
            }
            scanner.nextLine(); 
        }
        
        scanner.close();
        System.out.println("Fin de la partie." );
    }
    
    private static Creature creatureAleatoire() {
        Random rand = new Random();
        int choixCreature = rand.nextInt(3); 
        
        switch (choixCreature) {
            case 0:
                return new Loup();
            case 1:
                return new Gobelin();
            case 2:
                return new Troll();
            default:
                return null; 
        }
    }   
}


