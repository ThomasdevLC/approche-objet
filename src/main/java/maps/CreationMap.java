package maps;

import java.util.HashMap;

public class CreationMap {

	public static void main(String[] args) {

		Employe emp1 = new Employe(1750);
		Employe emp2 = new Employe(1825);
		Employe emp3 = new Employe(2250);
		Employe emp4 = new Employe(2015);
		Employe emp5 = new Employe(2418);

		HashMap<String, Employe> mapSalaires = new HashMap<>();

		mapSalaires.put("Paul", emp1);
		mapSalaires.put("Hicham", emp2);
		mapSalaires.put("Yu", emp3);
		mapSalaires.put("Ingrid", emp4);
		mapSalaires.put("Chantal", emp5);

		System.out.println(mapSalaires.size());
	}
}
