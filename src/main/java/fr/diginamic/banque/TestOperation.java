package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {

    public static void main(String[] args) {
        // Création d'un tableau d'opérations
        Operation[] operations = new Operation[8]; 

        // Ajout d'opérations de crédit
        operations[0] = new Credit("2024-05-01", 5000);
        operations[1] = new Credit("2024-05-02", 1000);
        operations[2] = new Credit("2024-05-03", 200);
        operations[3] = new Credit("2024-05-04", 300); 
        
        // Ajout d'opérations de débit
        operations[4] = new Debit("2024-05-05", 700);
        operations[5] = new Debit("2024-05-06", 800);
        operations[6] = new Debit("2024-05-07", 400);
        operations[7] = new Debit("2024-05-08", 500);

        // Parcourir et afficher les opérations
        double montantTotal = 0;
        for (Operation operation : operations) {
            System.out.println("Type: " + operation.getType() + ", Date: " + operation.getDate() + ", Montant: " + operation.getMontant());
            if (operation instanceof Credit) {
                montantTotal += operation.getMontant(); // Si c'est un crédit, ajoutez le montant
            } else if (operation instanceof Debit) {
                montantTotal -= operation.getMontant(); // Si c'est un débit, soustrayez le montant
            }
        }

        System.out.println("Montant global de toutes les opérations: " + montantTotal);
    }
}
