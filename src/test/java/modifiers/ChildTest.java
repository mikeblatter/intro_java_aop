package modifiers;

import org.junit.Assert;
import org.junit.Test;


public class ChildTest {
    @Test
    public void tryToUsePrivateProperty() {
        // Test that the created LazySingleton object is always the same
        Assert.assertEquals("", new Child().tryToUsePrivateProperty());
    }

    @Test
    public void publicPropertyAccessible() {
        // Test that the created LazySingleton object is always the same
        Assert.assertEquals("accessibleByEveryone", new Child().accessibleByEveryone);
    }

    @Test
    public void tryToUseProtectedProperty() {
        // Test that the created LazySingleton object is always the same
        Assert.assertEquals("onlyChildClassCanAccessProperty", new Child().tryToUseProtectedProperty());
    }
}
