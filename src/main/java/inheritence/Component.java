package inheritence;

public class Component {
    protected String content;

    public Component(String content) {
        this.content = content;
    }

    public final void method() {
        // This method cannot be overridden
    }

    public String render() {
        return content;
    }
}
