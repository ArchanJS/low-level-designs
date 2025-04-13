import impl.ChatRoom;
import impl.User;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");
        ChatRoom room=new ChatRoom();
        User user1=new User("user1");
        User user2=new User("user2");
        User user3=new User("user3");
        room.addUser(user1);
        room.addUser(user2);
        room.addUser(user3);
        room.sendMessage("hello",user1);
    }
}