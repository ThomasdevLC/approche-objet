package equals;

public class VilleEqualsTest {

	public static void main(String[] args) {
        Ville ville1 = new Ville("Paris", 1000000);
        Ville ville2 = new Ville("Paris", 1000000);
        Ville ville3 = new Ville("Marseille", 800000);
        Ville ville4 = new Ville("Lyon", 500000);

        System.out.println("ville1 égale ville2 : " + ville1.equals(ville2)); 

        System.out.println("ville1 égale ville3 : " + ville1.equals(ville3)); 

        System.out.println("ville1 égale ville4 : " + ville1.equals(ville4)); 
    }
}
