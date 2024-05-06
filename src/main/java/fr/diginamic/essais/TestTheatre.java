package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		  Theatre theatre = new Theatre("Théâtre Le Test", 100, 0, 0); 

	        theatre.inscrire(50, 20); 
	        theatre.inscrire(110, 25); 

	        System.out.println("Nom du théâtre : " + theatre.getNom());
	        System.out.println("Nombre total de clients : " + theatre.getTotalClients());
	        System.out.println("Recette totale : " + theatre.getRecette() + " euros");
	    }
}
