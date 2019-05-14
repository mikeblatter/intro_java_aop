package pojo;

import org.junit.Test;
import org.junit.Assert;

public class PlainPOJOTest {
    @Test
    public void getFirstName() {
        PlainPOJO plainPOJO = new PlainPOJO("firstName", "lastName");
        Assert.assertEquals("firstName", plainPOJO.getFirstName());
    }

    @Test
    public void getLastName() {
        PlainPOJO plainPOJO = new PlainPOJO("firstName", "lastName");
        Assert.assertEquals("lastName", plainPOJO.getLastName());
    }

    @Test
    public void setFirstName() {
        PlainPOJO plainPOJO = new PlainPOJO("firstName", "lastName");
        plainPOJO.setFirstName("anotherFirstName");

        Assert.assertEquals("anotherFirstName", plainPOJO.getFirstName());
    }

    @Test
    public void setLastName() {
        PlainPOJO plainPOJO = new PlainPOJO("firstName", "lastName");
        plainPOJO.setLastName("anotherLastName");

        Assert.assertEquals("anotherLastName", plainPOJO.getLastName());
    }
}
