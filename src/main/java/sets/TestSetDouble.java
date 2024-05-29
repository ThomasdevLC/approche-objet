package sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class TestSetDouble {

    public static void main(String[] args) {
        HashSet<Double> numbers = new HashSet<>();
        
        numbers.add(1.5);
        numbers.add(1.5);
        numbers.add(8.25);
        numbers.add(-7.32);
        numbers.add(13.3);
        numbers.add(-12.45);
        numbers.add(48.5);
        numbers.add(0.01);
        
       System.out.println("HashSet collection: " + numbers);
 	   System.out.println("plus grand element : " + Collections.max(numbers)); 
 	   
 	  Iterator<Double> it = numbers.iterator();
      while(it.hasNext()) {
    	  Double item = it.next();
          if (item == Collections.min(numbers)) {
              it.remove(); 
          }
      }

	    System.out.println("collection sans min : " + numbers); 
	
    }
}
