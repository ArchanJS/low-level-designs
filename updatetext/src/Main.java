import impl.Bold;
import impl.RunCommand;
import impl.TextEditor;
import interfaces.Command;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");
        TextEditor editor=new TextEditor();
        Bold bold=new Bold(editor);
        RunCommand run=new RunCommand(bold);
        run.click();
    }
}