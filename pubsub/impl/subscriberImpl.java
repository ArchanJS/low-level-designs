package pubsub.impl;

import pubsub.interfaces.subscriber;

public class subscriberImpl implements subscriber {
    public String name;
    public subscriberImpl(String name){
        this.name = name;
    }
    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public void update(String message) {
        System.out.println(this.name+" has received the message:  "+message);
    }
}
