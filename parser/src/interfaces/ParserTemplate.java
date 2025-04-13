package interfaces;

public abstract class ParserTemplate {
    private void openFile(){
        System.out.println("Opening file");
    }
    private void closeFile(){
        System.out.println("Closing file");
    }
    public abstract void parse(String content);

    public void parseFile(String content){
        this.openFile();
        this.parse(content);
        this.closeFile();
    }
}
