public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");
        TextEditor editor = new TextEditor();
        Handler handler = new Handler();
        editor.write("first text");
        handler.saveState(editor);
        editor.write("second text");
        handler.saveState(editor);
        handler.undo(editor);
        System.out.println(editor.getContent());
    }
}