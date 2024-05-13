package listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {

    public static void main(String args[]) {
        List<String> liste1 = new ArrayList<>();
        liste1.add("Rouge");
        liste1.add("Vert");
        liste1.add("Orange");

        List<String> liste2 = new ArrayList<>();
        liste2.add("Blanc");
        liste2.add("Bleu");
        liste2.add("Orange");

        List<String> liste3 = new ArrayList<>();

        for (String color : liste1) {
            liste3.add(color);
        }

        for (String color : liste2) {
            liste3.add(color);
        }

        System.out.println("liste 3  : ");
        for (String color : liste3) {
            System.out.println(color);
        }
    }
}
