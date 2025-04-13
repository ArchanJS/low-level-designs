public class TextEditor {
    private String content;
//    public TextEditor(String content){
//        this.content=content;
//    }
    public void write(String text){
        this.content=text;
    }
    public String getContent(){
        return this.content;
    }
    public EditorMemento save(){
        return new EditorMemento(this.content);
    }
    public void restore(EditorMemento memento){
        this.content=memento.getContent();
    }
}
