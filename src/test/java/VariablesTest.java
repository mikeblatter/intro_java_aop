import org.junit.Test;
import org.junit.Assert;

public class VariablesTest {
    @Test
    public void conversionOfStringToInteger() {
        Assert.assertEquals(Integer.valueOf(1),  Variables.convertStringToInteger("1"));
    }

    // Expect an exception, since blah isn't a number
    @Test(expected = NumberFormatException.class)
    public void conversionOfStringToIntegerCausingError() {
        Variables.convertStringToInteger("blah");
    }
}
