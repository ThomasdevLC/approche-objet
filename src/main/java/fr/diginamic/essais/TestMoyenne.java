package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {
	
	public static void main(String[] args) {
		
		CalculMoyenne calculMoyenne = new CalculMoyenne();

        calculMoyenne.ajout(10.0);
        calculMoyenne.ajout(15.0);
        calculMoyenne.ajout(20.0);

        double moyenne = calculMoyenne.calcul();
        System.out.println("La moyenne est : " + moyenne);
	}
}
