package interfaces;

import java.util.ArrayList;


public interface ComponentInterface {
    ArrayList<ComponentInterface> children = new ArrayList<ComponentInterface>();
    String render();
}
