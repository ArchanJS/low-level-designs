import java.util.Stack;

public class Handler {
    private Stack<EditorMemento> history;
    public Handler(){
        this.history=new Stack<>();
    }
    public void saveState(TextEditor editor){
        history.push(editor.save());
    }
    public void undo(TextEditor editor){
        if(!history.empty()){
            history.pop();
            editor.restore(history.empty()?new EditorMemento(""):history.peek());
        }
    }
}
