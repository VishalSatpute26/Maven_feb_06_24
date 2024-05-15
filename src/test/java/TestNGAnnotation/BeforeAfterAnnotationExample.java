package TestNGAnnotation;

import org.testng.annotations.*;

public class BeforeAfterAnnotationExample
{
    @BeforeSuite
    public void beforeSuiteMethod()
    {
        System.out.println("Before Suite");
    }
    @AfterSuite
    public void afterSuiteMethod()
    {
        System.out.println("After Suite");
    }
    @BeforeTest
    public void beforeTestMethod()
    {
        System.out.println("before test");
    }
    @BeforeClass
    public void beforeClassMethod()
    {
        System.out.println("before class");
    }
    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("before method");
    }
    @Test
    public void testMethod1()
    {
        System.out.println("Test case 1");
    }
    @Test
    public void testMethod2()
    {
        System.out.println("Test case 2");
    }
    @AfterMethod
    public void afterMethod()
    {
        System.out.println("after method");
    }
    @AfterClass
    public void AfterTestMethod()
    {
        System.out.println("after class");
    }
    @AfterTest
    public void afterTestMethod()
    {
        System.out.println("after test demo");
    }

}
