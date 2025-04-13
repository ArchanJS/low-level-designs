package classes;

public class Library {
    private static Library library = null;
    public static Library getInstance(){
        if(library == null) library = new Library();
        return library;
    }
}
