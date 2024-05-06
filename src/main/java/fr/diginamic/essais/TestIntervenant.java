package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

    public static void main(String[] args) {
        Salarie salarie = new Salarie("Dupond", "Bob", 1850);
        System.out.println(salarie.afficherDonnees());
        
        
        Pigiste pigiste = new Pigiste("Durand", "Steve", 19, 80.0);
        System.out.println(pigiste.afficherDonnees());
    }
}
