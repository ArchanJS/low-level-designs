package classes;

import interfaces.Search;

import java.util.HashMap;
import java.util.List;

public class Catalog implements Search {

    HashMap<String, List<BookItem>> booksByAuthorName;
    HashMap<String, List<BookItem>> booksByBookName;
    @Override
    public List<BookItem> searchByAuthorName(String authorName) {
        // logic
        return List.of();
    }

    @Override
    public List<BookItem> searchByBookName(String bookName) {
        // logic
        return List.of();
    }
}
