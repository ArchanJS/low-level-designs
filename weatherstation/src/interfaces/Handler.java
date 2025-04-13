package interfaces;

public interface Handler {
    public void addObserver(Observer ob);
    public void removeObserver(Observer ob);
    public void notifyObservers();
}
