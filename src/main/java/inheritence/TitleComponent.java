package inheritence;

public class TitleComponent extends Component {
    public TitleComponent(String title) {
        super("<h2>" + title + "</h2>");
    }

    /* Uncomment to see syntax error, final methods/properties cannot be overridden
    @Override
    public void method() {

    }*/
}
