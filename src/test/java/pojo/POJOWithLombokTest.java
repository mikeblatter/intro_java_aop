package pojo;

import org.junit.Test;
import org.junit.Assert;


public class POJOWithLombokTest {
    @Test
    public void getFirstName() {
        POJOWithLombok pojoWithLombok = new POJOWithLombok("firstName", "lastName");
        Assert.assertEquals("firstName", pojoWithLombok.getFirstName());
    }

    @Test
    public void getLastName() {
        POJOWithLombok pojoWithLombok = new POJOWithLombok("firstName", "lastName");
        Assert.assertEquals("lastName", pojoWithLombok.getLastName());
    }

    @Test
    public void setFirstName() {
        POJOWithLombok pojoWithLombok = new POJOWithLombok("firstName", "lastName");
        pojoWithLombok.setFirstName("anotherFirstName");

        Assert.assertEquals("anotherFirstName", pojoWithLombok.getFirstName());
    }

    @Test
    public void setLastName() {
        POJOWithLombok pojoWithLombok = new POJOWithLombok("firstName", "lastName");
        pojoWithLombok.setLastName("anotherLastName");

        Assert.assertEquals("anotherLastName", pojoWithLombok.getLastName());
    }
}

