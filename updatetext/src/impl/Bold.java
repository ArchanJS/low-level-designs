package impl;

import interfaces.Command;

public class Bold implements Command {
    private TextEditor editor;
    public Bold(TextEditor editor){
        this.editor=editor;
    }
    @Override
    public void execute() {
        editor.bold();
    }
}
