package interfaces;

import java.util.ArrayList;


public class ParagraphComponent implements ComponentInterface {
    private ArrayList<ComponentInterface> children = new ArrayList<>();
    private String content;

    public ParagraphComponent(String content) {
        this.content = content;
    }

    public String render() {
        return "<p>" + this.content + "</p>";
    }
}
