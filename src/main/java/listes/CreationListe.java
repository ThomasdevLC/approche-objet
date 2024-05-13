package listes;

import java.util.ArrayList;

public class CreationListe {

	public static void main(String[] args) {
		
		
	    ArrayList<Integer> numbers = new ArrayList<>();
	    
	    for (int i = 1; i < 101 ; i++) {
	    	numbers.add(i);
	    	}
	    
	    System.out.println("Contenu de numbers : ");
        for (Integer number : numbers) {
            System.out.println(number);
        }
	
	}
}