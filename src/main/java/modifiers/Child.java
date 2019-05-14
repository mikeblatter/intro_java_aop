package modifiers;

public class Child extends Parent {
    public String tryToUsePrivateProperty() {
        return "";
        // Comment out above and uncomment below to see syntax error
        //return super.inAccessibleProperty;
    }

    // Use public func getting private property, common pattern
    public String getInaccessibleProperty() {
        return super.getInaccessibleProperty();
    }

    public String tryToUseProtectedProperty() {
        return super.onlyChildClassCanAccessProperty;
    }

    public String tryToUsePublicProperty() {
        return super.accessibleByEveryone;
    }
}
