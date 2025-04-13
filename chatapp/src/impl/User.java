package impl;

public class User {
    private String name;
    public User(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void receiveMsg(String msg,User receipent){
        System.out.println(this.getName()+" has received message "+msg+" from "+receipent.getName());
    }
}
