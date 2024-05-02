package utils;

public class TestMethodeStatic {

	public static void main(String[] args) {
		String chaine = "12"; // Exemple de chaîne contenant un nombre entier
        System.out.println(chaine);	

        // Conversion de la chaîne en entier
        int entier = Integer.parseInt(chaine);
        System.out.println(entier);	

        // Déclaration de deux variables entières
        int a = 10;
        int b = 20;

        // Calcul du nombre maximum entre a et b à l'aide de la méthode statique de la classe Integer
        int max = Integer.max(a, b);

        // Affichage du résultat
        System.out.println("Le nombre maximum entre " + a + " et " + b + " est : " + max);

	}

}
