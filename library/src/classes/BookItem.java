package classes;

import enums.BookStatus;

import java.util.Date;

public class BookItem {
    private Book book;
    private Rack rack;
    private BookStatus status;
    private Date dueDate;

    public boolean checkout(long memberId){
        // logic
        return true;
    }

    public void putInRack(Rack rack){
        this.rack=rack;
    }
}
