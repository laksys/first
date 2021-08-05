package in.laksys;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {
    public AppTest(){
        System.out.println("AppTest constructed....");
    }
    @Test
    public void firstTest(){
        Assert.assertEquals(4, App.gcd(12,28));
    }
    @Test
    public void secondTest(){
        Assert.assertTrue(App.isPrime(19));
    }
}
