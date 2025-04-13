package classes;

import java.util.Date;

public class LibraryCard {
    private Date membershipDate;
    private String cardId;
    private boolean activeStatus;

    public boolean getActiveStatus(){
        return this.activeStatus;
    }
}
