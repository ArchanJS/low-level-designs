package pubsub.interfaces;

public interface subscriber {
    String getName();
    void update(String message);
}