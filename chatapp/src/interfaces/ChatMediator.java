package interfaces;

import impl.User;

public interface ChatMediator {
    public void sendMessage(String msg, User recipient);
    public void addUser(User user);
    public void removeUser(User user);
}
