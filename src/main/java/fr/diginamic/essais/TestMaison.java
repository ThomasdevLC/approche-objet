package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.Wc;

public class TestMaison {
    public static void main(String[] args) {
    	
        Maison maMaison = new Maison();

        Chambre maChambre = new Chambre(1, 15.5);
        Cuisine maCuisine = new Cuisine(0, 20.0);
        Salon  monSalon = new Salon(0, 25.0);
        SalleDeBain  maSalleDeBain = new SalleDeBain(1, 10.0);
        Wc monWC = new Wc(0, 5.0);
        Chambre maChambre2 = new Chambre(1, 12.0);

        maMaison.ajouterPiece(maChambre);
        maMaison.ajouterPiece(maCuisine);
        maMaison.ajouterPiece(monSalon);
        maMaison.ajouterPiece(maSalleDeBain);
        maMaison.ajouterPiece(monWC);
        maMaison.ajouterPiece(maChambre2);
        
        maMaison.getSuperficieParType("chambre");
        maMaison.getNbrePiecesParType("chambre");

    }
}
