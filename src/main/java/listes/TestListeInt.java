package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestListeInt {

	public static void main(String[] args) {
		
	    ArrayList<Integer> liste = new ArrayList<>();
	    Collections.addAll(liste, -1, 5, 7, 3, -2, 4, 8, 5);
	    
	    System.out.println("éléments : " );
	    for (int num : liste ) {
	    	System.out.println(+ num);
	    }

	   System.out.println("taille liste : " + liste.size()); 
	   System.out.println("plus grand element : " + Collections.max(liste)); 


	   Iterator<Integer> it = liste.iterator();
       while(it.hasNext()) {
           int item = it.next();
           if (item == Collections.min(liste)) {
               it.remove(); 
           }
       }

	    System.out.println("liste sans min : " + liste); 
	}
}
