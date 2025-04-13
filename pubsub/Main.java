package pubsub;
import pubsub.impl.publisherImpl;
import pubsub.impl.subscriberImpl;
import pubsub.interfaces.publisher;
import pubsub.interfaces.subscriber;
public class Main {
    public static void main(String[] args) {
        publisher publisher = new publisherImpl();
        subscriber sub1 = new subscriberImpl("archan");
        subscriber sub2 = new subscriberImpl("arpan");
        subscriber sub3 = new subscriberImpl("jaydip");

        publisher.subscribe(sub1);
        publisher.subscribe(sub2);
        publisher.subscribe(sub3);

        publisher.unsubscribe(sub3);

        publisher.notifySubscribers("PING");
    }
}
