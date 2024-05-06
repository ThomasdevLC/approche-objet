package fr.diginamic.maison;

public class SalleDeBain extends Piece {
    public SalleDeBain(int etage, double superficie) {
        super(etage, superficie);
    }
    @Override
    public String getType() {
        return "salle de bain";
    }
}
