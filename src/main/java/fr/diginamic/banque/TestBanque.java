package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {
		Compte compte1 = new Compte(56898947, 85689);
		CompteTaux compte2 = new CompteTaux(5789811, 55229, 1.2);
		
		Compte[] array = new Compte[2];
		 
		 array[0] = compte1;
		 array[1] = compte2;
		 
		 for (int i = 0; i < array.length; i++) {
			    System.out.println(array[i]);
			} 

		System.out.println(compte1.getNumeroCompte());
		System.out.println(compte2.getTaux() );
	}
}
