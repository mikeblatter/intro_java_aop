package abstract_class;

public class TitleComponent extends AbstractComponent {
    private String title;

    public TitleComponent(String title) {
        this.title = title;
    }

    @Override
    public String render() {
        return "<h2>" + title + "</h2>";
    }
}
