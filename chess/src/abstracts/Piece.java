package abstracts;

public abstract class Piece {
    private int id;
    private boolean isWhite;
    private boolean isKilled;

    public abstract boolean canMove();
}
