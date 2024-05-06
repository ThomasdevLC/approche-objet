package fr.diginamic.operations;

public class Operations {
    
    public static double calcul(double a, double b, char operator) {
        double result = 0.0; 
        
        if (operator == '+') {
            result = a + b;
        } else if (operator == '-') {
            result = a - b;
        } else if (operator == '*') {
            result = a * b;
        } else if (operator == '/') {
                result = a / b;
        }
        
        return result;
    }
    
    
}
