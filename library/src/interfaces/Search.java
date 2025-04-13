package interfaces;

import classes.BookItem;

import java.util.List;

public interface Search {
    public List<BookItem> searchByAuthorName(String authorName);
    public List<BookItem> searchByBookName(String bookName);

}
