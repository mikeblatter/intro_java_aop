package interfaces;

import java.util.ArrayList;


public interface ComponentInterface {
    ArrayList<ComponentInterface> children = new ArrayList<>();
    String render();
}
