package abstracts;

import java.util.Date;

public abstract class Payment {
    private int id;
    private double amount;
    private Date timestamp;

    public abstract boolean pay();
}
