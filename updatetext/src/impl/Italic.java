package impl;

import interfaces.Command;

public class Italic implements Command {
    private TextEditor editor;
    public Italic(TextEditor editor){
        this.editor=editor;
    }

    @Override
    public void execute() {
        this.editor.italic();
    }
}
