package abstracts;

import classes.Person;
import enums.AccountStatus;

public abstract class Account {
    private int id;
    private String password;
    private AccountStatus accountStatus;

    public boolean resetPassword(){
        // logic
        return true;
    }
}
