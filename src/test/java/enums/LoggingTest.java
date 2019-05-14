package enums;

import org.junit.Test;
import org.junit.Assert;

public class LoggingTest {
    @Test
    public void logLevelTest() {
        Logging logging = new Logging(LogLevel.HIGH);
        Assert.assertEquals(LogLevel.HIGH, logging.logLevel);
    }
}
