import org.junit.Test;
import org.junit.Assert;

public class GenericTupleTest {
    @Test
    public void keyValuePair() {
        GenericTuple<String, Integer> t = new GenericTuple<>("foo", 1);
        Assert.assertEquals("foo: '1'", t.toString());
    }
}
