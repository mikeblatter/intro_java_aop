package abstract_class;

import org.junit.Test;
import org.junit.Assert;


public class TitleComponentTest {
    @Test
    public void testRender() {
        TitleComponent titleComponent = new TitleComponent("title");
        Assert.assertEquals("<h2>title</h2>",  titleComponent.render());
    }
}
