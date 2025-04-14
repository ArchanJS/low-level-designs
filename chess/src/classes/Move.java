package classes;

import abstracts.Piece;

public class Move {
    private int id;
    private Piece piece;
    private Box startPos;
    private Box endPos;
    private Piece pieceKilled;
    private Piece pieceMoved;
    private boolean castlingMove;

    public boolean isCastlingMove(){
        // logic
        return true;
    }
}
