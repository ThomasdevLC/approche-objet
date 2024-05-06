package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

    public static void main(String[] args) {
        double a = 10.0;
        double b = 2.5;

        System.out.println("Addition: " + a + " + " + b + " = " + Operations.calcul(a, b, '+'));
        System.out.println("Soustraction: " + a + " - " + b + " = " + Operations.calcul(a, b, '-'));
        System.out.println("Multiplication: " + a + " * " + b + " = " + Operations.calcul(a, b, '*'));
        System.out.println("Division: " + a + " / " + b + " = " + Operations.calcul(a, b, '/'));
    }
}
