package TestNGAnnotation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroupExample
{
    @Test(groups = "smoke")
    public void verifyLoginHomepage()
    {
        Assert.assertTrue(true);
        System.out.println("verify new home login");
    }
    @Test(dependsOnGroups = "smoke")
    public void LMS()
    {
        System.out.println("Loan Management System");
    }
    @Test(enabled = true)
    public void verifyCMS()
    {
        System.out.println("card management System");
    }
}
