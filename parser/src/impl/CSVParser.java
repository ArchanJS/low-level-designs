package impl;

import interfaces.ParserTemplate;

public class CSVParser extends ParserTemplate {
    @Override
    public void parse(String content) {
        System.out.println("Parsing CSV: "+content);
    }
}
