package fr.diginamic.maison;

public class Salon extends Piece {
    public Salon(int etage, double superficie) {
        super(etage, superficie);
    }
    @Override
    public String getType() {
        return "salon";
    }
}
