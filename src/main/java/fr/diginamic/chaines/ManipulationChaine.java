package fr.diginamic.chaines;
import fr.diginamic.entites.Salarie;

public class ManipulationChaine {

	public static void main(String[] args) {
		String chaine = "Durand;Marcel;2 523.5";
		
		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractère: " + premierCaractere);
		
		int longueur = chaine.length();
		System.out.println("Longueur chaine: " + longueur);

		int premierPointVirgule = chaine.indexOf(';');
        System.out.println("L'index du premier ';' est : " + premierPointVirgule);
       
        int deuxiemePointVirgule = chaine.indexOf(';', premierPointVirgule + 1);
        System.out.println("L'index du deuxième ';' est : " + deuxiemePointVirgule);
        
        String nom = chaine.substring(premierPointVirgule +1 , deuxiemePointVirgule);
        System.out.println("Le nom est : " + nom);
        
        String nomMaj = nom.toUpperCase();
        System.out.println("Nom en majuscule : " + nomMaj);
       
        String nomMin = nom.toLowerCase();
        System.out.println("Nom en minuscule : " + nomMin);
       
        String[] mots = chaine.split(";");
        for (String mot : mots) {
           System.out.println("tableau : " + mot);
       }
        
        
       String nomSalarie = mots[0];
       String prenomSalarie = mots[1];
       double salaireSalarie = Double.parseDouble(mots[2].replace(" ", ""));
  
       Salarie salarie = new Salarie(nomSalarie,prenomSalarie, salaireSalarie);         
       System.out.println("Le salarié " + salarie.getPrenom() +" "+ salarie.getNom() + " gagne : " + salarie.getSalaire() + " euros");
	}
}
;