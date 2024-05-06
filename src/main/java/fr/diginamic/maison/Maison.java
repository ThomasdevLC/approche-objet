package fr.diginamic.maison;

public class Maison {
    private Piece[] pieces;
    private int nombrePieces;
    private double superficieTotal;

    public Maison() {
        this.pieces = new Piece[10]; 
        this.nombrePieces = 0; 
    }

    public void ajouterPiece(Piece piece) {
        if (nombrePieces < pieces.length) {
            if (piece.donneesPieceValides()) {
                pieces[nombrePieces] = piece;
                nombrePieces++;
                System.out.println(piece.toString() + " ajoutée");

            } else {
            	if (!piece.etageValide()) {
            	    System.out.println("Données de pièce non cohérentes : étage incorrect.");
            	}
                if (!piece.superficieValide()) {
                    System.out.println("Données de pièce non cohérentes : superficie négative.");
                }
            }
        } else {
            System.out.println("La maison est pleine, impossible d'ajouter une pièce.");
        }
    }
    
    
    public void getSuperficieParType(String pieceTest) {
        for (Piece piece : pieces) {
            if (piece != null && piece.getType().equals(pieceTest)) {
                superficieTotal+= piece.getSuperficie();
            }
        }
        System.out.println("superficie totale des pièces de type " + pieceTest + " : " + superficieTotal + " m2");
    }
    
    public void getNbrePiecesParType(String pieceTest) {
        int piecesParType = 0; 
        
        for (Piece piece : pieces) {
            if (piece != null && piece.getType().equals(pieceTest)) {
                piecesParType++; 
            }
        }
        
        System.out.println("Nombre de pièces de type " + pieceTest + " : " + piecesParType);
    }

}
