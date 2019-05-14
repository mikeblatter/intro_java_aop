import org.junit.Test;
import org.junit.Assert;

import static java.lang.System.identityHashCode;


public class LazySingletonTest {
    @Test
    public void sameInstance() {
        // Test that the created LazySingleton object is always the same
        Assert.assertEquals(identityHashCode(LazySingleton.getInstance()), identityHashCode(LazySingleton.getInstance()));
    }
}
