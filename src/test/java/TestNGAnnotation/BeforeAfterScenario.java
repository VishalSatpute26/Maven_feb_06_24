package TestNGAnnotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterScenario
{
    public WebDriver driver;

    @BeforeMethod(groups = "sanity")
    public void beforeMethodExample()
    {
        System.setProperty("WebDriver.chrome.driver", "D:\\SDET CLASSES\\setup_chromedriver\\chromedriver-win64\\chromedriver.exe");
         driver=new ChromeDriver();
    }

    @Test
     public void amazonMethod()
    {
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
    }

    @Test(groups = "sanity")
    public void openFacebook()
    {
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

    }

    @AfterMethod(groups = "sanity")
    public void afterMethodAnnotation()
    {
        driver.close();
    }
}
