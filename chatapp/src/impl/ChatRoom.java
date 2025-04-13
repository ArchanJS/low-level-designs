package impl;

import interfaces.ChatMediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator {
    private List<User> users;
    public ChatRoom(){
        users=new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void removeUser(User user) {
        users.remove(user);
    }

    @Override
    public void sendMessage(String msg, User recipient) {
        for(User user:users){
            if(user.getName()!=recipient.getName()) user.receiveMsg(msg,recipient);
        }
    }
}
