package abstract_class;

import org.junit.Test;
import org.junit.Assert;

public class ParagraphComponentTest {
    @Test
    public void testRender() {
        ParagraphComponent paragraphComponent = new ParagraphComponent("content");
        Assert.assertEquals("<p>content</p>",  paragraphComponent.render());
    }
}
