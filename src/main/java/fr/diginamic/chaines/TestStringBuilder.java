package fr.diginamic.chaines;

public class TestStringBuilder {

    public static void main(String[] args) {
    	
    	long debut = System.currentTimeMillis();
    	
       StringBuilder builder = new StringBuilder();

       for (int i = 0; i <= 100000; i++) {
         builder.append(i).append("\n");
       }
      
      String result = builder.toString();
        
//    	String result = "";
//    	for (int i = 0; i <= 100000; i++) {
//    		result = result + i + ("\n");
//    		}
        
        System.out.println(result);
        long fin = System.currentTimeMillis(); 
        System.out.println("Temps écoulé en millisecondes :" + (fin - debut)); 
        
        // StringBuilder +  :Temps écoulé en millisecondes :30 ms
        // concateanation +  :Temps écoulé en millisecondes :3725 ms

    }
}
