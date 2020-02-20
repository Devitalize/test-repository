import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass{
    @Test
    public void testGetClassNumber(){
        Assert.assertTrue("getClassNumber < 45", this.getClassNumber()>45);
    }
}
