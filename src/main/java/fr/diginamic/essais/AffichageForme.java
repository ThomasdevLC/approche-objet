package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

public class AffichageForme {

    public void afficher(Forme forme) {
        double perimetre = forme.calculerPerimetre();
        double surface = forme.calculerSurface();
        
        System.out.println("Périmètre : " + perimetre);
        System.out.println("Surface : " + surface);
    }
}
