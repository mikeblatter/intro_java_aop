package modifiers;

public class Parent {
    private String inAccessibleProperty = "inAccessibleProperty";
    protected String onlyChildClassCanAccessProperty = "onlyChildClassCanAccessProperty";
    public String accessibleByEveryone = "accessibleByEveryone";

    protected String getInaccessibleProperty() {
        return inAccessibleProperty;
    }
}
