package impl;

import interfaces.Command;

public class RunCommand {
    private Command command;
    public RunCommand(Command command){
        this.command=command;
    }
    public void click(){
        this.command.execute();
    }

}
