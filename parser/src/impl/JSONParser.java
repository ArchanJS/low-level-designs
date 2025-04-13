package impl;

import interfaces.ParserTemplate;

public class JSONParser extends ParserTemplate {
    @Override
    public void parse(String content) {
        System.out.println("Parsing JSON: "+content);
    }
}
