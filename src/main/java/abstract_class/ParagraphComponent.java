package abstract_class;

public class ParagraphComponent extends AbstractComponent {
    private String content;

    public ParagraphComponent(String content) {
        this.content = content;
    }

    @Override
    public String render() {
        return "<p>" + content + "</p>";
    }
}
