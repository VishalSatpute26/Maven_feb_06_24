package TestNGAnnotation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodExample
{
    @Test
    public void verifyLogin()
    {
        //Assert.assertTrue(false);
        System.out.println("verify page");
    }
    @Test(dependsOnMethods = "verifyLogin")
    public void verifyHomePage()
    {
        System.out.println("Verify Home page");
    }
    @Test
    public void verifyFundTrasfer()
    {
        System.out.println("verify Fund");
    }
}
