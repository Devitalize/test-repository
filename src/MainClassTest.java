import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {
    @Test
    public void testGetClassString() {
        String podstrokahello = "hello";
        String podstrokaHello = "Hello";
        Assert.assertTrue("getClassString not contain 'Hello'/'hello'",
                getClassString().contains(podstrokahello) || getClassString().contains(podstrokaHello));
    }
}

