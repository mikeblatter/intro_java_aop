package interfaces;

import java.util.ArrayList;


public class TitleComponent implements ComponentInterface {
    private ArrayList<ComponentInterface> children = new ArrayList<ComponentInterface>();
    private String content;

    public TitleComponent(String content) {
        this.content = content;
    }

    public String render() {
        return "<h2>" + this.content + "</h2>";
    }
}
