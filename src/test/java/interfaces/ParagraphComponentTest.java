package interfaces;

import org.junit.Test;
import org.junit.Assert;


public class ParagraphComponentTest {
    @Test
    public void name() {
        ParagraphComponent component = new ParagraphComponent("content");
        Assert.assertEquals("<p>content</p>", component.render());
    }
}
