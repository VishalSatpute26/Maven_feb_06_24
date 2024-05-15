package TestNGAnnotation;

import org.testng.annotations.*;

public class BeforeAfterClassExample
{
    @BeforeTest
    public void beforeTestMethod()
    {
        System.out.println("before class method for BeforeAfterClassExample class");
    }
    @AfterTest
    public void AfterTestMethod()
    {
        System.out.println("after test method for BeforeAfterClassExample class");
    }
    @Test
    public void verifyTestCase_1()
    {
        System.out.println("verify test case 1");
    }
    @Test
    public void verifyTestCase_2()
    {
        System.out.println("verify test case 2");
    }
}
