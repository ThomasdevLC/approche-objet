package fr.diginamic.salaire;

public abstract class Intervenant {

		private String nom;
		private String prenom;

	    public Intervenant(String nom, String prenom) {
	        this.nom = nom;
	        this.prenom = prenom;
	    }

	    public abstract double getSalaire();
	    public abstract String getStatus();
	    public abstract String afficherDonnees();

		public String getNom() {
			return nom;
		}

		public String getPrenom() {
			return prenom;
		}

		@Override
		public String toString() {
			return  getPrenom() + " " + getNom() ;
		}	
	}


