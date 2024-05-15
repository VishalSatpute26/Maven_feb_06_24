package TestNGAnnotation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRunExample
{
    @Test
    public void verifyLogin()
    {
        Assert.assertTrue(true);
        System.out.println("verify page");
    }
    @Test(dependsOnMethods = "verifyLogin",alwaysRun = true)
    public void verifyHomePage()
    {
        System.out.println("Verify Home page");
    }
}
