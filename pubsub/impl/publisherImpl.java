package pubsub.impl;
import java.util.*;
import pubsub.interfaces.publisher;
import pubsub.interfaces.subscriber;

public class publisherImpl implements publisher {
    
    public final List<subscriber> subscribers;

    public publisherImpl(){
        subscribers = new ArrayList<>();
    }
    
    @Override
    public void subscribe(subscriber Sub) {
        subscribers.add(Sub);
    }

    @Override
    public void unsubscribe(subscriber Sub) {
        subscribers.remove(Sub);
    }

    @Override
    public void notifySubscribers(String message) {
        for(subscriber sub:this.subscribers) {
            sub.update(message);
        }
    }
}
