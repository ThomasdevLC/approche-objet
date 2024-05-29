package listes;

import java.util.ArrayList;
import java.util.List;

public class TestContinentAvecEnum {

    public static void main(String[] args) {
        
        List<Ville> listeVilles = new ArrayList<>();
        
        listeVilles.add(new Ville("New York", 53400, Continent.AMERIQUE_DU_NORD));
        listeVilles.add(new Ville("Paris", 2148000, Continent.EUROPE));
        listeVilles.add(new Ville("Pékin", 21540000, Continent.ASIE));
        listeVilles.add(new Ville("Moscou", 11920000, Continent.EUROPE));
        listeVilles.add(new Ville("Berlin", 3769000, Continent.EUROPE));
        listeVilles.add(new Ville("Sydney", 5312000, Continent.OCEANIE));
        listeVilles.add(new Ville("Sao Paulo", 12180000, Continent.AMERIQUE_DU_SUD));
        listeVilles.add(new Ville("Dakar", 1146054, Continent.AFRIQUE));
        
        for (Ville ville : listeVilles) {
            System.out.println(ville);
        }
    }
}
