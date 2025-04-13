package classes;

public abstract class Notification {
    private String notificationId;
    private String content;
    private LendingBook lendingBook;
    private BookReservation bookReservation;

    public abstract void sendNotification();
}
