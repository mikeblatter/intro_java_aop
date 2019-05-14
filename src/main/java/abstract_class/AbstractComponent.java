package abstract_class;

import java.util.ArrayList;


public abstract class AbstractComponent {
    // mutable (changeable) array of children
    // ArrayList is mutable, List isn't
    protected ArrayList<AbstractComponent> children = new ArrayList<AbstractComponent>();

    public abstract String render();
}
