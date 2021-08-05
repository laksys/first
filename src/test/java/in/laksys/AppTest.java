package in.laksys;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {
    @Test
    public void firstTest(){
        Assert.assertEquals(4, App.gcd(12,28));
    }
}
