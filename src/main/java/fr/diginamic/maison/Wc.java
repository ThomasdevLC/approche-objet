package fr.diginamic.maison;

public class Wc extends Piece {
    public Wc(int etage, double superficie) {
        super(etage, superficie);
    }
    
    @Override
    public String getType() {
        return "wc";
    }
}
