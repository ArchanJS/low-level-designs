package classes;

import enums.ChessStatus;

import java.util.List;

public class ChessGame {
    private int id;
    private Player playerTurn;
    private ChessBoard chessBoard;
    private ChessStatus chessStatus;
    private List<Player> players;
    private List<Move> moves;

    public void playMove(){
        // logic
    }

    public boolean isOver(){
        // logic
        return true;
    }
}
