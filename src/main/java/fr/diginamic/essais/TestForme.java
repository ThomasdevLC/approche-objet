package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;

public class TestForme {

    public static void main(String[] args) {
    	
        Cercle cercle = new Cercle(5);   
        AffichageForme affichageCercle = new AffichageForme();
        
        System.out.println("- CERCLE :");
        affichageCercle.afficher(cercle);
            
        Rectangle rectangle = new Rectangle(15,5);   
        AffichageForme affichageRect = new AffichageForme();
        
        System.out.println("- RECTANGLE :");
        affichageRect.afficher(rectangle);
        
        
        Carre carre = new Carre(5);   
        AffichageForme affichageCarre = new AffichageForme();
        
        System.out.println("- CARRE :");
        affichageCarre.afficher(carre);
        
    }
}   