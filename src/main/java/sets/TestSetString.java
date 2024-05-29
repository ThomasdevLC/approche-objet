package sets;

import java.util.HashSet;
import java.util.Collections;
import java.util.Iterator; // Ajout de l'importation pour Iterator

public class TestSetString {

	public static void main(String[] args) {
		HashSet<String> countries = new HashSet<>();
		Collections.addAll(countries, "USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde");

		String villeMax = "";
		Iterator<String> iter = countries.iterator();
		while (iter.hasNext()) {
			String country = iter.next();
			if (country.length() > villeMax.length()) { 
				villeMax = country;
				iter.remove();
			}
		}

		System.out.println("Le mot le plus long est : " + villeMax);
		System.out.println(countries);
	}
}
