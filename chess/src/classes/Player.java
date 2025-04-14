package classes;

import abstracts.Account;

public class Player extends Account {
    private boolean isWhite;
    private Person person;
    private int noOfTotalGames;
    private int totalWins;

    public boolean hasTakenWhite(){
        // logic
        return true;
    }
}
