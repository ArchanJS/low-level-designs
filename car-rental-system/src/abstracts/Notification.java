package abstracts;

import java.util.Date;

public abstract class Notification {
    private int id;
    private String message;

    public abstract void sendNotification(User user);
}
