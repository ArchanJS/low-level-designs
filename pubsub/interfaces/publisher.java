package pubsub.interfaces;

public interface publisher {
    void subscribe(subscriber Sub);
    void unsubscribe(subscriber Sub);
    void notifySubscribers(String message);
}
