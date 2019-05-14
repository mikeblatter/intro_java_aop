package inheritence;

import org.junit.Test;
import org.junit.Assert;

public class TitleTest {
    @Test
    public void name() {
        TitleComponent component = new TitleComponent("title");
        Assert.assertEquals("<h2>title</h2>", component.render());
    }
}
