package PriorityEx;

import failedTestScriptExecution.RetryFailedScript;
import net.bytebuddy.build.Plugin;
import org.testng.Assert;
import org.testng.annotations.Test;

public class demopriority
{
   @Test(priority = -7)
   public void priorityExample_Z()
   {
       Assert.assertTrue(false);
       System.out.println("priority demo Z");
   }
    @Test
    public void priorityExample_C()
    {
        System.out.println("priority demo C");
    }
    @Test(priority = 1)
    public void priorityExample_L()
    {
        System.out.println("priority demo L");
    }
    @Test(priority = 2)
    public void priorityExample_A()
    {
        Assert.assertTrue(false);
        System.out.println("priority demo A");
    }
    @Test(priority = 3)
    public void priorityExample_W()
    {
        System.out.println("priority demo W");
    }
    @Test(priority = 4)
    public void priorityExample_B()
    {
        System.out.println("priority demo B");
    }
    @Test(priority = 5)
    public void priorityExample_G()
    {
        Assert.assertTrue(false);
        System.out.println("priority demo G");
    }
}
