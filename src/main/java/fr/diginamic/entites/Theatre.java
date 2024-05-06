package fr.diginamic.entites;

public class Theatre {
	
	private String nom;
	private int capacite;
	private int totalClients;
	private double recette;
	
	public Theatre(String nom, int capacite, int totalClients, double recette) {
		this.nom = nom;
		this.capacite = capacite;
		this.totalClients = totalClients;
		this.recette = recette;
	}
	
	public void inscrire(int nbrClients, int prix) {
	    if (nbrClients <= capacite) {
	        totalClients += nbrClients;
	        recette += nbrClients * prix; 
	    } else {
	        System.out.println("La capacité maximale est dépassée");
	    }
	}

	public String getNom() {
		return nom;
	}

	public int getTotalClients() {
		return totalClients;
	}

	public double getRecette() {
		return recette;
	}
}
