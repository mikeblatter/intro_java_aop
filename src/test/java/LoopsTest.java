import org.junit.Test;
import org.junit.Assert;


public class LoopsTest {
    @Test
    public void sumForLoop() {
        // Reason for valueOf https://stackoverflow.com/questions/17468364/can-assertequalslong-integer-succeed
        Assert.assertEquals(Integer.valueOf(6), new Loops().sumForLoop());
    }

    @Test
    public void sumAnotherForLoop() {
        Assert.assertEquals(Integer.valueOf(6), new Loops().sumAnotherForLoop());
    }

    @Test
    public void sumLoopWithContinue() {
        Assert.assertEquals(Integer.valueOf(5), new Loops().sumLoopWithContinue());
    }

    @Test
    public void sumLoopWithBreak() {
        Assert.assertEquals(Integer.valueOf(1), new Loops().sumLoopWithBreak());
    }

    @Test
    public void whileForLoop() {
        Assert.assertEquals(Integer.valueOf(6), new Loops().whileForLoop());
    }
}
