package abstracts;

import java.util.Date;

public abstract class Notification {
    private int id;
    private Date createdAt;
    private String content;

    public abstract void noftify(Person person);
}
